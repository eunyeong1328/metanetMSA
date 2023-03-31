package com.example.coffeeorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CoffeeOrderApplication {

    @GetMapping("/coffeeorder")
    public static void main(String[] args) {
        SpringApplication.run(CoffeeOrderApplication.class, args);
    }

}
