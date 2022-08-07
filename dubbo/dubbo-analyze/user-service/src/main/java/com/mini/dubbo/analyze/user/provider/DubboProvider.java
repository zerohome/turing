package com.mini.dubbo.analyze.user.provider;

import com.mini.dubbo.analyze.user.service.UserService;
import com.mini.dubbo.analyze.user.service.UserServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

public class DubboProvider {

    public static void main(String[] args) throws IOException {
        // 开始 暴露 UserService 服务
        // application
        // protocol -dubbo 协议
        // register
        // service
        ApplicationConfig applicationConfig
                = new ApplicationConfig("provider-app");
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setSerialization("fastjson");
        protocolConfig.setPort(-1);//20880
        RegistryConfig registryConfig
                = new RegistryConfig("zookeeper://peer1:2181");

        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(new UserServiceImpl());
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.export();

        System.out.println("服务已暴露");
        System.in.read();
    }

}
