package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService{
    StudentEntity postData(StudentEntity stu);
    List<StudentEntity>getAllData();
}