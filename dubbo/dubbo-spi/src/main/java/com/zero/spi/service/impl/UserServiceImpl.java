package com.zero.spi.service.impl;

import com.zero.spi.service.UserService;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.spi.service.impl
 * @Description: TODO
 * @date Date : 2022年02月03日 19:16
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getName(int id) {
        return "SPI";
    }
}
