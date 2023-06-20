package com.example.demo.service.impl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo repo;

    @Override
    public Employee CreateEmp(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> findAllEmp() {
        return repo.findAll();
    }
}
