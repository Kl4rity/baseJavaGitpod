package org.example.HelloWorldApplication.studentsTask.people;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName;
    }
}