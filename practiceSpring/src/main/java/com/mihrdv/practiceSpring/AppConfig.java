package com.mihrdv.practiceSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier ("bean1")
    public PracticeClass firstBean(){
        return new PracticeClass("Variable from first bean");
    }

    @Bean
    @Qualifier("bean2")
    public PracticeClass secondBean(){
        return new PracticeClass("Variable from second bean");
    }
}
