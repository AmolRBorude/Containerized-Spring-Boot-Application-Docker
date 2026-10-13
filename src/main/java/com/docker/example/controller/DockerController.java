package com.docker.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {


    @GetMapping("/")
    public String home() {
        return "Spring Boot Docker Application is Running!";
    }
}