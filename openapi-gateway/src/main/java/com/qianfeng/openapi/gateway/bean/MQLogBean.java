package com.qianfeng.openapi.gateway.bean;

//

import lombok.Data;

import java.io.Serializable;

/**
 *
 */
@Data
public class MQLogBean implements Serializable {

    private String appkey; //哪个用户发起的请求

    private String remoteIp; //用户的ip地址

    private String serverIp;//当前服务器的ip,用于知道是哪个网关处理的

    private String apiName;//当前用户请求的接口是哪个,实际上就是method


    private long totalRepTime;//总响应时间


    private long receiveTime;//收到请求的时间


    private long repTime;//返回响应的时间, 这个时间的和请求时间的差就是上面的总响应时间


    private String requestContent;//请求包的内容


}

