package com.Hrm.model.employee;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "hs_hr_emp_us_tax")
public class EmployeeTax {
	
	
	 // Employee number, primary key
	
    @Id
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Federal tax status (can be null)
    
    @Column(name = "tax_federal_status", length = 13)
    private String taxFederalStatus;

    // Federal tax exceptions (can be null, default is 0)
    
    @Column(name = "tax_federal_exceptions")
    private Integer taxFederalExceptions;

    // State tax code (can be null)
    
    @Column(name = "tax_state", length = 13)
    private String taxState;

    // State tax status (can be null)
    
    @Column(name = "tax_state_status", length = 13)
    private String taxStateStatus;

    // State tax exceptions (can be null, default is 0)
    
    @Column(name = "tax_state_exceptions")
    private Integer taxStateExceptions;

    // Unemployment state tax code (can be null)
    
    @Column(name = "tax_unemp_state", length = 13)
    private String taxUnempState;

    // Work state tax code (can be null)
    
    @Column(name = "tax_work_state", length = 13)
    private String taxWorkState;

    

    /**
     * Parameterized constructor for creating instances with initial values.
     *
     * @param empNumber            Employee number.
     * @param taxFederalStatus     Federal tax status.
     * @param taxFederalExceptions Federal tax exceptions.
     * @param taxState             State tax code.
     * @param taxStateStatus       State tax status.
     * @param taxStateExceptions   State tax exceptions.
     * @param taxUnempState        Unemployment state tax code.
     * @param taxWorkState         Work state tax code.
     */

}
