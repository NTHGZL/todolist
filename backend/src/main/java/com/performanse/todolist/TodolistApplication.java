package com.performanse.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String user_id = UUID.randomUUID().toString().replaceAll("-", "");



        System.out.println(user_id);
    }
}
