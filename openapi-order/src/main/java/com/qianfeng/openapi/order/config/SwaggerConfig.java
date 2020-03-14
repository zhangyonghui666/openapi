package com.qianfeng.openapi.order.config;

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


import org.springframework.beans.factory.annotation.Value;
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
 * Created by jackiechan on 19-11-25/上午11:42
 *
 * @Author jackiechan
 */
@Configuration
@EnableSwagger2//一定要加这个注解,否则你可以尝试一下
public class SwaggerConfig {
    @Value("${swagger.contact.name}")
    private String name;
    @Value("${swagger.contact.url}")
    private String url;
    @Value("${swagger.contact.email}")
    private String email;



    @Bean
    public Docket docket(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)///
                .select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
    }

    @Bean
    public ApiInfo apiInfo() {
        return  new ApiInfoBuilder()
                .title("这是一个titile")//
                .contact(new Contact(name,url,email))//
                .description("这个是一个介绍")//
                .version("2.1")//
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")//
                .license("apache2.0")
                .build();
    }
}
