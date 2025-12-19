package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.ValidationService;  
import com.example.demo.exception.ValidationException;


@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepository valid;
    @Override
    public ValidationEntity postdata(ValidationEntity val){
        return valid.save(val);  
    }
    @Override
    public ValidationEntity getdata(Long id){
    return valid.findById(id).orElseThrow(()->new ("Invalid Id" + id));
    }
}