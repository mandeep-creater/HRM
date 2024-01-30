package com.Hrm.model.employee;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "hs_hr_emp_dependents")
public class EmployeeDependent {
	
	
	// Primary key for the table
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    // Employee number
    
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Dependent sequence number
    
    @Column(name = "ed_seqno", nullable = false)
    private int edSeqno;

    // Dependent name
    
    @Column(name = "ed_name", nullable = true)
    private String edName;

    // Relationship type (child or other)
    
    @Enumerated(EnumType.STRING)
    @Column(name = "ed_relationship_type", nullable = true)
    private RelationshipType edRelationshipType;

    // Relationship description
    
    @Column(name = "ed_relationship", nullable = true)
    private String edRelationship;

    // Date of birth of the dependent
    
    @Column(name = "ed_date_of_birth", nullable = true)
    private Date edDateOfBirth;

    public enum RelationshipType {
        CHILD, OTHER
    }


}
