package com.CuriousCoder.interview_practice_service.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public  Student(){
        System.out.println("Student object create at address" + hashCode());
    }
}
