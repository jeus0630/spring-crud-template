package com.example.springcrudtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringCrudTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudTemplateApplication.class, args);
    }

}
