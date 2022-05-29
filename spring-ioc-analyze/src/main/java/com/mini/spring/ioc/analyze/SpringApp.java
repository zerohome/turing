package com.mini.spring.ioc.analyze;

import com.mini.spring.ioc.analyze.controller.IocController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.getBean(IocController.class);//getBean流程
    }
}
