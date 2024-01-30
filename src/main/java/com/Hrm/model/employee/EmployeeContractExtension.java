package com.Hrm.model.employee;

import java.util.Date;

import com.Hrm.model.employee.EmployeeDependent.RelationshipType;

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
@Table(name = "hs_hr_emp_contract_extend")
public class EmployeeContractExtension {
	
	 // Primary key for the table
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    // Employee number
    
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Contract extension ID
    
    @Column(name = "econ_extend_id", nullable = false)
    private long econExtendId;

    // Start date of contract extension
    
    @Column(name = "econ_extend_start_date", nullable = true)
    private Date econExtendStartDate;

    // End date of contract extension
    
    @Column(name = "econ_extend_end_date", nullable = true)
    private Date econExtendEndDate;

}
