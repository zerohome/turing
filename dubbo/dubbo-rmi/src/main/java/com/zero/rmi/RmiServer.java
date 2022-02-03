package com.zero.rmi;

import com.zero.rmi.service.UserService;
import com.zero.rmi.service.impl.UserServiceImpl;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.rmi
 * @Description: TODO
 * @date Date : 2022年02月03日 19:27
 */
public class RmiServer {
    public static void main(String[] args) throws IOException, AlreadyBoundException {
        // 创建一个远程对象
        UserService hello = new UserServiceImpl();
        //绑定的URL标准格式为：rmi://host:port/name
        Naming.bind("rmi://localhost:8080/UserService3", hello);
        System.out.println("======= 启动RMI服务注册成功! =======");
        System.in.read(new byte[1024]);
    }
}
