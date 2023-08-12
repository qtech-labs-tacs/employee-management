package com.qtechlabs.employeemanagement.configuration;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/api/v1/employee.*"), regex("/api/v1/employee.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Course Management API")
				.description("API reference for course management web application")
				.termsOfServiceUrl("https://qtechlabstac.com")
				.contact("support@qtechlabstacs.com").license("Apache License")
				.licenseUrl("support@qtechlabstacs.com").version("1.0").build();
	}

}