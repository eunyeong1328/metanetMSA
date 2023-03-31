package com.example.coffeestatus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeStatusRestController {

    @GetMapping("/coffeestatus")
    public String coffeeostatus(){
        return "coffee-status service";
    }
}
