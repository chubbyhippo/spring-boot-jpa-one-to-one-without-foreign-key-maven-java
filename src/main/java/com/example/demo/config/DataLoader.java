package com.example.demo.config;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader {

    private final BookRepository bookRepository;
    private final StudentRepository studentRepository;

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            bookRepository.save(new Book(1L,
                    "Hippo",
                    9.99,
                    "Hippo Study"));
            studentRepository.save(Student.builder()
                            .id(1L)
                            .name("Hippo")
                            .gpa(3.99)
                    .build());
        };
    }
}
