package com.example.demo.repository;

import com.example.demo.config.DataLoader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import(DataLoader.class)
class StudentRepositoryTest {

    @Test
    void shouldGetStudentBooksDtoInterface(@Autowired StudentRepository repository) {
        repository.findStudentBooks().forEach(studentBookDto -> {

            assertThat(studentBookDto.getName()).isNotNull();
            System.out.println(studentBookDto.getName());

            assertThat(studentBookDto.getTitle()).isNotNull();
            System.out.println(studentBookDto.getTitle());

        });
    }


}