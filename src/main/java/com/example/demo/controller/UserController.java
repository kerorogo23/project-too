package com.example.demo.controller;

import java.util.List;

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

        try {

            UserEntity result = userService.getUser(id);

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<UserEntity>> getUserAll() {

        try {

            List<UserEntity> results = userService.getUserAll();

            return ResponseEntity.ok(results);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("user/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserRequest request) {
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
