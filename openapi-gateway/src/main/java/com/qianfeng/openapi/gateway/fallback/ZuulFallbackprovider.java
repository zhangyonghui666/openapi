package com.qianfeng.openapi.gateway.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * todo : 该类的作用：该类实现了FallbackProvider，而FallbackProvider在zuul网关里面的作用是：当调用一个服务模块时失败了，则进行fallback降级/回退，源码解释——Provides fallback when a failure occurs on a route.
 *      这个fallback只能是在特定情况下才会发生,即，当网关调用服务模块失败时才会触发,如果服务在eureka中找不到了,则zuul是不会触发这个fallback降级/回退的,而是直接抛出异常404,所以这个东西其实用处不大；
 *      在实际场景中，我们主要是靠errorcontroller来去返回指定数据
 */
@Component
public class ZuulFallbackprovider implements FallbackProvider {


    /**
     * todo: 当前fallback降级/回退 服务，是提供给哪些个路由(服务模块的地址)用的; *代表所有
     * @return
     */
    @Override
    public String getRoute() {
        return "*";
    }


    /**
     * todo: 调用服务出现异常了
     * @param route： 哪个服务出现异常了
     * @param cause ：出现了什么异常
     * @return
     */
    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {

            /**
             * todo: 正常情况下，应该根据 异常的原因（Throwable cause），来选择相应的状态码；
             *      PS: 这里随便一点，选择了200—ok
             *      HttpStatus是一个enum枚举类型，OK(200, "OK"),
             */
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            /**
             * todo: 上面那个方法的返回值是Java代码；
             *       该方法返回的才是数字：200
             */
            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.OK.value();
            }

            /**
             * todo : 该方法返回的是String字符串
             */
            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.OK.toString();
            }

            @Override
            public void close() {

            }

            /**
             * todo: 响应正文；
             *      调用服务模块出错了，要降级回退，那你得给用户一个响应正文啊，该方法就是用来定义响应正文的；
             * @return
             * @throws IOException
             */
            @Override
            public InputStream getBody() throws IOException {
                ByteArrayInputStream bis = new ByteArrayInputStream("在有生的瞬间能遇到你,竟花光所有运气,到今日才发现,曾呼吸过空气".getBytes());
                return bis;
            }

            @Override
            public HttpHeaders getHeaders() {
                return null;
            }
        };
    }



}
