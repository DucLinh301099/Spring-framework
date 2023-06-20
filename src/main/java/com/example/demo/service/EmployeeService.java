package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee CreateEmp(Employee employee);

    List<Employee> findAllEmp();
}
