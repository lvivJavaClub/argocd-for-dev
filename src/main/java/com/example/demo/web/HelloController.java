package com.example.demo.web;

import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostConstruct
    public void init() {
        System.out.println("asdf");
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from controller";
    }

}
