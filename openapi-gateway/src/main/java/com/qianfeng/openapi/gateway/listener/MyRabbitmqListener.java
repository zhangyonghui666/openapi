package com.qianfeng.openapi.gateway.listener;

//
//

import com.qianfeng.openapi.gateway.constans.SystemParameter;
import com.qianfeng.openapi.gateway.feign.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Set;

/**
 * todo: MQ监听器：1. 监听MQ消费者通道，接收到更新后的数据；
 *                2. 并将新数据 更新到 zuul的网关的缓存里边；
 */
@Component
public class MyRabbitmqListener {
    Logger logger = LoggerFactory.getLogger(MyRabbitmqListener.class);

    @Autowired
    private MySubMessageChannel mySubMessageChannel;
    @Autowired
    private RedisService redisService;

    /** binding：绑定符；生产者发布消息时，就指定了绑定符为：“1907apiupdate”
     * todo : 从消费者通道中, 接收到 MQ推送来的 binding="1907apiupdate" 的数据;
     * @param message
     */
     @StreamListener("1907apiupdate")//声明接收这个的
    public void onMessage(String message) {
        System.err.println("收到了消息:" + message);
    }



    /**  <bean class="" initmethod="" destorymethod=""
     * todo:  init()方法：
     *          1》 @PostConstruct：顾名思义，在这个类的构造方法执行之后，立刻执行该方法；即，在该Listener监听器对象在Spring容器中构造出来之后，立即执行被该@PostConstruct注解修饰的方法;角色等同于（45行）配置文件中的 initmethod=""
     *          2》 @PreDestroy：与上一个注解 @PostConstruct类似，意思是：在该Listener监听器对象被销毁之前，执行被该@PreDestroy注解修饰的方法；角色等同于（45行）配置文件中的 destorymethod=""
     */
    @PostConstruct
    //@PreDestroy
    public void init() {

        /**
         * todo: 订阅MQ推送过来的消息：
         */
        mySubMessageChannel.CHANNEL().subscribe(new MessageHandler() {
            @Override
            public void handleMessage(Message<?> message) throws MessagingException {

//                String payload = (String) message.getPayload();
//                String payload = new String((byte[]) message.getPayload());
//                System.err.println("订阅方式收到了消息:" + payload);

                //因为我们这个消费者的目的是:同步所有apiinfo,具体的消息内容实际上和我们的操作没有任何关系,
                // 所以我们不关注发送的内容是什么,我们的目的只是，将更新的新数据，更新到（put）zuul网关的缓存中,即可；

                // todo 1》从Redis中获取关于 服务模块的接口的信息—Apiname，的所有的key:
                Set<String> keys = redisService.keys(SystemParameter.REDISAPIPRE + "*");

                SystemParameter.allApiInfoMap.clear();
                // todo 2》获取所有key的数据
                for (String key : keys) {
                    Map<Object, Object> result = redisService.hgetAll(key);

//                 todo 3》 更新zuul网关的缓存中（ConcurrentHashMap）的数据
                    SystemParameter.allApiInfoMap.put(key, result);
                }
                logger.error("更新api信息,得到的结果是:{}", SystemParameter.allApiInfoMap);

            }
        });
    }
}
