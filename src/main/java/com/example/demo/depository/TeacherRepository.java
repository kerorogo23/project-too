package com.example.demo.depository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {

}
