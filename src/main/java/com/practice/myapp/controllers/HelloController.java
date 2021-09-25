package com.practice.myapp.controllers;

import com.practice.myapp.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/getMessage")
    public String getMessage(){
        return "Message from Controller";
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        List<Employee> employees =
                Arrays.asList(new Employee(1, "Sam", 22, "Amsterdam"),
                      new Employee(2, "Amy", 28, "Brussels"),
                      new Employee(3, "Nicole", 19, "Munich"));
        return employees;
    }
}
