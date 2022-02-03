package com.zero.dubbo;

import com.zero.bo.UserBO;
import com.zero.service.UserService;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;


public class UserServiceImpl implements UserService {
    @Override
    public UserBO getUser(Integer id) {
        UserBO user = new UserBO();
        user.setId(id);
        user.setName("luban:" + ManagementFactory.getRuntimeMXBean().getName());
        user.setSex("man");
        return user;
    }

    @Override
    public List<UserBO> findUser(String city, String sex) {
        return Arrays.asList(getUser(1));
    }
}
