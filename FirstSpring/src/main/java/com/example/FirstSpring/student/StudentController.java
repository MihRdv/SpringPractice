package com.example.FirstSpring.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@SpringBootApplication
public class StudentController {
    public static void main(String[] args) {SpringApplication.run(StudentController.class,args);
    }

    @GetMapping("/students")
    public List<Student> studentInfo(){
        return List.of(new Student(20, "John", "John", LocalDate.of(2004, 6, 10), 1L));
    }
}
