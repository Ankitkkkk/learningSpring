package com.testapi.service;

import com.testapi.data.User;
import com.testapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> addUser(User user){
        System.out.println(userRepository.save(user));
        return userRepository.findByName(user.getName());
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
