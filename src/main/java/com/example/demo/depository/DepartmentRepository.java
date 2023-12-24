package com.example.demo.depository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

}
