package com.example.demo.Serviceimpl;

import org.springframework.stereotype.Service;`

import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {

   private final StudentRepository studentRepository;
   public StudentServiceImple(StudentRepository studentRepository){
    this.studentRepository=studentRepository;
   }

 public Stuentity saveStudent(Stuentity student){
    return 
 }
}