package com.qianfeng.openapi.webmaster.controller;

//

import com.qianfeng.openapi.webmaster.constans.SystemParameter;
import com.qianfeng.openapi.webmaster.feign.RedisService;
import com.qianfeng.openapi.webmaster.mq.SendMessageChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/web")
public class WebMasterController {
    @Autowired
    private SendMessageChannel sendMessageChannel;

    @Autowired
    private RedisService redisService;

    /**
     * todo: 更新 服务模块的接口信息 的handler
     *      1. 将更新后的新数据，发送到Redis中一份，更新Redis中有关服务模块的接口信息方面的数据；
     *      2. 将更新后的新数据，发送到MQ中一份，然后zuul网关从MQ中订阅到更新的新数据，然后也随之更新网关内存中 有关服务模块的接口信息方面的数据；
     */
    @PostMapping("/updateapiinfo")
    public String updateApiInfo(@RequestBody Map<String,String> apiInfoBean) {
//       1》 获取到更新后的新数据：
        String method = apiInfoBean.get("method");
        apiInfoBean.remove("method");//因为method是key 而不是具体的属性和值,所以不需要保留

//      2》  将更新后的新数据，更新到Redis中；
        redisService.mPut(SystemParameter.REDISAPIPRE + method, apiInfoBean);

//      3》 将更新后的新数据，发布到mq中；
//        3.1第一步：获取到生产者给MQ发布数据的Channel：
        MessageChannel channel = sendMessageChannel.messageChannel();
//        3.2第二步：开始往MQ中，发送消息：
        channel.send(new GenericMessage<String>("听说太理想的恋爱终不可接触"));

        return "WebMasterController succes";
    }
}
