package com.example.test.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.bean.User;
import org.springframework.stereotype.Component;

@Component(value ="userMapper")
public interface UserMapper extends BaseMapper<User> {
    public User selectUser(User user);//登录
    public int inserUser(User user);//注册
}
