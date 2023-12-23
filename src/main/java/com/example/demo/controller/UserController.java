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
import com.example.demo.domain.UserResponse;
import com.example.demo.service.UserService;
import com.example.demo.util.covert.UserCovert;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserCovert userCovert;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Integer id) {

        try {

            UserEntity entity = userService.getUser(id);
            UserResponse response = userCovert.covertResponse(entity);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<UserResponse>> getUserAll() {

        try {

            List<UserEntity> entities = userService.getUserAll();
            List<UserResponse> responses = userCovert.covertResponses(entities);

            return ResponseEntity.ok(responses);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("user/create")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        try {

            UserEntity entity = userService.createUser(request);
            UserResponse response = userCovert.covertResponse(entity);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
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
