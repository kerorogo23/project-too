package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.UserEntity;
import com.example.demo.domain.UserRequest;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Integer id) {

        UserEntity result = userService.getUser(id);

        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<String> getUserAll() {

        return null;
    }

    @PostMapping("user/create")
    public ResponseEntity<String> createUser(@RequestBody UserRequest request) {
        // TODO: process POST request

        return null;
    }

    @PutMapping("user/update")
    public ResponseEntity<String> updateUser(@RequestBody UserRequest request) {
        // TODO: process PUT request

        return null;
    }

    @DeleteMapping()
    public void deleteUser() {

    }
}
