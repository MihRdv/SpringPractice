package com.example.FirstSpring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> studentInfo(){
        return List.of(new Student(20, "John", "John@gmail.com", LocalDate.of(2004, 6, 10), 1L));
    }
}
