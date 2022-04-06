package br.com.clients.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.clients.bff.controller"))
				.build()
				.apiInfo(getApiInfo());
	}

	public ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("API Rest")
				.description("Api Circuit Breaker")
				.version("1.0")
				.contact(getContact())
				.build();
	}

	public Contact getContact() {
		return new Contact("Gabriel Rocha Severino", "https://github.com/GabrielGRS0206/spring-circuit-breaker", "gabrielrocha0206@gmail.com");
	}

}
