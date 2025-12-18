package com.example.demo.service.Impl;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    @Override
    public StudentEntity postData(ValidationEntity val){
        return student.save(stu);  
    }
}