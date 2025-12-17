package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistance.Entity;
import jakarta.persistance.Id;

@entity
public class StudentEntity{
    @Id
    @Gener
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date createAt;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Date getCreateAt(){
        return createAt;
    }
    public void setCreateAt(Date createAt){
        this.createAt = createAt;
    }
    public void StudentEntity(){

    }
    public StudentEntity(Integer id,String name,String email,String password,Date createAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.createAt = createAt;
    }
 }