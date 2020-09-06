package com.atguigu.nacos.controller;

import com.atguigu.nacos.bean.User;
import com.atguigu.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //查询用户信息
    @GetMapping("/getUser")
    public User getUser(Integer id){
        return userService.getUser(id);
    }

    //查询用户和电影信息
    @GetMapping("/getUserAndMovie")
    public Map<String , Object> getUserAndMovie(Integer id){
        return userService.getUserAndMovie(id);
    }
}
