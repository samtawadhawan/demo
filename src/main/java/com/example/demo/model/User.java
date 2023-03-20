package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userID;

    @Column(name="user_name")
    String userName;

    @Column(name = "mood")
    String mood;

    @Column(name="user_message", length = 350)
    String userMessage;
}
