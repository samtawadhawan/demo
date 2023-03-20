package com.example.demo.controller;

import com.example.demo.service.UserMoodService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserMoodController {

    @Autowired
    UserMoodService userMoodService;

    @PostMapping
    public User saveUserMood(@RequestBody User user){
        return userMoodService.addUserMood(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userMoodService.getAllUsers();
    }
}
