package com.qianfeng.openapi.gateway.filer;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qianfeng.openapi.gateway.feign.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

/**
 * todo: 路由过滤器，用于解析用户的请求、转发到相应的服务模块中
 */
@Component
public class RoutingFilter extends ZuulFilter {

    @Autowired
    private RedisService redisService;


    /**
     * todo: filterType代表：定义该过滤器的类型
     * PRE 前置过滤器
     * ROUTING  路由过滤器
     * POST 后置过滤器
     * ERROR  错误过滤器
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE; // 这里选择了前置过滤器；
    }


    /**
     * todo: filterOrder代表：定义该过滤器的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        //优先级：数字越大，优先级越低；
        return 100;
    }


    /**
     * todo: shouldFilter代表这个过滤器是否生效 ; true代表生效，false代表不生效。
     * 那么什么情况下使用不生效呢，不生效干嘛还要写这个filter类呢？
     * 其实是有用的，有时我们会动态的决定让不让一个filter生效，
     * 譬如我们可能根据Request里是否携带某个参数来判断是否需要生效，或者我们需要从上一个filter里接收某个数据来决定，
     */
    @Override
    public boolean shouldFilter() {
        //如果前面已经拦截了请求（这里指ParameterFilter过滤器）,
        // 则没有必要让当前的过滤器继续执行；
        return RequestContext.getCurrentContext().sendZuulResponse();
    }



    /**
     * todo: Run方法 , 这个是主要的处理逻辑的地方，我们做权限控制、日志等都是在这里。
     */
    @Override
    public Object run() throws ZuulException {

        // 这个RequestContext指的是：zuul网关的context上下文；源码：package com.netflix.zuul.context;
        RequestContext currentContext = RequestContext.getCurrentContext();

        HttpServletRequest request = currentContext.getRequest();

        //todo:1) 获取用户传递的请求中，要请求的 服务模块的接口 的地址 （map类型的数据）
        //（PS：因为LimitFilter类中已经执行了currentContext.put("apiinfomap", map);这一行代码，就是为了方便这里来直接取数据。）
        Map<Object,Object> map = (Map<Object, Object>) currentContext.get("apiinfomap");

        //如果（要请求的服务模块的接口的）地址数据没毛病：
        if (map != null && map.size() >= 2) {

            System.err.println(map);

            //todo: 2）根据数据map，查看用户需要请求哪个服务模块（serviceId），并告诉网关zuul：
            currentContext.put(FilterConstants.SERVICE_ID_KEY, map.get("serviceId"));

            //todo:3) 参数传递的问题：rest风格参数 转 普通格式参数
            /*
              我们发现: 普通的请求参数会被直接携带过去,只要我们的参数名和接口中的参数名是一致就可以；
               但是，rest风格的参数如何传递,（Rest风格：/test1/{name})
               我们要求,所有的rest参数都需要通过对应的参数名以普通方式传递过来 , (普通方式：name=zhangkai&age=30)
            */

            // 3.1）这是url的样子：/test/test1/{name}/{age}；我们的目的是将其替换为：/test/test1/name=zhangkai&age=30
            String url = (String) map.get("url");
            System.err.println("替换前: " + url);

            //3.2）获取所有的参数名：
            Enumeration<String> names = request.getParameterNames();
            while (names.hasMoreElements()) {
                //获取每一个参数名：（这里指的是形参，不是真的字符串）
                String name = names.nextElement();

                //一点小问题： "{"+name+"}"，
                // 3.3）更新URL,替换参数： （这里需要转义，否则会抛出正则表达式的异常；）
                url = url.replaceAll("\\{" + name + "\\}",request.getParameter(name));
            }
            System.err.println("替换后: " + url);

            //todo: 4）告诉网关zuul，用户要请求的服务模块的什么地址（requestURI）:
            currentContext.put(FilterConstants.REQUEST_URI_KEY, url);
        }

        // （要请求的服务模块的接口的）地址数据有毛病：
        else {
            //此处应该抛出一个异常(不是真的把异常给用户),返回错误数据给用户
            currentContext.getResponse().setContentType("text/html;charset=utf-8");
            currentContext.setResponseBody("method参数不正确");

            //拦截请求
            currentContext.setSendZuulResponse(false);
        }
        return null;
    }

//    @Override
//    public Object run() throws ZuulException {
//        //按照我们预先定义好的规则来判断用户想要去哪
//        //我们规定用户必须通过method这个参数来传递要请求的接口
//        //先获取用户传递的关键method过来
//        //获取请求对象
//        RequestContext currentContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = currentContext.getRequest();
//        String method = request.getParameter("method");//这个就是用户传递的要请求的地址
//        if (method == null) {
//            //TODO 此处应该抛出一个异常(不是真的把异常给用户),返回错误数据给用户
//            currentContext.setResponseBody("需要传递method参数");
//            currentContext.setSendZuulResponse(false);//拦截请求
//            //后续更新,我们前面添加了一个过滤器 会判断这个method有没有传递,到当前过滤器的时候一定是传递的
//        } else {
//            //根据这个名字去redis中获取数据
//            Map<Object, Object> map = redisService.hgetAll(SystemParameter.REDISAPIPRE + method);
//            if (map != null && map.size() >= 2) {
//                //代表我们获取到了数据
//                System.err.println(map);
//                currentContext.put(FilterConstants.SERVICE_ID_KEY, map.get("serviceId"));//告诉网关我们要请求哪个服务
//                //参数传递的问题
//                //我们发现 普通的请求参数会被直接携带过去,只要我们的参数名和接口中的参数名是一致就可以
//                //rest风格的参数如何传递,我们要求,所有的rest参数都需要通过对应的参数名以普通方式传递过来 name=zhangkai&age=30
//                String url = (String) map.get("url");// /test/test1/{name}/{age}
//                System.err.println("替换前: " + url);
//                Enumeration<String> names = request.getParameterNames();//获取参数名
//                while (names.hasMoreElements()) {
//                    String name = names.nextElement();//获取每一个参数名
//                    //"{"+name+"}"
//                    url = url.replaceAll("\\{" + name + "\\}", request.getParameter(name));//替换参数
//                }
//                System.err.println("替换后: " + url);
//                currentContext.put(FilterConstants.REQUEST_URI_KEY, url);//告诉网关我要请求对应服务的什么地址
//            } else {
//                //参数名不对
//                //TODO 此处应该抛出一个异常(不是真的把异常给用户),返回错误数据给用户
//                currentContext.setResponseBody("method参数不正确");
//                currentContext.setSendZuulResponse(false);//拦截请求

//            }
//        }
//        return null;
//    }
    //TODO UML 图,你的未来计划问题询问
}
