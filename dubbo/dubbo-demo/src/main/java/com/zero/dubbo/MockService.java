package com.zero.dubbo;

import org.apache.dubbo.rpc.service.GenericException;
import org.apache.dubbo.rpc.service.GenericService;

import java.util.HashMap;

public class MockService implements GenericService {
    private String target;

    public MockService(String target) {
        this.target = target;
    }

    // 通用方法
    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        String key = target + method;
        if (target.equals("com.zero.service.UserService") && method.equals("getUser")) {
            HashMap<Object, Object> map = new HashMap<>();
            map.put("id", 1);
            map.put("name", "小鲁班");
            return map;
        } else if (target.equals("com.zero.service.UserService2") && method.equals("getUser")) {
            HashMap<Object, Object> map = new HashMap<>();
            map.put("id", 1);
            map.put("name", "小鲁班");
            return map;
        }
        return null;
    }
}
