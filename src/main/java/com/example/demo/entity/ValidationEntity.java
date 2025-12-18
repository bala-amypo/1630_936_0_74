package com.example.demo.Entity;

import java.util.*;t
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;

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
    @Max (6)
    @NotNull(message = "Password is mandatory")
    private String password;
    @Size(min = 18,max = 58,message = "Age must be 18 to 58")
    @Positive(message = "Age must be positive number")
    private int age;

    public void setId(Long id){
        this.id = id;
        }
    public Long getId(){
        return id;
        }
    public String getUsername(){
        return name;
        }
    public void setUsername(String username){
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
    public int getAge(){
        return age;         
        }
    public void setAge(int age){
        this.age = age;
        }
    public ValidationEntity(){
    }
    public ValidationEntity(Long id, @NotNull
    @Size(min = 2,max = 10,message = "must be 2 to 10 character") String username;
    @Email(message = "Email is not valid")
     String email;
    @Max (6)
    @NotNull(message = "Password is mandatory")
     String password;
    @Size(min = 18,max = 58,message = "Age must be 18 to 58")
    @Positive(message = "Age must be positive number")
     int age;){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
     }
}