# 开放平台项目——我主要负责的模块以及技术：（历时一周半，十天左右的时间）；

#1》缓存模块；（详看：openapi-cache模块）
   >>>   1.1: 用redis的Java的模板对象，实现Redis的CRUD；---> cache.api包 以及 cache.controller包
   >>>   1.2: 自动导出在线接口文档； ---> swagger.SwaggerConfig类
   
------------------------------------- 

#2》zuul网关模块：（详看：openapi-gateway模块）
   >>>   2.1: 通过feign实现对redis模块的调用；  ---> feign.RedisService接口；
   
   >>>   2.2: 通过FallbackProvider实现，当对服务模块的调用失败后实现降级回退；---> fallback.ZuulFallbackprovider类；
   
   >>>   2.3: 通过一个前置过滤器，实现签名校验功能；--->SignFilter类、signFilter.md文档、CheckSignUsedFilter类；
   
   >>>   2.4: 通过一个前置过滤器，实现对公共参数的动态过滤；---> ParameterFilter类
   
   >>>   2.5: 通过一个前置过滤器，实现限定用户对某个接口的访问次数的功能；---> LimitFilter类
   
   >>>   2.6: 通过一个路由过滤器，实现将用户的请求转发到相应的服务模块中；---> RoutingFilter类
   
   >>>   2.7: 通过一个前置过滤器，实现对请求调用的限时功能；---> TimeStampFilter类
   
   >>>   2.8: 通过一个后置过滤器，实现日志收集功能；---> LogPreFilter类、LoggerFilter类 
   
   >>>   2.9: 通过一个错误过滤器，实现当调用发生错误时，返回给用户一个友好提示；---> ZuulErrorFilter类
   
   >>>   2.10: 实现网关的初始化参数的动态加载功能；---> MyContextLoadlistener类、MyRabbitmqListener类
  
 --------------------------------

#3》搜索模块：（详看：openapi-search模块）
   >>>   3.1: 通过es的Java模板对象，实现对日志数据的CRUD；---> search.mq.LogMQListener类、search.api包；
   
 ----------------------- 

#4》注意：
   >>> 用户请求示例：localhost:32000/openapi?method=com.qianfeng.xxx&timestamp=2019-12-03%2010:04:00&appley=xxx&sign=xxx&name=xxx
 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         