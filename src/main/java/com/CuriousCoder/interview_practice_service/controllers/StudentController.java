package com.CuriousCoder.interview_practice_service.controllers;

import com.CuriousCoder.interview_practice_service.model.Student;
import com.CuriousCoder.interview_practice_service.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;
     public StudentController(){
         System.out.println("Student controller object create at address" + this.hashCode());
     }
    @GetMapping("/student")
    public int getStudentAddress(){
        Student s1 = studentServices.getStudent();
        return s1.hashCode();
    }
}
