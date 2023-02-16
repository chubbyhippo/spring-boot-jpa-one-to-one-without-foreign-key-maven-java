package com.example.demo;

import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private StudentRepository repository;

    @Test
    void shouldGetStudentBooks() {
        repository.findAll().forEach(student -> System.out.println(student.getBook()));
    }

}
