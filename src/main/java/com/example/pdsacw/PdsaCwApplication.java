package com.example.pdsacw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.Console;

@SpringBootApplication
public class PdsaCwApplication {

	public static void main(String[] args) {

		SpringApplication.run(PdsaCwApplication.class, args);

		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashed = encoder.encode("12345678");
		System.out.println(hashed);
	}



}
