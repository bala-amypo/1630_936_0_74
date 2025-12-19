package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.http.ResponseEntity;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException(ValidationException ex){
        return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }
}