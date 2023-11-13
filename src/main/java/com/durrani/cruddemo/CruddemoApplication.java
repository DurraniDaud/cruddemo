package com.durrani.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(String [] args){
		return runnner -> {
			System.out.println("Hello world");
		};
}
}
