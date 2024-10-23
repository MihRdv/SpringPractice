package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private final PracticeClass practiceClass;

    @Autowired
    public AppService(@Qualifier("bean2") PracticeClass practiceClass) {
        this.practiceClass = practiceClass;
    }

    public String message(){
        return "The dependency says: "+ practiceClass.returnHello();
    }
}
