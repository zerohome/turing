package com.mini.dubbo.analyze.api.service;



import com.mini.dubbo.analyze.api.bo.UserBO;

import java.util.List;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.service
 * @Description: TODO
 * @date Date : 2022年02月03日 19:11
 */
public interface UserService {

    UserBO getUser(Integer id);

    List<UserBO> findUser(String city, String sex);
}
