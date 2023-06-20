package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/create")
    public Employee CreateEmp(@RequestBody Employee employee) {
        return service.CreateEmp(employee);
    }

    @GetMapping("/findAll")
    public List<Employee> findAllEmp() {
        return service.findAllEmp();
    }
}
