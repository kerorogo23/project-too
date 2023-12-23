package com.example.demo.util.covert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.database.UserEntity;

import com.example.demo.domain.UserResponse;

@Component
public class UserCovert {

    public UserResponse covertResponse(UserEntity entity) {

        UserResponse userResponse = new UserResponse();

        userResponse.setId(entity.getId());
        userResponse.setName(entity.getName());
        userResponse.setAge(entity.getAge());

        return userResponse;
    }

    public List<UserResponse> covertResponses(List<UserEntity> entities) {

        List<UserResponse> responses = new ArrayList<>();

        for (UserEntity entity : entities) {
            responses.add(covertResponse(entity));
        }

        return responses;
    }
}
