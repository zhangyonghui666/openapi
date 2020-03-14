package com.qianfeng.openapi.gateway.filer;

//


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * todo: 我们单独又写这个过滤器的原因是：
 *        因为我们后面过滤器不是每个请求都可能会用到,而且顺序可能有变化,但是不管请求怎样，都需要记录日志,所以我们单独写这个过滤器,让它是第一个
 *
 * @Author jackiechan
 */
@Component
public class LogPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return -200;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        //获取请求的时间
        long currentTimeMillis = System.currentTimeMillis();

        RequestContext currentContext = RequestContext.getCurrentContext();
        //实际上以下数据在最终的过滤器中都可以获取到,实际上获取不到的是接收请求的时间而已
//        HttpServletRequest request = currentContext.getRequest();
//        Map<String, String[]> parameterMap = request.getParameterMap();//获取所有所有的请求参数
//        String remoteAddr = request.getRemoteAddr();

        // 将请求的时间receiveTime，存入到currentContext中；
        currentContext.put("receiveTime", currentTimeMillis);

        return null;
    }
}
