package com.example.demo.database;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String gender;

    private String address;

    private String email;

    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private DepartmentEntity department;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_teacher", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<TeacherEntity> teachers;
}
