package com.danyon.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.danyon.controller","com.danyon.bean"})
public class LetterCountApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetterCountApplication.class, args);
	}

}
