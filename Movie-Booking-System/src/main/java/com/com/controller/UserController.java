package com.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.model.User;
import com.com.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/registerUser")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @GetMapping("/getByName/{username}/{password}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String email,@PathVariable String password) {
        User user = userService.loginUser(email,password);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }
    
}
