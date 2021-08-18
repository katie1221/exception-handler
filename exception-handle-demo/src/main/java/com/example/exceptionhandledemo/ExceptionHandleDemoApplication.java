package com.example.exceptionhandledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author qzz
 */
@SpringBootApplication
public class ExceptionHandleDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExceptionHandleDemoApplication.class, args);
        System.out.println("程序正在运行...");
    }

}
