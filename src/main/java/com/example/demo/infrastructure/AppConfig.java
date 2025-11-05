package com.example.demo.infrastructure;

import com.example.demo.application.PrintNameUseCaseImpl;
import com.example.demo.domain.PrintNameUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PrintNameUseCase printNameUseCase() {
        return new PrintNameUseCaseImpl();
    }
}
