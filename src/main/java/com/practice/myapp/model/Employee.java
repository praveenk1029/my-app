package com.practice.myapp.model;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

    private long empId;
    private String empName;
    private int age;
    private String city;

    public Employee(long empId, String empName, int age, String city) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.city = city;
    }
}
