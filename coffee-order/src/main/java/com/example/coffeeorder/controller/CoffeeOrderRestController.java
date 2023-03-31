package com.example.coffeeorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeOrderRestController {

    @GetMapping("/coffeeorder")
    public String coffeeorder(){
        return "coffee-order service";
    }
}
