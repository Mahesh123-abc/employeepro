package com.emp.service;

import com.emp.entity.Employee;
import com.emp.handler.GeneralException;
import com.emp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> saveAllEmployess(Employee employee) throws Exception {
        Employee existingName = employeeRepository.findByName(employee.getName());
        if (existingName != null) {
            throw new GeneralException("already employee exist " + " " + employee.getName());
        }
        Employee existingEmail = employeeRepository.findByEmail(employee.getEmail());
        if (existingEmail != null) {
            throw new GeneralException("already email existed  " + " " + employee.getEmail());
        }
        Optional<Employee> existingAge = Optional.ofNullable(employeeRepository.findByAge(Long.valueOf(employee.getAge())));
        if (existingAge.get() != null) {
            throw new GeneralException("already age is   " + " " + employee.getAge());
        }
        return existingAge;
    }
    }

