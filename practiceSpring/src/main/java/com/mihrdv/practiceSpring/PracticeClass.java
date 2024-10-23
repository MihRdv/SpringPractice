package com.mihrdv.practiceSpring;

import org.springframework.stereotype.Component;

//This is how I turn the entire class into a component
@Component
public class PracticeClass {

    public String returnHello(){
        return "Hello";
    }
}
