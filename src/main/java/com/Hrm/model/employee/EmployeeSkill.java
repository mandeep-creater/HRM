package com.Hrm.model.employee;

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
@Table(name = "hs_hr_emp_skill")
public class EmployeeSkill {
	
	   // Employee number, primary key
	
    @Id
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Skill ID, foreign key referencing the skills table
    
    @Column(name = "skill_id", nullable = false)
    private int skillId;

    // Years of experience in the specific skill (can be null)
    
    @Column(name = "years_of_exp")
    private Integer yearsOfExp;

    // Comments related to the employee's skill experience
    
    @Column (name = "comments", length = 100, nullable = false)
    private String comments;

   

    /**
     * Parameterized constructor for creating instances with initial values.
     *
     * @param empNumber  Employee number.
     * @param skillId    Skill ID.
     * @param yearsOfExp Years of experience in the specific skill.
     * @param comments   Comments related to the skill experience.
     */

}
