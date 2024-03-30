package com.example.firstspringbootApplication.FirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAppController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/hello")
    public String sayHello1(){
        return "Hello World1";
    }

    @GetMapping("/fortune")
    public String sayHello2(){
        return "Hello World1";
    }

    @Value("${first.name}")
    private String firstName;

    @Value("${last.name}")
    private String lastName;

    @GetMapping("/myinfo")
    public String  myinfo(){
        return "firstname " + firstName + ", Lastname " + lastName;
    }

}
