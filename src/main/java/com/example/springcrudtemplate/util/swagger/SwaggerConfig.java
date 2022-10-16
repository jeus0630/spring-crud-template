package com.example.springcrudtemplate.util.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "Spring API 명세서",
        description = "spring API 명세서 입니다.",
        version = "v1"
    )
)

@Configuration
public class SwaggerConfig {


}
