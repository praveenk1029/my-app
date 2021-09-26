package com.practice.myapp.controllers;

import com.practice.myapp.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Collectors;

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

    @GetMapping("/getCountries")
    public List<String> getCountries(){
        return Arrays.asList("India","US","UK", "Germany", "Netherlands", "Norway", "Poland", "UAE");
    }

    @GetMapping("/getCountriesSorted")
    public List<String> getCountriesSorted(){
        List<String> list = Arrays.asList("India","US","UK", "Germany", "Netherlands", "Norway", "Poland", "UAE")
                .stream()
                .collect(Collectors.toList());
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
