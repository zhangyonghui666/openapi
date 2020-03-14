package com.qianfeng.openapi.authcenter.config;

//
//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易  
//          佛曰:  
//                  写字楼里写字间，写字间里程序员；  
//                  程序人员写程序，又拿程序换酒钱。  
//                  酒醒只在网上坐，酒醉还来网下眠；  
//                  酒醉酒醒日复日，网上网下年复年。  
//                  但愿老死电脑间，不愿鞠躬老板前；  
//                  奔驰宝马贵者趣，公交自行程序员。  
//                  别人笑我忒疯癫，我笑自己命太贱；  
//  


import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianfeng.openapi.authcenter.filter.JwtUserNamePasswordAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by jackiechan on 19-12-11/上午11:16
 *
 * @Author jackiechan
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
    @Autowired
    private JWTConfig jwtConfig;

    @Autowired
    private ObjectMapper objectMapper;
    /**
     * 获取用户在数据库中的信息,相当于我们shiro中realm中的认证方法
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())//
                .withUser("admin").password(new BCryptPasswordEncoder().encode("admin"))//
                .roles("ADMIN", "USER")//
                .and().withUser("user").password(new BCryptPasswordEncoder().encode("user"))//
                .roles("USER");

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
                    res.getWriter().write("自己的账号密码是什么心里没点索引吗?");
                }).and().addFilterAfter(new JwtUserNamePasswordAuthenticationFilter(authenticationManager(), jwtConfig, objectMapper), UsernamePasswordAuthenticationFilter.class)//
                .authorizeRequests().mvcMatchers(jwtConfig.getLogin()).permitAll()//
                .anyRequest().authenticated();//其他的地址都拦截,这个要写在最下面

    }
}
