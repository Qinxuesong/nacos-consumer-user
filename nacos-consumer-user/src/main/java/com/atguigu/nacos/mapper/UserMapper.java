package com.atguigu.nacos.mapper;

import com.atguigu.nacos.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {
    public User getUser(Integer id) {
        return new User(id , "姜文");
    }
}
