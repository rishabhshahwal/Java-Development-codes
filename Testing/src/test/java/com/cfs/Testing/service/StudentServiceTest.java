package com.cfs.Testing.service;

import com.cfs.Testing.entity.student;
import com.cfs.Testing.repo.StudentRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentServiceTest {

    @Autowired
    private StudentRepository repo;

    @Autowired
    private StudentService service;

    @Test
    @Order(1)
    void shouldAddStudentSuccessfully()
    {
        student s=new student(null,"rishu","rishhu@gmail.com",22);
        student saved=service.addStudent(s);

        assertNotNull(saved.getId());
        assertEquals("rishu",saved.getId());
    }
}
