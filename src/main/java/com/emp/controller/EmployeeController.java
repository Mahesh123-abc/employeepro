package com.emp.controller;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
      return employeeService.getAllEmployees();
    }
    @PostMapping("/saveEmployees")
    public Optional<Employee> saveEmployees(@RequestBody Employee employee) throws Exception {
        Optional<Employee> employee1 = employeeService.saveAllEmployess(employee);
        return employee1;
    }
}
