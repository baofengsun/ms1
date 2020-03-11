package com.ms1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.not;
import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(not(regex("/error.*")))
                .paths(any())
                .build();
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("FAB-GEO Restful APIs")
                .description("")
                .termsOfServiceUrl("https://https://github.ibm.com/redhatpoc/fab-cc")
                .version("v1")
                .build();
    }
}
