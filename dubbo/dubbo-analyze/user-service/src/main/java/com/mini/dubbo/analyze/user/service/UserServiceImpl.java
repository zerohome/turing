package com.mini.dubbo.analyze.user.service;

import com.mini.dubbo.analyze.user.pojo.User;

import java.lang.management.ManagementFactory;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("user:" + ManagementFactory.getRuntimeMXBean().getName());
        user.setSex("man");
        return user;
    }

}
