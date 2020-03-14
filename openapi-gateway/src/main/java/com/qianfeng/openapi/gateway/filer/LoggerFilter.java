package com.qianfeng.openapi.gateway.filer;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qianfeng.openapi.gateway.bean.MQLogBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;

/**
 * todo: 这是一个后置过滤器，用于在对服务模块的调用结束后，进行日志收集；
 *
 */
@Component
public class LoggerFilter extends ZuulFilter {

    @Autowired
    private ObjectMapper objectMapper;// jackson

    @Autowired
    private AmqpTemplate template;


    Logger logger = LoggerFactory.getLogger(LoggerFilter.class);

    /**
     * todo:  后置过滤器,用于在请求结束后进行处理
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * todo: 直接返回true，表示该过滤器是一定执行的；
     * @return
     */
    @Override
    public boolean shouldFilter() {

        return true;
    }


    @Override
    public Object run() throws ZuulException {
        //获取当前时间
        //获取请求开始的时间
        //算出时间差,就是请求耗时
        RequestContext context = RequestContext.getCurrentContext();

        //todo: 1) 日志收集——receiveTime: 请求开始的时间
        long receiveTime = (long) context.get("receiveTime");
        HttpServletRequest request = context.getRequest();

        //获取所有所有的请求参数
        //Map<String, String[]> parameterMap = request.getParameterMap();

        //todo: 1) 日志收集——queryString：请求参数:
        String queryString = request.getQueryString();//name=zhangsan&age=18
        logger.error("收到的请求参数是:{}", queryString);

        //todo: 1) 日志收集——remoteAddr：客户端的地址
        String remoteAddr = request.getRemoteAddr();

        //todo: 1) 日志收集——serverIp：处理请求的服务器的IP地址
        String serverIp = getLocalIp();

        //todo: 1) 日志收集——当前时间；
        long currentTime = System.currentTimeMillis();

        //todo: 1) 日志收集——totalTime：时间差/请求耗时；
        long totalTime = currentTime - receiveTime;

        String appkey = request.getParameter("appkey");
        String apiName = request.getParameter("method");

        //todo: 2) 将上述这些数据都写入到日志里面：
        MQLogBean mqLogBean = new MQLogBean();
        mqLogBean.setApiName(apiName);
        mqLogBean.setAppkey(appkey);
        mqLogBean.setReceiveTime(receiveTime);
        mqLogBean.setRemoteIp(remoteAddr);
        mqLogBean.setRepTime(currentTime);
        mqLogBean.setServerIp(serverIp);
        mqLogBean.setTotalRepTime(totalTime);
        mqLogBean.setRequestContent(queryString);


        /**todo: 3) 将日志数据发送出去，到es中；通过MQ来发；
         *  这里我们使用方式是amqp模板对象的方式，amqp是RabbitMQ自己定义的一种协议（不用过多去关注）
        */

        //发送出去,我们选择直接发送到队列而不是交换机,原因是这样的,我们只有一个地方（es）需要写日志,所以我们不需要很多的消费者来接收数据（那样的话，需要用到交换机--绑定多个队列--对应多个消费者）
        //所以我们使用仅仅指定队列的方式即可,不再指定交换机exchange，然后消费者是es集群,这意味着只要任何一个es节点收到数据都可以写入到日志中,防止了重复写日志

        //虽然从方法中，我们看到可以发送java对象,但是不要随便发,因为发送对象需要序列化和反序列化,默认情况下的序列化是Java自带的,所以消费者那边必须有和生产者这边一模一样的类包括全限定名称
        //序列化其实就是一件事情,如何把数据转成字节码, 反序列化就是如何把字节码转成对象
        try {

            // 将 Java对象 序列化成 JSON数据
            String logjson = objectMapper.writeValueAsString(mqLogBean);

            // 以amqp模板对象的方式，仅仅指定队列的方式，来发布（日志）数据到mq
            template.convertAndSend("suibianyigemingzizhiyaoweiyijiuxingheheda", logjson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     * todo : 获取本机IP；
     */
    public String getLocalIp() {
        InetAddress address = null;

        try {
            address = InetAddress.getLocalHost();
            return address.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0.0.0.0";
    }
}
