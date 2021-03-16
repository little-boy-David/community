package com.example.test.serviceimpl;

import com.example.test.bean.User;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(String phone, String passWord) {
        User user = new User();
        user.setPhone(phone);
        user.setPassWord(passWord);
        User user1 = userMapper.selectUser(user);
        if (user1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public int register(String username, String address, String phone, String password) {
        User user=new User();
        user.setUserName(username);
        user.setAddress(address);
        user.setPhone(phone);
        user.setPassWord(password);
        int finsh =userMapper.inserUser(user);//mybatis中插入语句的返回值是新增数据的主键id
        if(finsh>0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
