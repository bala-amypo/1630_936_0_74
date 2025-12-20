package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.example.demo.entity.TimeStamp;
import com.example.demo.repository.TimeStampRepository;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.TimeStampService;  



@Service
public class TimeStampImpl implements TimeStampService{
    @Autowired TimeStampRepository valid;
    @Override
    public TimeStamp postData(TimeStamp val){
        return valid.save(val);  
    }
}