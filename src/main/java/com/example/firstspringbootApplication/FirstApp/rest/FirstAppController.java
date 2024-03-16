package com.example.firstspringbootApplication.FirstApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAppController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/2")
    public String sayHello1(){
        return "Hello World1";
    }
}
