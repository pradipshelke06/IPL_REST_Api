package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IplRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplRestApiApplication.class, args);
		System.err.println("Api Started...");
	}

}
