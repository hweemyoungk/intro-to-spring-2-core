package com.example.introtospring2core;

import com.example.introtospring2core.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IntroToSpring2CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpring2CoreApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
		System.out.println();
	}

}
