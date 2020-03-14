package com.qianfeng.openapi.gateway.config;

//


import com.qianfeng.openapi.gateway.filer.JWTProcessFilter;
import com.qianfeng.openapi.gateway.listener.MyContextLoadlistener;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

/**
 * todo: 配置类，用来将我们自己定义的对象，注册到Spring容器中；
 */
@Configuration
@EnableWebSecurity
public class ZuulConfig extends WebSecurityConfigurerAdapter {
    @Resource
    private JWTProcessFilter jwtProcessFilter;
    @Resource
    private JWTConfig jwtConfig;

    @Resource
    private MyContextLoadlistener loadlistener;



    /**
     * todo: 用于绑定我们的servlet listner的一个对象,将我们的Listener对象注册到Spring容器中；
     */
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(loadlistener);
        return servletListenerRegistrationBean;
    }

    /**
     * 声明队列
     *
     * @return
     */
    @Bean
    public Queue queue() {
        return new Queue("suibianyigemingzizhiyaoweiyijiuxingheheda");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()//
                .logout().disable()//
                .formLogin().disable()//禁用弹出的登录窗口
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)//
                .and().anonymous().and().exceptionHandling()//账号和密码错误
                .authenticationEntryPoint((req, res, ex) -> {
                    res.setContentType("text/html;charset=utf-8");
                    res.getWriter().write("尊敬的用户您好,本功能需要登录");
                }).and().addFilterAfter(jwtProcessFilter, UsernamePasswordAuthenticationFilter.class)//
                .authorizeRequests()
                //.mvcMatchers(jwtConfig.getLogin()).permitAll()//
                //.mvcMatchers("/dasdasd").hasRole("ADMIN")
                .anyRequest().authenticated();//其他的地址都拦截,这个要写在最下面

    }
}
