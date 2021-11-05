package com.performanse.todolist.model;

import lombok.Data;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;


@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    private Timestamp birthday;

    @OneToMany(mappedBy = "id")
    private List<Note> notes;



    public static String generateID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


}
