package com.example.demo.subject;

import com.example.demo.student.Student;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

public class Subject {
    @Id
    @GeneratedValue
    Long id;
    private String name ;



    private Set<Student> enrolledStudents=new HashSet<>();

    public Subject(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }



}
