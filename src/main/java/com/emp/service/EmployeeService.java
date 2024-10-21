package com.emp.service;

import com.emp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Optional<Employee> saveAllEmployess(Employee employee) throws Exception;

}
