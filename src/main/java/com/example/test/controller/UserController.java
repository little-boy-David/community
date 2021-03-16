package com.example.test.controller;

import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public  boolean login (String phone, String password){
        System.out.println ( "微信小程序调用接口！！！用户名:" + phone + "密码:" + password );
        boolean login = userService.login ( phone, password );
        if (login) {
            return true;
        }
        return false;
    }
    @RequestMapping("/register")
    public int register(String username,String address,String phone,String password){
        System.out.println("开始注册功能");
        int count=userService.register(username,address,phone,password);
        if(count==1){
            return 1;
        }
        else {
            return 0;
        }
    }
}
