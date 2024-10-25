package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private final PracticeClass practiceClass;

    private Environment environment;

    public String printAppName(){
        return environment.getProperty("spring.application.name");
    }

    public String printJavaVer(){
        System.out.print("Java version: ");
        return environment.getProperty("java.version");
    }

    public String printOsName(){
        System.out.print("OS name: ");
        return environment.getProperty("os.name");
    }

    @Autowired
   public AppService (PracticeClass practiceClass){
        this.practiceClass = practiceClass;
    }

    public String message(){
        return "The dependency says: "+ practiceClass.returnHello();
    }


    //Setter for environment
    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
