package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.find.annotation.RestControllerAdvice;
import org.springframework.web.find.annotation.ExceptionHandler;
import org.springframework.web.find.annotation.ResponseBody;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }
}