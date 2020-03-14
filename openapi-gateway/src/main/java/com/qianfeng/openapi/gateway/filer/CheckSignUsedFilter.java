package com.qianfeng.openapi.gateway.filer;

//


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qianfeng.openapi.gateway.constans.SystemParameter;
import com.qianfeng.openapi.gateway.feign.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * todo: 这个过滤器的作用：  校验 签名 之前是否已经使用过；
 *      只要在一分钟之内，用户进行了重复的请求，导致前后签名一模一样，那么就拒绝处理该请求、返回给用户一个友好提示；
 *      如果超过了一分钟，用户再次发送相同的请求，那么不用去管，因为时间变化了，会导致生成的签名值也变了，那么可以进行前后签名校验；
 */
@Component
public class CheckSignUsedFilter extends ZuulFilter {
    @Autowired
    private RedisService redisService;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 8;
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

        //        return false;
        // return RequestContext.getCurrentContext().sendZuulResponse();
    }


    /**
     * todo : 因为前面还有时间的校验,所以只要不超过一分钟的请求都会放行,那么我们只需要解决这一分钟内的重复请求即可,重复请求意味着参数必须完全一致
     *         那么就意味着sign是不变的,
     *         所以我们只需要判断签名是否出现过即可,我们以签名的值作为key在redis中随便放一个东西,并设置过期时间一分钟，下次只要能取到就代表：一模一样的请求，前面已经发生过一次了；
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        String sign = context.getRequest().getParameter("sign");
        String result = redisService.get(sign);

        if (result != null) {
            context.getResponse().setContentType("text/html;charset=utf-8");
            context.setResponseBody("不要重复发起请求");
            context.setSendZuulResponse(false);
        }
        return null;
    }
}
