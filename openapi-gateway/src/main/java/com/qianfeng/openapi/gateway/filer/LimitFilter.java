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
 *  todo: 限定用户对某个接口的访问次数的过滤器
 */
@Component
public class LimitFilter extends ZuulFilter {
    @Autowired
    private RedisService redisService;

    /**
     * todo: 过滤器类型：前置过滤器；
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * todo: 过滤器顺序：50，其实这个前置过滤器的优先级是多少无所谓，因为它与其他的前置过滤器没有什么关联
     * @return
     */
    @Override
    public int filterOrder() {
        return 50;
    }

//    @Override
//    public boolean shouldFilter() {
//        //除了因为其他校验手段不通过导致的不执行该过滤器之外,我们这个过滤器并不是一定是每个接口每次请求都过滤
//        //
//        RequestContext currentContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = currentContext.getRequest();
//        String method = request.getParameter("method");//这个就是用户传递的要请求的地址
//        Map<Object, Object> map = redisService.hgetAll(SystemParameter.REDISAPIPRE + method);
//        currentContext.put("apiinfomap", map);//提前存起来,这样后面就不需要再次调用redis获取数据了
//        return RequestContext.getCurrentContext().sendZuulResponse()&&"1".equalsIgnoreCase(map.get("limit").toString());
//    }

    /**
     * todo: 因为不是所有的服务模块都会限定调用次数，对于一些不限定调用次数的服务模块，则返回false，即，不启用该过滤器；
     *          一，所以，我们首先需要判断，对这个服务模块的调用 需要不需要过滤；
     *              如何判断呢：首选Redis，即，将每一个服务模块的每一个接口的限定调用次数，存入到Redis中，然后我们这个过滤器再去redis取；
                二，改进,因为我们的服务模块、服务模块的接口们，没有非常多,所以是没有必要每个请求都去查询redis的,会浪费资源,所以我们提前把所有的服务模块的api信息都加载到zuul中,已经随着程序启动放入到一个map中,此处直接获取即可
     */
    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        //1》：这个是用户传递的要请求的 服务模块的接口 的地址 （map类型的数据）
//            【从网关本地的缓存中—（一个ConcurrentHashMap集合中）去取的数据；】
        String method = request.getParameter("method");
        Map<Object, Object> map = SystemParameter.allApiInfoMap.get(SystemParameter.REDISAPIPRE + method);

        //此处又Put保存一次的原因是：为了后面 路由过滤器RoutingFilter 需要该数据的时候，还需要再去取一次请求参数,再去map中查
        currentContext.put("apiinfomap", map);

        // 从用户的请求中，获取该请求需要经过的所有的过滤器，来判断当前过滤器是否启用：
        // String filters = (String) map.get("filters");//获取当前过滤器需要经过的filters
        //return RequestContext.getCurrentContext().sendZuulResponse()&&"1".equalsIgnoreCase(map.get("limit").toString())&& filters != null && filters.contains(getClass().getName());


        //2》 我们规定，"1"表示该服务模块有限定次数，要用该过滤器进行拦截
        return RequestContext.getCurrentContext().sendZuulResponse()&&"1".equalsIgnoreCase(map.get("limit").toString());
//
    }


    /**
     * todo: 执行逻辑部分；判断用户对该服务模块的调用次数是否用完了；
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        String appkey = request.getParameter("appkey");
        String method = request.getParameter("method");

        //执行次数的校验
        //todo: 1）先看看当前用户还剩下多少次;
        //必须得在一个地方保存着次数（Redis）,考虑到我们会有很多个接口,每个接口每个用户的次数都不一样
        //我们使用hash类型 存储执行次数；  key是和用户相关的, filed是和接口相关的,  值和次数相关的
        long result = redisService.hdecr(SystemParameter.REDISAPILIMIEPRE + appkey, method, -1);

        //todo: 2） result< 0，代表已经到达次数限制了,注意不能判断=0 因为=0代表之前是1
        if (result< 0) {
            currentContext.setSendZuulResponse(false);
            currentContext.getResponse().setContentType("text/html;charset=utf-8");
            currentContext.setResponseBody("接口请求此处已经达到上限,请及时充值");
        }
        return null;
    }
}
