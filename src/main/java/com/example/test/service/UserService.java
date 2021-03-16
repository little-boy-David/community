package com.example.test.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean login(String phone,String password );
    int register(String username,String address,String phone,String password);
}
