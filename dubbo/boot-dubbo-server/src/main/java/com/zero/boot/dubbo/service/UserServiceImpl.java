package com.zero.boot.dubbo.service;

import com.zero.bo.UserBO;
import com.zero.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;
import java.util.List;


@Service
@Component
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
        return null;
    }
}
