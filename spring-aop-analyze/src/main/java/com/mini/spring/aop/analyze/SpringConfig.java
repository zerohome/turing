package com.mini.spring.aop.analyze;

import com.mini.spring.aop.analyze.aspect.LogAspect;
import com.mini.spring.aop.analyze.service.Calculate;
import com.mini.spring.aop.analyze.service.impl.MiniCalculate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringConfig {

    @Bean
    public Calculate calculate() {
        return new MiniCalculate();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }

}
