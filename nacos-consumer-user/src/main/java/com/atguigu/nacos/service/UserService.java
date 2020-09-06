package com.atguigu.nacos.service;

import com.atguigu.nacos.bean.User;
import com.atguigu.nacos.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Autowired
    MovieFeignClient movieFeignClient;
    public Map<String, Object> getUserAndMovie(Integer id) {
        Map<String, Object> map = new HashMap<>();
        User user = getUser(id);
        map.put("user",user);
        //电影信息需要远程访问电影服务才可以查询到
        map.put("movie",movieFeignClient.getMovie(id));
        return map;
    }
}
