package com.suixingpay.jooq.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfiguration {

	private final Logger log = LoggerFactory.getLogger(SwaggerConfiguration.class);

	private static final String DEFAULT_INCLUDE_PATTERN = "/sysUser/*.*";

	@Bean
	public Docket swaggerSpringfoxDocket() {
		log.debug("Starting Swagger");
		StopWatch watch = new StopWatch();
		watch.start();
		Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2).groupName("category-api")
				.apiInfo(apiInfo()).genericModelSubstitutes(ResponseEntity.class).select()
				.paths(regex(DEFAULT_INCLUDE_PATTERN))
				.build();
		watch.stop();
		log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
		return swaggerSpringMvcPlugin;
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Springfox petstore API")
				.description("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum "
						+ "has been the industry's standard dummy text ever since the 1500s, when an unknown printer "
						+ "took a "
						+ "galley of searchType and scrambled it to make a searchType specimen book. It has survived not only five "
						+ "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. "
						+ "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum "
						+ "passages, and more recently with desktop publishing software like Aldus PageMaker including "
						+ "versions of Lorem Ipsum.")
				.termsOfServiceUrl("http://springfox.io").contact("springfox").license("Apache License Version 2.0")
				.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("2.0").build();
	}

}
