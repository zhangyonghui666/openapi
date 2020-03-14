package com.qianfeng.openapi.gateway.filer;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qianfeng.openapi.gateway.constans.SystemParameter;
import com.qianfeng.openapi.gateway.feign.RedisService;
import com.qianfeng.openapi.gateway.utils.Md5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

/**
 * todo : 这是 签名校验 的过滤器
 *      它是一个前置过滤器，位置应该在 公共参数过滤器（filterOrder为1）之后；
 */
@Component
public class SignFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(SignFilter.class);
    @Autowired
    private RedisService redisService;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        Map<String, Map<Object, Object>> allApiInfoMap = SystemParameter.allApiInfoMap;
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        String method = request.getParameter("method");

        // 获取到ApiInfo—接口的信息，map类型的数据；
        Map<Object, Object> map = allApiInfoMap.get(SystemParameter.REDISAPIPRE + method);//获取当前接口的map

        // 从用户的请求中，获取该请求需要经过的所有的过滤器，来判断当前过滤器是否启用：
        String filters = (String) map.get("filters");

       // 判断当前过滤器是否启用：（如果filters包含当前的过滤器，则返回true，代表启用当前过滤器；否则，不启用）
        return context.sendZuulResponse() && filters != null && filters.contains(getClass().getName());

    }


    @Override
    public Object run() throws ZuulException {

        //校验签名
        //按照我们的规则来进行校验
        //规则, 客户端将传递的参数按照顺序排序后拼接上它的key,然后生成md5值,然后将md5值作为请求参数在一起传过来,(注意key不能传递过来,因为我们服务起是知道的)
        //服务器规则 获取到请求参数后,去掉sign数据,然后将剩下的内容按照规则排序后拼接上它对应的key,然后生成md5值,再和用户传递的md5值进行比较
        //key如何获取,我们服务器不可能使用同一个key,所以一个用户一个,所以我们需要知道当前的用户是谁
        //如何知道当前的用户是谁,我们要求用户的参数中必须说明它是谁,我们要求用户通过app_key传递
        //我们规定请求中签名参数的name叫sign
        //先获取用户传递的签名,用于比较用的
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        //todo:第1步：用户的签名值、sign值
        String sign = request.getParameter("sign");

        //todo:第2步：获取所有的参数名,并排序
        Enumeration<String> names = request.getParameterNames();
        TreeMap<String, String> map = new TreeMap<>();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            if (name.equalsIgnoreCase("sign")) {
                continue;
            }
            //将参数和对应的值放入到有序map中
            map.put(name, request.getParameter(name));
        }

        //todo:第3步：获取到key;
        //签名还需要当前应用的key
        //我们必须知道当前的应用是谁,所以我们规定请求参数中必须有一个appkey这个参数,它的值就是应用的id
        //我们必须知道 key 放在哪里,我们可以 以应用id为key 放入到redis中

        // 当前应用的id: String appkey=...
        String appkey = request.getParameter("appkey");


        //在redis中应用信息到底是什么结构的数据 string? hash? set? zset? list? geo?
        //我们分析了一下 一个应用的信息可能会有好多个不同的字段,只不过我们现在可能已知的有密码,名字,所以我们可以使用hash

        // 获取到当前应用的信息：appinfoMap；
        Map<Object, Object> appinfoMap = redisService.hgetAll(SystemParameter.REDISAPPKEYPRE + appkey);


        //我们规定 密码（key）在redis中的appinfoMap中的属性名为appsecret
        // 获取到key:
        String appsecret = (String) appinfoMap.get("appsecret");

        // todo:第4步：进行md5加密，生成签名signature
        String signature = Md5Util.md5Signature(map, appsecret);//对传递的参数进行签名
        logger.error("算出来的签名是: " + signature);

        //todo:第5步：判断用户传递的签名 和 我们算出来的签名是否一致
        if (!signature.equalsIgnoreCase(sign)) {
            context.setSendZuulResponse(false);
            context.setResponseBody("签名校验失败");
            context.getResponse().setContentType("text/html;charset=utf-8");
        } else {

            // 签名校验成功；
            //  以签名的值作为key，在redis中随便放一个value值；
            //      主要是用来在CheckSignUsedFilter过滤器中，需要从Redis尝试去取这个key的value，查看是否为空，以判断这个签名之前是否已经有过；
            redisService.set(signature, "dasdadasd", 60000);
        }
        return null;
    }


}
