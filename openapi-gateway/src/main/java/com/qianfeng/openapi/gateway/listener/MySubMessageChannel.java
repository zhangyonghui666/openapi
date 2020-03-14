package com.qianfeng.openapi.gateway.listener;
//
//


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * todo: 定义 消费者 从MQ中 订阅消息的 通道Channel；
 */

public interface MySubMessageChannel {
    @Input("1907apiupdate") //声明当前通道是用于接收1907apiupdate交换机数据的
    SubscribableChannel CHANNEL();
}
