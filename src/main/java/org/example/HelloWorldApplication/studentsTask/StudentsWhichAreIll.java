package org.example.HelloWorldApplication.studentsTask;

import java.util.List;
import java.util.stream.Collectors;

import org.example.HelloWorldApplication.studentsTask.people.*;

public class StudentsWhichAreIll {
    public static List<Person> findOverlapBetweenStudentsAndPersons(List<Student> students, List<Person> illPeople) {
        return students.stream().filter(it -> {
            illPeople.stream().map(
                shadowIt -> {
                    return (it.firstName == shadowIt.firstName && it.lastName == shadowIt.lastName);
            }).anyMatch(matchedWithOtherList -> matchedWithOtherList);
        }).collect(Collectors.toList());
    }
}