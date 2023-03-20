package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserMoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMoodService {

    @Autowired
    UserMoodRepository userMoodRepository;
    public User addUserMood(User user) {
        return userMoodRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userMoodRepository.findAll();
    }

}
