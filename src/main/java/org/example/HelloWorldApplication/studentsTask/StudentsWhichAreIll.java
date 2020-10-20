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
        return students.stream().filter(it -> {
            return illPeople.stream()
            .map(shadowIt -> peopleDoMatch(it, shadowIt))
            .anyMatch(matchedWithOtherList -> matchedWithOtherList);
        }).collect(Collectors.toList());
    }

    public Boolean peopleDoMatch(Person person, Person personToCompareTo) {
        Boolean firstNameMatches = person.firstName == personToCompareTo.firstName;
        Boolean lastNameMatches = person.lastName == personToCompareTo.lastName;
        return firstNameMatches && lastNameMatches;
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