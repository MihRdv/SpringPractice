package com.example.FirstSpring.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private Integer age;
    private String name;
    private String email;
    private LocalDate dob;

    //Empty constructor
    public Student() {
    }

    //Constructor with every variable
    public Student(Integer age, String name, String email, LocalDate dob, Long id) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.id = id;
    }

    //Constructor without ID
    public Student(LocalDate dob, String name, String email, Integer age) {
        this.dob = dob;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
