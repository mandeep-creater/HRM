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
@Table(name = "hs_hr_emp_passport")
public class EmployeePassport {
	
	// Employee number, primary key
	
    @Id
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Passport sequence number, primary key
    
    @Column(name = "ep_seqno", nullable = false)
    private int epSeqno;

    // Passport number of the employee
    
    @Column(name = "ep_passport_num", nullable = false, length = 100)
    private String epPassportNum;

    // Date when the passport was issued
    
    @Column(name = "ep_passportissueddate")
    private LocalDateTime epPassportIssuedDate;

    // Date when the passport will expire
    
    @Column(name = "ep_passportexpiredate")
    private LocalDateTime epPassportExpireDate;

    // Comments related to the passport
    
    @Column(name = "ep_comments", length = 255)
    private String epComments;

    // Passport type flag (smallint)
    
    @Column(name = "ep_passport_type_flg")
    private Short epPassportTypeFlag;

    // I-9 status of the employee
    @Column(name = "ep_i9_status", length = 100)
    private String epI9Status;

    // Date of I-9 review
    
    @Column(name = "ep_i9_review_date")
    private LocalDateTime epI9ReviewDate;

    // Country code
    
    @Column(name = "cou_code", length = 6)
    private String couCode;

}
