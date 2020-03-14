package com.qianfeng.openapi.gateway.filer;

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


import com.qianfeng.openapi.gateway.config.JWTConfig;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jackiechan on 19-12-11/下午3:04
 *
 * @Author jackiechan
 */
@Component
public class JWTProcessFilter extends OncePerRequestFilter {
    @Autowired
    private JWTConfig jwtConfig;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //从请求中获取token,比如此处要求从请求头中传递
        String jwtString = request.getHeader(jwtConfig.getHeader());
        //我们在放数据的时候做了一点小小的变化,所有的数据都是以一个值固定开头的,所以我们先判断下是不是以它开头
        if (jwtString != null && jwtString.startsWith(jwtConfig.getPrefix())) {

           try {
               //先把yangpeng干掉,获取真正的token
               jwtString = jwtString.replaceAll(jwtConfig.getPrefix(), "");
               //对传递过来的数据进行解析,使用相同salt
               Claims claims = Jwts.parser().setSigningKey(jwtConfig.getSalt().getBytes()).parseClaimsJws(jwtString).getBody();
               String subject = claims.getSubject();//获取用户名,获取的是我们在生成的时候设置的subject
               List<String> authorities = (List<String>) claims.get("authorities");//获取我们提前保存好的角色信息
               Date startDate = claims.getIssuedAt();
               Date expiration = claims.getExpiration();

               if (subject != null && startDate != null && startDate.getTime() < System.currentTimeMillis() && expiration != null && expiration.getTime() > System.currentTimeMillis()) {

                   UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(subject, null,
                           authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList())


                   );//创建一个token对象,不需要密码,因为我们不需要通过密码判断,现在已经校验成功了

                   SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);//保存用户和角色信息
               }
           }catch (Exception e){
              e.printStackTrace();
               SecurityContextHolder.clearContext();
           }
        }

        filterChain.doFilter(request, response);
    }
}
