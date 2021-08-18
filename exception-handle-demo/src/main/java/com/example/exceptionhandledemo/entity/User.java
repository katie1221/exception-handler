package com.example.exceptionhandledemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体
 * @author qzz
 */
@Data
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;
}
