package org.example.HelloWorldApplication.studentsTask;

import java.util.List;
import java.util.stream.Collectors;

import org.example.HelloWorldApplication.studentsTask.people.*;

public class StudentsWhichAreIll {
    public static List<Person> findOverlapBetweenStudentsAndPersons(List<Student> students, List<Person> illPeople) {
        return students.stream().filter(it -> {
            return illPeople.stream()
            .map(shadowIt -> peopleDoMatch(it, shadowIt))
            .anyMatch(matchedWithOtherList -> matchedWithOtherList);
        }).collect(Collectors.toList());
    }

    public static Boolean peopleDoMatch(Person person, Person personToCompareTo) {
        Boolean firstNameMatches = person.firstName == personToCompareTo.firstName;
        Boolean lastNameMatches = person.lastName == personToCompareTo.lastName;
        return firstNameMatches && lastNameMatches;
    }
}