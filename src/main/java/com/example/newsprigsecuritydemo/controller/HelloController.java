package com.example.newsprigsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping
    public String hello() {
        return "Hello!";
    }


    @GetMapping("/user")
    public String helloUser() {
        return "Hello, User!";

    }

    @GetMapping("/admin")
    public String helloAmdmin() {
        return "Hello, Admin!";

    }
}
