package com.example.exceptionhandledemo.handle;

import com.example.exceptionhandledemo.custom.CustomGlobalException;
import com.example.exceptionhandledemo.custom.GlobalErrorCodeEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常处理
 * SpringBoot中有一个ControllerAdvice的注解，使用该注解表示开启了全局异常的捕获，
 * 我们只需在自定义一个方法使用ExceptionHandler注解然后定义捕获异常的类型即可对这些捕获的异常进行统一的处理。
 * @author qzz
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 处理自定义的业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(value= CustomGlobalException.class)
    public Map<String,Object> customExceptionHandler(CustomGlobalException e){
        Map<String,Object> data = new HashMap<>();
        System.out.println("业务异常！原因是："+e.getMsg());
        data.put("code",e.getCode());
        data.put("msg",e.getMsg());
        return data;
    }

    /**
     * 处理空指针异常
     * @param e
     * @return
     */
    @ExceptionHandler(value= NullPointerException.class)
    public Map<String,Object> customExceptionHandler(NullPointerException e){
        Map<String,Object> data = new HashMap<>();
        System.out.println("发生空指针异常！原因是："+e.getMessage());
        data.put("code",GlobalErrorCodeEnum.BODY_NOT_MATCH.getCode());
        data.put("msg",GlobalErrorCodeEnum.BODY_NOT_MATCH.getMsg());
        return data;
    }

    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(value= Exception.class)
    public Map<String,Object> customExceptionHandler(Exception e){
        Map<String,Object> data = new HashMap<>();
        System.out.println("Exception异常！原因是："+e.getMessage());
        data.put("code",GlobalErrorCodeEnum.SERVER_ERROR.getCode());
        data.put("msg",GlobalErrorCodeEnum.SERVER_ERROR.getMsg());
        return data;
    }


}
