package com.performanse.todolist.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@Entity
@Table(name="note")
public class Note {

    @Id
    @Column(name = "note_id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "createdat")
    private Timestamp createdAt;

    @Column(name = "updatedat")
    private Timestamp updatedAt;

    @ManyToOne
    @JoinColumn(name = "createdby")
    private User author;






}
