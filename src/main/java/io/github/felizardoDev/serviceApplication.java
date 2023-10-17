package io.github.felizardoDev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class serviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(serviceApplication.class, args);
    }
    @Bean
    public CommandLineRunner initialization (){
        return args -> {
            System.out.println("Hello World!");
        };
    }
}