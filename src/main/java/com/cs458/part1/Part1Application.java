package com.cs458.part1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Part1Application {

	public static void main(String[] args) {
		SpringApplication.run(Part1Application.class, args);
	}

}
