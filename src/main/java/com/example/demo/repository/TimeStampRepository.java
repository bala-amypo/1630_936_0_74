package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.TimeStamp;

@Repository
public interface TimeStampRepository extends JpaRepository<TimeStamp,Integer>{
   
}