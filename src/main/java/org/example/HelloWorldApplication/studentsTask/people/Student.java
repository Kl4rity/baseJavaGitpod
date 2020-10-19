package org.example.HelloWorldApplication.studentsTask.people;

import java.util.UUID;

public class Student extends Person {

    public String firstName;
    public String lastName;
    public String studentId;

    public Student(String firstName, String lastName){
        super(firstName, lastName);
        this.studentId = UUID.randomUUID().toString();
    }

    public Student(String firstName, String lastName, String studentId){
        super(firstName, lastName);
        this.studentId = studentId;
    }
}