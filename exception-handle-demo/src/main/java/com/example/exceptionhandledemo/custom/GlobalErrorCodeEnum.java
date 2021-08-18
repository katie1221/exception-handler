package com.example.exceptionhandledemo.custom;

/**
 * 自定义全家异常枚举
 * @author qzz
 */

public enum GlobalErrorCodeEnum {

    /**
     * 未知异常
     */
    SUCCESS("200","成功！"),

    ERROR("400","失败！"),

    BODY_NOT_MATCH("401","请求的数据格式不符！"),

    SIGN_NOT_MACTH("403","请求的数字签名不匹配！"),

    NOT_FOUND("404","未找到该资源！"),

    SERVER_ERROR("500","服务器内部错误！"),

    SERVER_BUSY("503","服务器正忙，请稍后再试！")
    ;

    private String code;
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

    GlobalErrorCodeEnum(String code, String msg){
        this.code = code;
        this.msg=msg;
    }

}
