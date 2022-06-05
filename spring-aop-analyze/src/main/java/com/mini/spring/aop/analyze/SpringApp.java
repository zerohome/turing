package com.mini.spring.aop.analyze;

import com.mini.spring.aop.analyze.service.Calculate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Calculate calculate = (Calculate) ctx.getBean("calculate");
        int retVal = calculate.add(2,4);
        System.out.println("运算结果是:"+retVal);
        System.out.println(ctx.getBean("logAspect"));
    }
}
