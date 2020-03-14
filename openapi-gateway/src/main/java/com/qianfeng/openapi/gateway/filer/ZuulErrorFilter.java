package com.qianfeng.openapi.gateway.filer;

//

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * todo: 前言——Zuul里边有四大种过滤器：pre前置过滤器、Route路由过滤器、Post后置过滤器、Error错误过滤器；
 *     这里的这个是Error错误过滤器；
 */
@Component
public class ZuulErrorFilter extends ZuulFilter {

    /**
     *todo: 定义过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE; // 错误过滤器；
    }

    /**
     * todo: 定义该过滤器的顺序：
     * @return
     */
    @Override
    public int filterOrder() {
        // 数字越小，优先级越高；
        return 0;
    }

    /**
     * todo : 是否启用该过滤器；
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * todo: 该过滤器的逻辑部分：
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.err.println("shoudao异常了");
        RequestContext.getCurrentContext().setResponseBody("dasdasdadasdadasd");
        return null;
    }
}
