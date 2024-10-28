package com.mihrdv.RestPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @GetMapping
    public String printMessage(){
        return "This is a practice app";
    }
}
