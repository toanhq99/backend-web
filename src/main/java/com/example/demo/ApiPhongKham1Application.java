package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

@SpringBootApplication
public class ApiPhongKham1Application {
	public static void main(String[] args) {
		SpringApplication.run(ApiPhongKham1Application.class, args);
	}
}
