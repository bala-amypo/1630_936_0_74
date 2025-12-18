package com.example.demo.Entity;


import jakarta.persistence.Entity;


@Entity
public class ValidationEntity {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    private Integer age;
}