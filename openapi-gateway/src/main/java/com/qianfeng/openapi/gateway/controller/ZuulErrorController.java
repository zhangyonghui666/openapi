package com.qianfeng.openapi.gateway.controller;



import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * todo : 这个是用于处理错误信息的controller ,需要注意 必须实现ErrorController 并重写方法返回/error
 */
@RestController
public class ZuulErrorController implements ErrorController {
    @RequestMapping("/error")
    public String error() {
        System.err.println("error controller 执行");
        return "success";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
