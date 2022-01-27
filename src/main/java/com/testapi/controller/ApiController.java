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

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    @PutMapping("/users")
    public User updateUserById(@RequestBody User user){
        return userService.updateById(user);
    }

    @DeleteMapping("/users/{id}")
    public Boolean deleteById(@PathVariable("id") Integer id){
        return userService.deleteById(id);
    }
}
