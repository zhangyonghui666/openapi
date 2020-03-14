package com.qianfeng.openapi.webmaster;

//


import com.qianfeng.openapi.webmaster.mq.SendMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableBinding(SendMessageChannel.class)//开启stream的binding,用来绑定（MQ中的）生产者
public class WebMasterStartApp {
    
    public static void main (String[] args){
        SpringApplication.run(WebMasterStartApp.class,args);
    }
}
