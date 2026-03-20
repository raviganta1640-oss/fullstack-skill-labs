package com.klu.SpringDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student(201, "Ravi", "Spring Framework", 2);
    }
}