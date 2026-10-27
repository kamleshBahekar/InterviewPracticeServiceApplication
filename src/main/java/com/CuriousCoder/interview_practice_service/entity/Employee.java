package com.CuriousCoder.interview_practice_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    Integer id;
    String name;
    String dept;
    String age;

    public Employee() {}

    public Employee(String dept, Integer id, String name, String age) {
        this.dept = dept;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
