package com.coursework.webapp;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.SpringDocUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class WebappApplication {
    static {
        SpringDocUtils.getConfig().addHiddenRestControllers(BasicErrorController.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Customer accounts API").version(appVersion)
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
