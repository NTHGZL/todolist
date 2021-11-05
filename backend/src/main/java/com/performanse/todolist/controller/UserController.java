package com.performanse.todolist.controller;

import com.performanse.todolist.model.User;
import com.performanse.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.net.HttpRetryException;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user)  {
        user.setId(User.generateID());

        try{
            userService.saveUser(user);

            return user;
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.CONFLICT);

        }

    }
}
