package com.cognizant.greet.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetController {
    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
}