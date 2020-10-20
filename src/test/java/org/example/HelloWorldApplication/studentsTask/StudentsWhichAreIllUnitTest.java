package org.example.HelloWorldApplication.studentsTask;

import java.util.List;

import org.example.HelloWorldApplication.studentsTask.people.Person;
import org.example.HelloWorldApplication.studentsTask.people.Student;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class StudentsWhichAreIllUnitTest {

    private Logger logger;

    public StudentsWhichAreIllUnitTest(){
        logger = LoggerFactory.getLogger(this.getClass());
    }

    @Test
    void GIVEN_two_lists_with_overlap_WHEN_findOverlap_is_called_THEN_collection_containing_overlap_is_returned() {
        List<Person> overlap = new StudentsWhichAreIll().findOverlapBetweenStudentsAndPeople();
        logger.info(overlap.toString());
        assert(overlap.size() == 2);
    }

    @Test
    void GIVEN_two_lists_with_overlap_WHEN_findOverlap_is_called_THEN_resulting_collection_contains_Fritz_Schmidt(){
        List<Person> overlap = new StudentsWhichAreIll().findOverlapBetweenStudentsAndPeople();
        assert(overlap.stream().anyMatch(it -> it.firstName == "Fritz" && it.lastName == "Schmidt"));
    }

    @Test
    @Disabled
    void GIVEN_two_lists_with_overlap_WHEN_findOverlap_is_called_THEN_resulting_collection_contains_Hans_Müller(){
        List<Person> overlap = new StudentsWhichAreIll().findOverlapBetweenStudentsAndPeople();
        assert(overlap.contains(new Person("Fritz", "Schmidt")));
    }
}