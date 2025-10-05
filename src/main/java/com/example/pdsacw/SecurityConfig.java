package com.example.pdsacw;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())  // disable CSRF for Postman testing
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());// allow all requests without login
        return http.build();
    }
}
