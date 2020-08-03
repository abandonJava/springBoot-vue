package com.eu.demo.dao;

import com.eu.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User findByUserName(String userName);
}
