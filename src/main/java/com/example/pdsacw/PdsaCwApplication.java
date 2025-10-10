package com.example.pdsacw;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.Key;
import java.util.Base64;

@SpringBootApplication
public class PdsaCwApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdsaCwApplication.class, args);
	}
}
