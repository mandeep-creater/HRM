package com.Hrm.model.salary;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//Lombok annotations for automatic generation of getters, setters, constructors, and toString

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//JPA annotations for entity mapping

@Entity
@Table(name = "hs_hr_emp_basicsalary")
public class EmployeeSalary {

	
	 // Primary key for the table
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    // Employee number, a unique identifier
    
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Salary grade code, if applicable
    
    @Column(name = "sal_grd_code")
    private Integer salGrdCode;

    // Currency ID for the salary
    
    @Column(name = "currency_id", nullable = false)
    private String currencyId;

    // Basic salary amount
    
    @Column(name = "ebsal_basic_salary")
    private String ebsalBasicSalary;

    // Pay period code, if applicable
    
    @Column(name = "payperiod_code")
    private String payperiodCode;

    // Salary component description
    
    @Column(name = "salary_component")
    private String salaryComponent;

    // Additional comments related to the salary
    
    @Column(name = "comments")
    private String comments;
}
