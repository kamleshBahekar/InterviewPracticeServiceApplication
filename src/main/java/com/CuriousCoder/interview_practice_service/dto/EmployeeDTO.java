package com.CuriousCoder.interview_practice_service.dto;

import com.CuriousCoder.interview_practice_service.entity.Employee;

public class EmployeeDTO {

    private String name;
    private String dept;
    private String age;

    // Default constructor (required by frameworks/deserializers)
    public EmployeeDTO() {
    }

    // All-args constructor
    public EmployeeDTO(String name, String dept, String age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    // Mapping Constructor
    public EmployeeDTO(Employee employee) {
        if (employee != null) {
            this.name = employee.getName();
            this.dept = employee.getDept();
            // If employee.getAge() returns an int/Integer:
            // this.age = String.valueOf(employee.getAge());
            this.age = employee.getAge();
        }
    }

    // Optional: Static factory method alternative
    public static EmployeeDTO fromEntity(Employee employee) {
        return new EmployeeDTO(employee);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}