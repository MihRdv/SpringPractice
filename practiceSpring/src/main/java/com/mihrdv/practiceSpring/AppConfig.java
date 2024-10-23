package com.mihrdv.practiceSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("practiceClass")
    public PracticeClass practiceClass(){
        return new PracticeClass();
    }
}
