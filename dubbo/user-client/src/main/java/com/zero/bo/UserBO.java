package com.zero.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : Home
 * @version V1.0
 * @Project: dubbo
 * @Package com.zero.bo
 * @Description: TODO
 * @date Date : 2022年02月03日 19:07
 */
@Data
public class UserBO implements Serializable {

    private Integer id;
    private String name;
    private String sex;
    private String sex2;
    private Integer age;

}
