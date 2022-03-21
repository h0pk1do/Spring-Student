package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Jason",
                        "jason.miles@gmail.com",
                        LocalDate.of(1998, Month.JANUARY, 15),
                        23
                )

        );

    }
}
