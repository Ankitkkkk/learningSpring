package com.testapi.service;

import com.testapi.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    List<User> inMemData = new ArrayList<>();

    public List<User> getAllUser(){
        return this.inMemData;
    }

    public User addUser(User user){
        this.inMemData.add(user);
        return user;
    }

    public User getUserById(Integer id){
        for(User user : this.inMemData){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public User updateById(User user){
        for(User user2 : this.inMemData){
            if(user2.getId().equals(user.getId())){
                user2.setName(user.getName());
                user2.setAge(user.getAge());
                return user2;
            }
        }
        return null;
    }

    public Boolean deleteById(Integer id){
        Iterator it = this.inMemData.iterator();
        while (it.hasNext()){
            User user = (User)it.next();
            if(user.getId().equals(id)){
                it.remove();
                return true;
            }
        }
        return false;
    }
}
