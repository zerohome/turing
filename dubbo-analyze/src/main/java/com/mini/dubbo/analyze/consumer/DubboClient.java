package com.mini.dubbo.analyze.consumer;

import com.mini.dubbo.analyze.api.service.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DubboClient {

    public static void main(String[] args) throws IOException {
        ApplicationConfig applicationConfig
                = new ApplicationConfig("DubboClient");
        RegistryConfig registryConfig
                = new RegistryConfig("zookeeper://111.229.3.73:2181"); // 虚拟的注册中心 局域网

        ReferenceConfig referenceConfig = new ReferenceConfig();
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setInterface(UserService.class);

        UserService userService = (UserService) referenceConfig.get();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("quit")) {
                break;
            }
            System.out.println(userService.getUser(1));
        }



    }
}
