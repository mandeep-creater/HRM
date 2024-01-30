package com.Hrm.model.employee;

import java.time.LocalDate;

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
@Table(name = "hs_hr_emp_children")
public class EmployeeChild {
	
	  // Primary key for the table
    @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private int id;

    // Employee number, a unique identifier
    
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Sequence number for employee's children
    
    @Column(name = "ec_seqno", nullable = false)
    private int ecSeqno;

    // Name of the child
    
    @Column(name = "ec_name")
    private String ecName;

    // Date of birth of the child
    
    @Column(name = "ec_date_of_birth")
    private LocalDate ecDateOfBirth;

}
