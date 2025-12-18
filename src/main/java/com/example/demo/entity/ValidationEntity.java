package com.example.demo.Entity;

import java.util.*;t
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity
public class ValidationEntity {
    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 10,message = "must be 2 to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    @
    private String password;
    private Integer age;
}