package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.UserEntity;
import com.example.demo.depository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity getUser(Integer id) {

        Optional<UserEntity> result = userRepository.findById(id);

        return result.orElse(null);
    }

    public List<UserEntity> getUserAll() {

        List<UserEntity> results = userRepository.findAll();

        return results;
    }
}
