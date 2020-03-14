package com.qianfeng.openapi.eureka;

//


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jackiechan on 19-12-2/上午10:24
 *
 * @Author jackiechan
 */
@SpringBootApplication  // SpringBoot的启动类的标配注解；
@EnableEurekaServer  // 声明这是一个eurekaServer服务端；
@EnableWebSecurity  // 开启Spring的安全校验机制——Spring Security；
public class EurekaStartApp extends WebSecurityConfigurerAdapter {
    /**
     * SpringBoot启动类的标配，main方法；
     * @param args
     */
    public static void main (String[] args){
        SpringApplication.run(EurekaStartApp.class,args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()//开启请求认证配置
                .antMatchers("/eureka/**")//符合某个规则的路径，不必进行安全验证，直接放行，这里是符合/eureka/**这个路径的请求；
                .permitAll()//放行
                .antMatchers("/actuator/**")//  符合/actuator/**这个路径的请求，直接放行；
                .permitAll()//放行
                .anyRequest()//其他的所有请求，
                .authenticated()// 则都需要进行安全验证；
                .and()//并且，
                .httpBasic(); // 是以HTTP的方式，做个基本认证；
    }
}
