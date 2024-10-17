package com.example.FirstSpring.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> studentInfo(){
        return List.of(new Student(20, "John", "John", LocalDate.of(2004, 6, 10), 1L));
    }
}
