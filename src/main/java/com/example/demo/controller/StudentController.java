package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping()
    public Stuentity postdata(@RequestBody Stuentity stuentity){
        return studentService.saveStudent(stuentity);
    }
}