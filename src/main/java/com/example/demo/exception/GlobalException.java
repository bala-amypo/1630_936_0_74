package com.example.demo.exception;

import org.springframework.web.find.annotation.RestControllerAdvice;
import org.springframework.web.find.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
}