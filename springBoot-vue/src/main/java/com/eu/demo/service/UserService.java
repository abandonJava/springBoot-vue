package com.eu.demo.service;

import com.eu.demo.dao.UserMapper;
import com.eu.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(User user){
        User userDb = userMapper.findByUserName(user.getUserName());
        if (userDb != null && userDb.getPassWord().equals(user.getPassWord())){
            return userDb;
        }
        return null;
    }
}
