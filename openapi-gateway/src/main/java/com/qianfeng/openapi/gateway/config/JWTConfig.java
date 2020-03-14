package com.qianfeng.openapi.gateway.config;

//


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jackiechan on 19-12-11/上午11:32
 *
 * @Author jackiechan
 */
@ConfigurationProperties(prefix = "jwtconfig")
@Component
@Getter
@Setter
public class JWTConfig {

    private int expirationSeconds;

    private String salt;

    private String login;//登录地址

    private String header;//JWT的响应头

    private String prefix;//jwt数据的前缀,用于简单区分是不是jwt
}
