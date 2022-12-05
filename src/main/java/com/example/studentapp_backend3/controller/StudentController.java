package com.example.studentapp_backend3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("/")
    public String Homepage()
    {
        return  "Welcome to homepage";

    }

    @GetMapping("/contact")
    public String ContactPage()
    {
        return " welcome to contact page";
    }

    @GetMapping("/gallery")
    public String Gallery()
    {
     return "Welcome to my gallery";
    }


    @GetMapping("/home")
    public String Home()
    {
        return "Welcome to my Home";
    }
}
