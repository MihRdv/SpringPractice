package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired //Instance of field injection
    private PracticeClass practiceClass;

    public String message(){
        return "The dependency says: "+ practiceClass.returnHello();
    }
}
