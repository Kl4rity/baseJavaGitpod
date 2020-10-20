package org.example.HelloWorldApplication.studentsTask.people;

import java.util.UUID;

public class Student extends Person {

    public String studentId;

    public Student(String firstName, String lastName){
        super(firstName, lastName);
        this.studentId = UUID.randomUUID().toString();
    }

    public Student(String firstName, String lastName, String studentId){
        super(firstName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + " Student ID: " + studentId; 
    }
}