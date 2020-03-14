package com.qianfeng.openapi.cache.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * todo: 自动导出在线接口文档;
 *          （让别人来调用该服务模块用的，因为别人不知道你的接口是什么，接口的参数是什么...）
 */
@EnableSwagger2 //使得SpringBoot支持Swagger导出在线文档 ,千万不能忘记，千万不能忘记，千万不能忘记！！！
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2)//版本为2.0
                .apiInfo(apiInfo)//设置接口文档的相关基础信息
                .select()//对哪些接口进行文档生成
                .apis(RequestHandlerSelectors.any())//所有的
                    .paths(PathSelectors.any()).build();
        }
        @Bean
        public ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                .title("缓存模块接口文档")
                .version("99.99")
                .description("这不是描述,这不是描述,这是接口地址")
                .contact(new Contact("强哥","http://www.qiandu.com","qiangge@qiangge.qiangge"))
                .license("apache 2.0")  // 许可证
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }

}
