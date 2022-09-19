package com.example.myspringconsolehelloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(2)
public class MySpringConsoleHelloWorldApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of main!");
        SpringApplication.run(MySpringConsoleHelloWorldApplication.class, args);
        System.out.println("End of main!");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot!");
    }
}