package com.HM.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(Exception.class)
    public void doException(Exception ex){
        System.out.println("xxxxx");
    }
}
