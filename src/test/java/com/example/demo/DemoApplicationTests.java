package com.example.demo;

import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void shouldGetStudentBooks(@Autowired StudentRepository repository) {
        var result = repository.findAll().stream().map(student -> {

            System.out.println(student.getBook());

            return student.getBook();
        }).toList();

        assertThat(result).isNotEmpty();
    }

}
