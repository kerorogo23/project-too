package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.UserEntity;
import com.example.demo.depository.UserRepository;
import com.example.demo.domain.user.UserRequest;

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

    public UserEntity createUser(UserRequest request) {

        UserEntity entity = new UserEntity();

        entity.setName(request.getName());

        entity.setAge(request.getAge());

        return userRepository.save(entity);
    }
}
