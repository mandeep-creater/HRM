package com.Hrm.model.employee;

import java.sql.Timestamp;
import java.time.LocalDate;
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
@Table(name = "hs_hr_emp_work_experience")
public class EmployeeExperience {
	
	 // Primary key for employee experience
    @Id
    @Column (name = "emp_number", nullable = false)
    private int empNumber;

    @Id
    @Column(name = "eexp_seqno", nullable = false, precision = 10, scale = 0)
    private Long eexpSeqno;

    // Employer name (can be null)
    
    @Column(name = "eexp_employer", length = 100)
    private String eexpEmployer;

    // Job title (can be null)
    
    @Column(name = "eexp_jobtit", length = 120)
    private String eexpJobtit;

    // Start date of experience (can be null)
    
    @Column(name = "eexp_from_date")
    private LocalDateTime eexpFromDate;

    // End date of experience (can be null)
    
    @Column(name = "eexp_to_date")
    private LocalDateTime eexpToDate;

    // Comments about the experience (can be null)
    
    @Column(name = "eexp_comments", length = 200)
    private String eexpComments;

    // Internal flag (can be null)
    
    @Column(name = "eexp_internal")
    private Integer eexpInternal;

}
