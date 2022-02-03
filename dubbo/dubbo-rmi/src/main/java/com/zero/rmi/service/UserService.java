package com.zero.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.rmi
 * @Description: TODO
 * @date Date : 2022年02月03日 19:24
 */
public interface UserService extends Remote {

    String getName(Integer id) throws RemoteException;

}
