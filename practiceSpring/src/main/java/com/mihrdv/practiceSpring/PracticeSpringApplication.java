package com.mihrdv.practiceSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(PracticeSpringApplication.class, args);

		AppService appService = ctx.getBean(AppService.class);
		//Printing to console via dependency injection
		System.out.println(appService.message());
	}


}
