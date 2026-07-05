package com.anubhuti.online_quiz_application.controller;

import com.anubhuti.online_quiz_application.entity.User;
import com.anubhuti.online_quiz_application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/test")
    public String test() {
        return "Controller Working!";
    }

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {

        return userService.registerUser(user);

    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {

        return userService.loginUser(
                user.getEmail(),
                user.getPassword()
        );

    }
}