package com.eu.demo.controller;

import com.eu.demo.common.Result;
import com.eu.demo.common.StatusCode;
import com.eu.demo.pojo.User;
import com.eu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public Result login(@RequestParam("username")String username,
                        @RequestParam("password")String password){
        User user = new User(username, password);
        User userDb = userService.login(user);
        if (userDb == null){
            return new Result(false, StatusCode.LOGINERROR,"登录失败");
        }
        return new Result(true,StatusCode.OK,"登陆成功",userDb);
    }
}
