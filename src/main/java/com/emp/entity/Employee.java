package com.emp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;


@Getter
@Setter
@Entity
//@Validated
@Table(name = "employeedb")
public class Employee {
   @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name="emp_code")
    private Long empCode;
    private String name;
    private Integer age;
//    @Email(message = "Email should be valid")
    private String email;




}
