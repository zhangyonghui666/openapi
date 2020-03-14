package com.qianfeng.openapi.cache.exception;

//
//

import lombok.Data;

/**
  todo: 这是一个基础异常，以后写的很多其他的异常可以直接继承它；
    基础异常类，需要继承RuntimeException；
 */
@Data
public class BaseException  extends RuntimeException{
    private  String code;
    private String message;

    public BaseException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
