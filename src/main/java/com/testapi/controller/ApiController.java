package com.testapi.controller;


import com.testapi.data.User;
import com.testapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/")
public class ApiController {

    @Autowired
    private UserService userService;

    @PostMapping("users")
    public List<User> addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
