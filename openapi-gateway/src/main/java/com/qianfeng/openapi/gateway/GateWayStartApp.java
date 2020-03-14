package com.qianfeng.openapi.gateway;

//


import com.qianfeng.openapi.gateway.listener.MySubMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 *
 */
@SpringBootApplication  // SpringBoot启动类的标配；
@EnableZuulProxy  // 这是网关，在SpringCloud中使用的是zuul，该注解使得SpringBoot支持zuul组件；
@EnableFeignClients  // 因为网关涉及到与其他服务模块之间的相互调用，所以还要使得SpringBoot支持Feign，进行调用其他的服务模块；
@EnableBinding(MySubMessageChannel.class)
public class GateWayStartApp {
    public static void main (String[] args){
        SpringApplication.run(GateWayStartApp.class,args);
    }
}
