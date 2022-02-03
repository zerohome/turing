package com.zero.spi;

import com.zero.spi.service.UserService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.spi.service
 * @Description: TODO
 * @date Date : 2022年02月03日 19:17
 */
public class SPIMain {

    public static void main(String[] args) {
        Iterator<UserService> iterator = ServiceLoader.load(UserService.class).iterator();
        UserService service = iterator.next();
        System.out.println(service.getName(11));
//        Class.forName("com.mysql.jdbc.Driver");
//        DriverManager.getConnection("");
    }
}
