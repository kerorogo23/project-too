package com.example.demo.depository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
