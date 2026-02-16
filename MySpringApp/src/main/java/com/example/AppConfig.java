package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
    @Bean("Movie1")
    public Movie getMovie1(){
        return new Movie();
    }

    @Bean("Movie2")
    public Movie getMovie2(){
        return new Movie();
    }

    @Bean("Chocolates1")
    public Chocolates getChocolates1(){
        return new Chocolates();
    }

    @Bean("Chocolates2")
    public Chocolates getChocolates2(){
        return new Chocolates();
    }
}
