package com.CuriousCoder.interview_practice_service.services;

import com.CuriousCoder.interview_practice_service.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentServices {
    @Autowired
    private Student student;
    public StudentServices(){
        System.out.println("Student address at service");
    }

    public Student getStudent(){
      return  student;
    }


}
