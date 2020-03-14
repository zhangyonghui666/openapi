package com.qianfeng.openapi.search.mq;

//


import com.qianfeng.openapi.search.api.SearchServiceApi;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  todo: es从MQ中接收到消息，并执行add()方法：
 */
@Component
@RabbitListener(queues = {"suibianyigemingzizhiyaoweiyijiuxingheheda"},autoStartup = "true")
public class LogMQListener {
    @Autowired
    private SearchServiceApi searchServiceApi;
    //方式1 在对应的方法上面添加这个监听
//    @RabbitListener(queues = {"suibianyigemingzizhiyaoweiyijiuxingheheda"},autoStartup = "true")
//    public void onMessage(String json) throws Exception {
//        searchServiceApi.add(json);
//    }


    /**
     * todo: 从MQ中监听到消息之后，再执行add()方法，将消息（日志数据）添加到es里边；
     */
    //方式2
    @RabbitHandler//这个写法 必须在类上面添加RabbitListener注解来指定监听哪个队列
    public void onMessage2(String json) throws Exception {
        searchServiceApi.add(json);
    }


}
