package com.zero.boot.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootDubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDubboServerApplication.class, args);
        System.out.println("服务已开启");
    }

}
