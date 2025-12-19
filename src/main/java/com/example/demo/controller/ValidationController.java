package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

@RestController
public class ValidationController{
    @Autowired  ValidationService service;
    @PostMapping("/valpost")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
        return service.postdata(val);
    }
    @GetMapping("/valfind/{id}")
    public ValidationEntity find(@PathVariable int id){
        return service.getdata(id);
    }
}