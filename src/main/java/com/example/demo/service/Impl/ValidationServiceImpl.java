package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.ValidationRepository;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.ValidationService;  

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired ValidationRepository valid;
    @Override
    public StudentEntity postData(ValidationEntity val){
        return valid.save(stu);  
    }
}