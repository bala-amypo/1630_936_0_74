package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;   
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;                

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    public StudentEntity postData(StudentEntity stu){
        return student.save
    }
}