package com.qianfeng.openapi.gateway.filer;

//


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qianfeng.openapi.gateway.constans.SystemParameter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * todo: 时间戳过滤器；（时间戳：一定的时间范围内）
 *          用于判断请求中的时间和当前服务器的时间是否在指定阈值范围内,比如我们要求1分钟
 */
@Component
public class TimeStampFilter extends ZuulFilter {
    // 设置时间格式：
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 5;
    }

    @Override
    public boolean shouldFilter() {
        Map<String, Map<Object, Object>> allApiInfoMap = SystemParameter.allApiInfoMap;
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String method = request.getParameter("method");

        Map<Object, Object> map = allApiInfoMap.get(SystemParameter.REDISAPIPRE + method);//获取当前接口的map

        String filters = (String) map.get("filters");//获取当前过滤器需要经过的filters
        //return false;
        return context.sendZuulResponse() && filters != null && filters.contains(getClass().getName());

    }

    @Override
    public Object run() throws ZuulException {
        //todo：1）获取用户传递的时间
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

//      timestamp是用户请求中的一个参数，
        String timestamp = request.getParameter("timestamp");

        //todo: 2) 获取服务器现在的时间
        try {
            Date userdate = simpleDateFormat.parse(timestamp);
            //两者的毫秒值不超过我们的阈值
            Date currentDate = new Date();

//         todo: 3) 算出时间差
            long sub = currentDate.getTime() - userdate.getTime();

     // todo: 4）判断时间差：
            //小于0代表来自于未来,大于60000代表来自于过去超过一分钟了都不符合我们的要求
            if (sub < 0 || sub > 60000) {
                context.setSendZuulResponse(false);
                context.getResponse().setContentType("text/html;charset=utf-8");
                context.setResponseBody("时间超出范围");
            }
        } catch (ParseException e) {
            e.printStackTrace();
            context.setSendZuulResponse(false);
            context.getResponse().setContentType("text/html;charset=utf-8");
            context.setResponseBody("时间格式不正确");
        }

        return null;
    }
}
