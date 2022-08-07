package com.mini.dubbo.analyze.user.consumer;

import com.mini.dubbo.analyze.user.service.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DubboClient {

    public static void main(String[] args) throws IOException {
        RegistryConfig registryConfig
                = new RegistryConfig("zookeeper://peer1:2181"); // 虚拟的注册中心 局域网
        ApplicationConfig applicationConfig
                = new ApplicationConfig("consumer-app");
        UserService userService;

        ReferenceConfig referenceConfig = new ReferenceConfig();
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setTimeout(3000);
        referenceConfig.setInterface(UserService.class);
        userService = (UserService) referenceConfig.get();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("quit")) {
                break;
            } else {
                System.out.println(userService.getUser(1));
            }
        }
    }
}
