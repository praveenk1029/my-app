package com.practice.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getMessage")
    public String getMessage(){
        return "Message from Controller";
    }
}
