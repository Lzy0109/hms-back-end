package com.liuzy.hms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author LiuZiYi
 * @Date 2021/1/18 下午9:12
 * @Version 1.0
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // 覆盖首页文档说明
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.liuzy.hms"))
                // 选择扫描包
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().contact(new Contact("LiuZiYi", "", "752867914@qq.com"))
                // 添加联系方式，默认三个为姓名、个人网站、邮箱
                .description("毕业设计").title("家政服务管理系统接口文档").version("0.0.1")
                // 添加描述
                .termsOfServiceUrl("").build();
    }
}
