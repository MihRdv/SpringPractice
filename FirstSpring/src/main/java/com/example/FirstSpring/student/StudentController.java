package com.example.FirstSpring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    public static void main(String[] args) {SpringApplication.run(StudentController.class,args);
    }

    @GetMapping
    public List<Student> studentInfo(){
        return studentService.studentInfo();
    }
}
