package com.performanse.todolist.service;

import com.performanse.todolist.model.User;
import com.performanse.todolist.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public User saveUser(User user) throws Exception{

        try{
            return userRepository.save(user);
        }catch (Exception e){
            throw new Exception(e);
        }


    }
}
