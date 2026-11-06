package com.msvc.employee.infraestructure.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordEncoder {

    public PasswordEncoder passwordEncoder() {
        return new PasswordEncoder();
    }
}