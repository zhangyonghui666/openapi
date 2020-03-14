package com.qianfeng.openapi.search.config;

//


import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * todo: es的配置类
 */
@Configuration
public class SearchConfig {
    @Value("${es.host:baseservice.qfjava.cn}")
    public String host;
    @Value("${es.port:#{9000}}")
    private int port;

    @Bean
    public RestHighLevelClient client() {
        RestClientBuilder builder = RestClient.builder(new HttpHost(host, port));
        return new RestHighLevelClient(builder);
    }

    @Bean
    public Queue queue() {
        return new Queue("suibianyigemingzizhiyaoweiyijiuxingheheda");
    }

}
