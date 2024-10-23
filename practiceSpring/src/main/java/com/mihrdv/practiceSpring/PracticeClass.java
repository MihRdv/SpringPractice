package com.mihrdv.practiceSpring;

public class PracticeClass {
    private String myVar;

    public PracticeClass(String myVar){
        this.myVar = myVar;
    }

    public String returnHello(){
        return "Hello --> myVar = "+myVar;
    }
}
