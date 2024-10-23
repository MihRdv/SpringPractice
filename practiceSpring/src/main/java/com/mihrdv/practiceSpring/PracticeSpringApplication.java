package com.mihrdv.practiceSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeSpringApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(PracticeSpringApplication.class, args);

		PracticeClass practiceClass = ctx.getBean(PracticeClass.class);
		//Printing to console via dependency injection
		System.out.println(practiceClass.returnHello());
	}

	//Alternatively instead of creating a bean I can make the entire class into a component
	//@Bean
	public PracticeClass practiceClass(){
		return new PracticeClass();
	}
}
