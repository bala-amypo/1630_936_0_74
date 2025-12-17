package com.example.demo.entity;

@entity
public class StudentEntity{
    private Integer id;
    private String username;
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
    public void setName(String name)
 }