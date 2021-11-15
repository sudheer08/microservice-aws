package com.ksr.davenger.microserviceaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/")
    public String greetingWorld(){
        return "Hello, Welcome to my First Spring Boot API";
    }
}
