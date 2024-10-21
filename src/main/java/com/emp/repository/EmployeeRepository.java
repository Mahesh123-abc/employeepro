package com.emp.repository;

import com.emp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByName(String name);
    Employee  findByEmail(String email);
    Employee findByAge(Long age);
}
