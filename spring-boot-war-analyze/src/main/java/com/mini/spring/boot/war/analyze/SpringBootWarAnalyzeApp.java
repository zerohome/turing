package com.mini.spring.boot.war.analyze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWarAnalyzeApp extends SpringBootServletInitializer /** 第三步 **/{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWarAnalyzeApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootWarAnalyzeApp.class);
    }
}
