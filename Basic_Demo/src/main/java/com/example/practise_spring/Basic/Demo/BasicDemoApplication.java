package com.example.practise_spring.Basic.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicDemoApplication {

	public static void main(String[] args) {
		//Application Context
		ApplicationContext applicationContext=
		SpringApplication.run(BasicDemoApplication.class, args);
		applicationContext.getBean(BinarySearchImpl.class);
	}
}
