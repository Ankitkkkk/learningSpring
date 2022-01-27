package com.testapi.repository;

import com.testapi.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);
    List<User> findByName(String name);

    List<User> findAll();
}
