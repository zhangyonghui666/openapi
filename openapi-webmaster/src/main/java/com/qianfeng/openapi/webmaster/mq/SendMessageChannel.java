package com.qianfeng.openapi.webmaster.mq;
//

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * todo: 定义 生产者 给MQ 发布消息的channel通道；
 */

public interface SendMessageChannel {

    //声明当前方法是一个生产者的方法,返回值就是：生产者的通道Channel
    @Output("1907apiupdate")
    MessageChannel messageChannel();
}
