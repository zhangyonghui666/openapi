package com.qianfeng.openapi.gateway.filer;

/*
* todo--------------------公共参数---------------------
        在大部分API接口里边都需要传的参数，叫公共参数；公共参数是必填的；
        我们可以在前面定义一个专门判断公共参数有没有填的过滤器 ，把参数拦截，放在前面，即，公共参数过滤器。
        这样我们后面的路由过滤器就只管路由就行了、不用去管这些公共参数的问题了。
                    *
    问题：公共参数今年可能是5个，明年可能是6个，即，公共参数的数量是变化的、动态的；那么怎么写过滤器呢？
                     *
       答：以后记住，但凡是动态的数据，一定是先存放到某个地方，然后再通过代码去取，这样就可以解决动态参数的问题了；
      *   比如这里：先将公共参数放入到Redis中，再从redis中去取就行了。
      *   公共参数不需要和用户进行交互，数据也不是一直变化，所以存入到Redis中，如果服务模块的接口发生变化了，则进行更新就行了；

* */


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
import java.util.Set;

/**
 *
 * todo: 这个过滤器主要是用来对 公共的必须传递的参数 进行动态过滤，即，判断用户请求中 有没有传 公共参数！
 *   因为这个公共参数是动态的、参数的数量可能是变化的，所以应该先将参数放入到Redis中，
 *   再从Redis中去取出来，然后与用户的请求参数进行比对，看用户有没有传公共参数。
 */
@Component
public class ParameterFilter  extends ZuulFilter {
    @Autowired
    private RedisService redisService;

    /**
     * todo : 定义该过滤器的类型
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;  // 前置过滤器
    }

    /**
     * todo : 定义该过滤器的顺序；
     * @return
     */
    @Override
    public int filterOrder() {
        // 数字越大，优先级越低；数字越小，优先级越高；
        // 因为这个是专门用来判断公共参数的过滤器，所以应该放到路由过滤器等需要公共参数的过滤器的前面，所以数字应该较小；
        return 1;
    }

    /**
     * todo : 这个过滤器是否生效；
     * @return
     */
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

        return context.sendZuulResponse() && filters != null && filters.contains(getClass().getName());
    }

    /**
     * todo: 执行逻辑，判断用户请求中是否有公共参数；
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //我们需要判断参数有没有传递
        //实际上就是查看一下这个参数的值有没有
        //参数是什么,我们发现是动态的
        //每次需要获取一下看看当前需要过滤什么参数
        //因为我们的zuul是集群,所以将数据放到zuul之外的地方,redis就可以
        //参数在redis中存放的结构是什么
        //关于key是什么,此处我们是内部校验的,和用户身份已经请求地址无关,所以这个key我们可以直接在项目定义固定值
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        //todo: 第1步：从redis中获取公共参数们，是一个set集合
        Set<String> commonsparameters = redisService.members("commonsparameters");

        // todo: 第2步：遍历集合，得到公共参数中的每一个参数：
        for (String paramatername : commonsparameters) {

            // todo: 第3步：判断用户请求中（request），是否包含公共参数：如果不包含，则返回值为null；
            String parameter = request.getParameter(paramatername);

            //todo: 第4步：如果公共参数没传递,
            if (parameter == null || "".equalsIgnoreCase(parameter.trim())) {

                // 则，拦截请求，返回给用户一个友好提示：
                currentContext.getResponse().setContentType("text/html;charset=utf-8");
                currentContext.setResponseBody("参数 " + paramatername + "的值不能为空");


                /**todo: 拦截请求后，去减少后边执行的代码：
                 *   从zuul网关的源码剖析中可以看到：
                 *      这里拦截请求后，后面的过滤器、代码并不是就不执行了,还是会执行，还是会分发请求给相应的服务模块，只不过是，不会给用户正确的响应罢了；
                 *      这是zuul网关的设计的一个不太妥当的地方，因为会拦截请求之后、就没有必要再去往后边执行了，这样延长了对该请求的响应时间、也浪费了系统的资源；
                 *   但是我们可以通过一些设置，来尽量去减少执行的代码：
                 *      我们在这里设置了 currentContext.setSendZuulResponse(false);
                 *      这样，当请求到达了路由过滤器RoutingFilter这里，shouldFilter()方法会判断sendZuulResponse()方法的返回值，
                 *      返回值为false，则不再执行路由过滤器，自然也不会去分发请求到相应的服务模块中.
                 *      但该请求还是会继续经过一些过滤器，但起码还是起到了减少执行了后边的一部分代码的作用； */
                currentContext.setSendZuulResponse(false);
            }
        }

        return null;
    }
}
