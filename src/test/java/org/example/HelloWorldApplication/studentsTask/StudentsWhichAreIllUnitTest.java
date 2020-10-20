package org.example.HelloWorldApplication.studentsTask;

import java.util.List;

import org.example.HelloWorldApplication.studentsTask.people.Person;
import org.example.HelloWorldApplication.studentsTask.people.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class StudentsWhichAreIllUnitTest {

    private Logger logger;
    public List<Student> students;
    public List<Person> illPeople;

    public StudentsWhichAreIllUnitTest(){
        logger = LoggerFactory.getLogger(this.getClass());
    }

    @BeforeEach
    void setup() {
        students = getListOfStudents();
        illPeople = getListOfIllPeople();
    }

    @Test
    void GIVEN_two_lists_with_overlap_WHEN_findOverlap_is_called_THEN_collection_containing_overlap_is_returned() {
        List<Person> overlap = StudentsWhichAreIll.findOverlapBetweenStudentsAndPersons(students, illPeople);
        logger.info(overlap.toString());
        assert(overlap.size() == 2);
    }

    @Test
    void GIVEN_two_lists_with_overlap_WHEN_findOverlap_is_called_THEN_resulting_collection_contains_Fritz_Schmidt(){
        List<Person> overlap = StudentsWhichAreIll.findOverlapBetweenStudentsAndPersons(students, illPeople);
        assert(overlap.stream().anyMatch(it -> it.firstName == "Fritz" && it.lastName == "Schmidt"));
    }

    @Test
    @Disabled
    void GIVEN_two_lists_with_overlap_WHEN_findOverlap_is_called_THEN_resulting_collection_contains_Hans_Müller(){
        List<Person> overlap = StudentsWhichAreIll.findOverlapBetweenStudentsAndPersons(students, illPeople);
        assert(overlap.contains(new Student("Fritz", "Schmidt")));
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