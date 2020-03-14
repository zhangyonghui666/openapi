package com.qianfeng.openapi.authcenter.filter;

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
import com.qianfeng.openapi.authcenter.config.JWTConfig;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * Created by jackiechan on 19-12-11/上午11:07
 *
 * @Author jackiechan
 */
public class JwtUserNamePasswordAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    public JwtUserNamePasswordAuthenticationFilter(AuthenticationManager manager, JWTConfig jwtConfig, ObjectMapper objectMapper) {
        super(new AntPathRequestMatcher(jwtConfig.getLogin(),"POST"));//设置我们的登录地址多少
        this.objectMapper = objectMapper;
        this.jwtConfig = jwtConfig;
        setAuthenticationManager(manager);
    }

    private JWTConfig jwtConfig;

    private ObjectMapper objectMapper;

    /**
     * 用于获取用户传递过来的账号和密码的
     *
     * @param request
     * @param response
     * @return
     * @throws AuthenticationException
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        User user = objectMapper.readValue(request.getInputStream(), User.class);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());

        return getAuthenticationManager().authenticate(usernamePasswordAuthenticationToken);
    }

    /**
     * 认证成功之后,按照我们的业务要求,需要给用户返回JWT
     *
     * @param request
     * @param response
     * @param chain
     * @param authResult
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

//        Collection<? extends GrantedAuthority> authorities = authResult.getAuthorities();//前面比较后获取到的用户的角色
//
//        List<String> fsdfs = new ArrayList<>();
//        for (GrantedAuthority authority : authorities) {
//            fsdfs.add(authority.getAuthority());
//        }
//
        Instant now = Instant.now();


        String jwt = Jwts.builder()//
                .setSubject(authResult.getName())//
                .claim("authorities",
                        authResult.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))//声明用户的角色
                .setIssuedAt(Date.from(now))//声明开始时间
                .setExpiration(Date.from(now.plusSeconds(jwtConfig.getExpirationSeconds())))//声明过期时间
                .signWith(SignatureAlgorithm.HS256, jwtConfig.getSalt().getBytes())

                .compact();
        //我们通过什么方式给用户返回

        response.addHeader(jwtConfig.getHeader(), jwtConfig.getPrefix() + jwt);

    }


    @Data
    static class User {

        private String username;

        private String password;

    }
}
