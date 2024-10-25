package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private PracticeClass practiceClass;

    @Autowired //Instance of method injection
    public void injectDependency(PracticeClass practiceClass){
        this.practiceClass = practiceClass;
    }

    public String message(){
        return "The dependency says: "+ practiceClass.returnHello();
    }
}
