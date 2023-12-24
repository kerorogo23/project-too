package com.example.demo.database;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String email;

    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private DepartmentEntity department;

    @ManyToMany(mappedBy = "teachers")
    private List<StudentEntity> studentEnties;
}
