package com.adt.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * This is configuration class for SwaggerUI API documentation
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Configuration
public class SpringFoxConfig {
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build();
	}

	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Advanced Database Topics API Documentation").description("Details of all the APIs")
				.version("V1.0").build();
	}
}