package com.mini.dubbo.analyze.producer;

import org.apache.dubbo.config.*;

import java.io.IOException;

public class DubboServer {

    public static void main(String[] args) throws IOException {
        // 开始 暴露 UserService 服务
        // application
        // protocol -dubbo 协议
        // register
        // service
        ApplicationConfig applicationConfig
                = new ApplicationConfig("DubboServer");
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setSerialization("fastjson");
        protocolConfig.setPort(-1);//20880
        RegistryConfig registryConfig
                = new RegistryConfig("zookeeper://111.229.3.73:2181");

        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setInterface("com.mini.dubbo.analyze.api.service");
        serviceConfig.setRef(new UserServiceImpl());
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.export();

        System.out.println("服务已暴露");
        System.in.read();
    }

}
