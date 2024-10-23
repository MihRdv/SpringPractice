package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public PracticeClass firstBean(){
        return new PracticeClass("Variable from first bean");
    }

    @Bean
    public PracticeClass secondBean(){
        return new PracticeClass("Variable from second bean");
    }

    @Bean
    @Primary //Primary is the one which will always be selected as default
    public PracticeClass thirdBean(){
        return new PracticeClass(("Variable from third bean"));
    }
}
