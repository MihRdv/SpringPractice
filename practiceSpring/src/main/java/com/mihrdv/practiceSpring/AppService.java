package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private final PracticeClass practiceClass;

    @Autowired
    public AppService(PracticeClass practiceClass) {
        this.practiceClass = practiceClass;
    }

    public String message(){
        return "The dependency says: "+ practiceClass.returnHello();
    }
}
