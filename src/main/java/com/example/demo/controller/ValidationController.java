package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ValidationController{
    @Autowired  ValidationService service;
    @PostMapping("/valpost")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
        return val.postData(val);
    }
}