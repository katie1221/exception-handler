package com.example.exceptionhandledemo.controller;

import com.example.exceptionhandledemo.custom.CustomGlobalException;
import com.example.exceptionhandledemo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qzz
 */
@RequestMapping("/user")
@RestController
public class UserController {


    /**
     * 正常请求
     * @param user
     * @return
     */
    @GetMapping("/list")
    public List<User> getUserList(User user){
        System.out.println("开始查询...");
        //组装数据，模拟数据库请求
        List<User> list = new ArrayList<>();
        User userInfo = new User();
        userInfo.setUserId(1);
        userInfo.setName("张三");
        userInfo.setAge(16);
        list.add(userInfo);
        return list;

    }

    /**
     * 自定义异常
     * @param user
     * @return
     */
    @PostMapping("/add")
    public boolean insert(@RequestBody User user){

        System.out.println("开始新增...");
        //如果姓名为空，就手动抛出一个自定义的异常
        if(user.getName() == null){
            throw  new CustomGlobalException("-1","用户姓名不能为空！");
        }
        return true;
    }

    /**
     * 空指针异常
     * @param user
     * @return
     */
    @PostMapping("/update")
    public boolean update(@RequestBody User user){

        System.out.println("开始更新...");
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return true;
    }

    /**
     * 其他异常----类型转换异常
     * @param user
     * @return
     */
    @PostMapping("/del")
    public boolean delete(@RequestBody User user){

        System.out.println("开始删除...");
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc135");
        return true;
    }



}
