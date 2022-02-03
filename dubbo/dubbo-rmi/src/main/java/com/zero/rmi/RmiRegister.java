package com.zero.rmi;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.rmi.service
 * @Description: TODO
 * @date Date : 2022年02月03日 19:26
 */
public class RmiRegister {
    public static void main(String[] args) throws IOException {
        // 本地主机上的远程对象注册表Registry的实例
        LocateRegistry.createRegistry(8080);
        System.out.println("======= 注册中心启动成功! =======");
        System.in.read(new byte[1024]);
    }

}
