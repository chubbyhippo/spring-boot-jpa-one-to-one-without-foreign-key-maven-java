package com.example.demo.repository;

import com.example.demo.dto.StudentBookDtoInterface;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select Student.name, Book.title from Student inner join Book on Student.name = Book.author",
            nativeQuery = true)
    List<StudentBookDtoInterface> findStudentBooksDtoInterface();
}
