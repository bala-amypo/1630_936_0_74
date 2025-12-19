package com.example.demo.entity;

public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Date createAt;
    private LocalDate updateAt;
}