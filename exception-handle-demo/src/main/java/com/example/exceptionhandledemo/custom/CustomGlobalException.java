package com.example.exceptionhandledemo.custom;

import lombok.Data;

/**
 * 自定义全局异常类
 * @author qzz
 */
public class CustomGlobalException extends RuntimeException{

    private static final Long serialVersionUID = 1L;

    /**
     * code码
     */
    private String code;
    /**
     * 返回信息提示
     */
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CustomGlobalException(String msg){
        this.code = "500";
        this.msg = msg;
    }

    public CustomGlobalException(String code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
