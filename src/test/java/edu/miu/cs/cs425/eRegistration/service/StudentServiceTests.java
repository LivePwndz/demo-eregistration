package edu.miu.cs.cs425.eRegistration.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTests {

    @Autowired
    private StudentService studentService;

    @Test
    public void shouldGetListOfRegisteredStudent() {
        studentService.getListOfStudents();
    }
}
