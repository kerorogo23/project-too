package com.example.demo.depository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
