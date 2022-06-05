package com.mini.spring.transaction.analyze;

import com.mini.spring.transaction.analyze.config.SpringConfig;
import com.mini.spring.transaction.analyze.service.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        PayService payService = context.getBean(PayService.class);
        payService.pay("123456789",10);
    }
}
