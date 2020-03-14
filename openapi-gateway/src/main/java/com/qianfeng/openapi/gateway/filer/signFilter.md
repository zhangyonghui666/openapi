# 签名校验算法：

 >第一步，根据客户端传递的请求参数，生成字符串stringA；
   >具体步骤：
        1> 设客户端传递的请求参数们为集合M，
        2> 将集合M内(非空参数值)的参数按照参数名的ASCII码大小，进行从小到大排序，
        3> 排序后，使用URL键值对的格式（即, 参数名1=参数值1 & 参数名2=参数值2…），拼接成字符串stringA。
         
   >注意：
        ◆ 参数名ASCII码从小到大排序（字典序）；
        ◆ 参数值为空的参数不参与签名；
        ◆ 参数名区分大小写；
            
------------------------------
 
 >第二步，生成sign值signValue;
   >具体步骤：
        1> 在stringA后边, 拼接上key，得到stringSignTemp字符串，
        2> 再对stringSignTemp进行MD5运算，
        3> 再将得到的字符串的所有字符转换为大写，得到最终(签名值)sign值signValue。
        4> 将最终(签名值)sign值signValue,结合请求参数一起，发送给后端系统的网关的SignFilter过滤器（专门用来进行签名校验的一个过滤器）；
       
   >补充：key的问题:          
```text
           1）key设置：每一个客户端对应一个独有的key;  
           
           2）key不用传到后端系统，因为我们后端是知道key的；
                方式：我们可以在服务器里边随机生成一个key，然后存到redis里边一份，返回给客户端一份；
                这里key和Shiro中的盐是类似的作用；
``` 
               
 
------------------------------- 

 >第三步，zuul网关再生成一次签名，进行前后两者比对；
    具体步骤：
        1> SignFilter过滤器收到请求参数后,去掉请求参数中的sign数据,
        2> 然后,也以相同的方式生成一遍sign值signValue,(先排序，再拼接上key,再md5运算,再将所有字符转大写，最后生成sign值)，
        3> 最后，和用户传递过来的sign值signValue进行比较、判断两个签名是否一致；
    
   >特别注意：
        ◆ 用户传递过来的sign值，只做最后的前后比对用，不参与zuul网关再生成签名的过程。

 
 
# 举例：------------------------------ 
eg:
    假设传送的参数如下：
```text
        appid： wxd930ea5d5a258f4f
        mch_id： 10000100
        device_info： 1000
        body： test
        nonce_str： ibuaiVcKdpRxkhJA
```
	
   ## 第一步：对参数按照key=value的格式，并按照参数名ASCII字典序排序如下：
```text
    stringA="appid=wxd930ea5d5a258f4f&body=test&device_info=1000&mch_id=10000100&nonce_str=ibuaiVcKdpRxkhJA";
```

   ## 第二步：拼接API密钥 + MD5签名 + 字符转大写：
```text
    //注：key为商户平台设置的密钥key
    stringSignTemp=stringA+"&key=192006250b4c09247ec02edce69f6a2d" 
    //注：这个是MD5签名方式
    sign=MD5(stringSignTemp).toUpperCase()="9A0A8659F005D6984697E2CA0A9CF3B7" 
    //注：这个是HMAC-SHA256签名方式,（与MD5签名方式任选其一即可）
    sign=hash_hmac("sha256",stringSignTemp,key).toUpperCase()="6A9AE1657590FD6257D693A078E1C3E4BB6BA4DC30B23E0EE2496E54170DACD6" 
```


   ## 最终后端系统得到的客户端最终发送的数据：
```xml
        <xml>
            <appid>wxd930ea5d5a258f4f</appid>
            <mch_id>10000100</mch_id>
            <device_info>1000</device_info>
            <body>test</body>
            <nonce_str>ibuaiVcKdpRxkhJA</nonce_str>
            <sign>9A0A8659F005D6984697E2CA0A9CF3B7</sign>
        </xml>
```


   ## 第三步：然后服务端自己也以相同的方式生成一遍sign，然后进行sign的比对，如果两个sign一模一样，说明客户端发送的请求数据正确。

   

      