package com.gusto.dsvendas.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType.SWAGGER_2
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    fun swaggerConfig(): Docket = Docket(SWAGGER_2)
        .apiInfo(metadata())
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()

    private fun metadata(): ApiInfo = ApiInfoBuilder()
        .title("DSVendas backend")
        .description("Api da semana spring react refeita em kotlin")
        .version("1.0.0")
        .build()
}