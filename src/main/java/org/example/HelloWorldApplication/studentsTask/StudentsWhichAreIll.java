package org.example.HelloWorldApplication.studentsTask;

import java.util.List;
import java.util.stream.Collectors;

import org.example.HelloWorldApplication.studentsTask.people.*;

public class StudentsWhichAreIll {

    public List<Student> students;
    public List<Person> illPeople;

    public StudentsWhichAreIll() {
        students = getListOfStudents();
        illPeople = getListOfIllPeople();
    }

    public List<Person> findOverlapBetweenStudentsAndPeople() {
        // Implement a method (or methods) that returns the overlapt between IllPeople and Students.
        // Run `mvn test` at any time to see whether your solution is correct.
        return List.of();
    }

    private List<Student> getListOfStudents() {
        return List.of(
            new Student("Hans", "Müller"),
            new Student("John","Doe"),
            new Student("Max","Mustermann"),
            new Student("Fritz", "Schmidt")
        );
    }

    private List<Person> getListOfIllPeople(){
        return List.of(
            new Person("Karl","Meier"),
            new Person("Fritz","Schmidt"),
            new Person("Max","Doe"),
            new Person("Hans","Müller"),
            new Person("Sebastian","Lee")
        );
    }
}