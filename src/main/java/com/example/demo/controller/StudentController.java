package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Restcontroller;
import com.example.demo.service.StudentService;

@Restcontroller
public class StudentController{
    @Autowired  StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody )
}