package com.example.demo.controller;

import org.springframework.web.bind.annotation.Restcontroller;

@Restcontroller
public class StudentController{
    @Autowired  StudentService ser;
}