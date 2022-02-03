package com.zero.rmi.service.impl;

import com.zero.rmi.service.UserService;

import java.lang.management.ManagementFactory;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.rmi.service.impl
 * @Description: TODO
 * @date Date : 2022年02月03日 19:25
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService {

    public UserServiceImpl() throws RemoteException {
    }


    @Override
    public String getName(Integer id) {
        return String.format("myName is rmi :%s", ManagementFactory.getRuntimeMXBean().getName());
    }
}
