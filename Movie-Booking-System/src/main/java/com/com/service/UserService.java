package com.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.model.User;
import com.com.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // Registration logic
    public User registerUser(User user) {
           return userRepository.save(user);
     }


    // Login logic
    public User loginUser(String email, String password) {
    	 return userRepository.findByEmailAndPassword(email, password);
    
    }
}