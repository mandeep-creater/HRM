package com.Hrm.model.employee;

import java.sql.Timestamp;
import java.time.LocalDate;

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
@Table(name = "hs_hr_employee")
public class Employee {

	 // Primary key for the employee
    @Id
    @GeneratedValue(strategy = GenerationType .IDENTITY)
    @Column (name = "emp_number", nullable = false, columnDefinition = "int")
    private int empNumber;

    // Employee ID (can be null)
    
    @Column(name = "employee_id", length = 50)
    private String employeeId;

    // Last name of the employee
    
    @Column(name = "emp_lastname", nullable = false, length = 100)
    private String empLastName;

    // First name of the employee
    
    @Column(name = "emp_firstname", nullable = false, length = 100)
    private String empFirstName;

    // Middle name of the employee
    
    @Column(name = "emp_middle_name", nullable = false, length = 100)
    private String empMiddleName;

    // Nickname of the employee (can be null)
    
    @Column(name = "emp_nick_name", length = 100)
    private String empNickName;

    // Smoker status of the employee
    
    @Column(name = "emp_smoker", nullable = false, columnDefinition = "smallint")
    private short empSmoker;

    // Ethnic race code of the employee (can be null)
    
    @Column(name = "ethnic_race_code", length = 13)
    private String ethnicRaceCode;

    // Birthday of the employee (can be null)
    
    @Column(name = "emp_birthday", columnDefinition = "date")
    private LocalDate empBirthday;

    // Nation code of the employee (can be null)
    @Column(name = "nation_code")
    private Integer nationCode;

    // Gender of the employee (can be null)
    
    @Column(name = "emp_gender")
    private Short empGender;

    // Marital status of the employee (can be null)
    
    @Column(name = "emp_marital_status", length = 20)
    private String empMaritalStatus;

    // Social Security Number of the employee (can be null)
    
    @Column(name = "emp_ssn_num", length = 100)
    private String empSsnNum;

    // Social Insurance Number of the employee (can be null)
    
    @Column(name = "emp_sin_num", length = 100)
    private String empSinNum;

    // Other ID of the employee (can be null)
    
    @Column(name = "emp_other_id", length = 100)
    private String empOtherId;

    // Driver's license number of the employee (can be null)
    
    @Column(name = "emp_dri_lice_num", length = 100)
    private String empDriLiceNum;

    // Driver's license expiration date of the employee (can be null)
    
    @Column(name = "emp_dri_lice_exp_date", columnDefinition = "date")
    private LocalDate empDriLiceExpDate;

    // Military service information of the employee (can be null)
    
    @Column(name = "emp_military_service", length = 100)
    private String empMilitaryService;

    // Employment status of the employee (can be null)
    
    @Column(name = "emp_status")
    private Integer empStatus;

    // Job title code of the employee (can be null)
    
    @Column(name = "job_title_code")
    private Integer jobTitleCode;

    // EEO category code of the employee (can be null)
    
    @Column(name = "eeo_cat_code")
    private Integer eeoCatCode;

    // Work station code of the employee (can be null)
    
    @Column(name = "work_station")
    private Integer workStation;

    // Street address line 1 of the employee (can be null)
    
    @Column(name = "emp_street1", length = 100)
    private String empStreet1;

    // Street address line 2 of the employee (can be null)
    
    @Column(name = "emp_street2", length = 100)
    private String empStreet2;

    // City code of the employee (can be null)
    
    @Column(name = "city_code", length = 100)
    private String cityCode;

    // Country code of the employee (can be null)
    
    @Column(name = "coun_code", length = 100)
    private String counCode;

    // Province code of the employee (can be null)
    
    @Column(name = "provin_code", length = 100)
    private String provinCode;

    // ZIP code of the employee (can be null)
    
    @Column(name = "emp_zipcode", length = 20)
    private String empZipcode;

    // Home telephone number of the employee (can be null)
    
    @Column(name = "emp_hm_telephone", length = 50)
    private String empHmTelephone;

    // Mobile number of the employee (can be null)
    
    @Column(name = "emp_mobile", length = 50)
    private String empMobile;

    // Work telephone number of the employee (can be null)
    
    @Column(name = "emp_work_telephone", length = 50)
    private String empWorkTelephone;

    // Work email address of the employee (can be null)
    
    @Column(name = "emp_work_email", length = 50)
    private String empWorkEmail;

    // Salary grade code of the employee (can be null)
    
    @Column(name = "sal_grd_code", length = 13)
    private String salGrdCode;

    // Date when the employee joined (can be null)
    
    @Column(name = "joined_date", columnDefinition = "date")
    private LocalDate joinedDate;

    // Other email address of the employee (can be null)
    
    @Column(name = "emp_oth_email", length = 50)
    private String empOthEmail;

    // Termination ID of the employee (can be null)
    
    @Column(name = "termination_id")
    private Integer terminationId;

    // Custom fields 1 to 10 of the employee (can be null)
    
    @Column(name = "custom1", length = 250)
    private String custom1;

    @Column(name = "custom2", length = 250)
    private String custom2;

    @Column(name = "custom3", length = 250)
    private String custom3;

    @Column(name = "custom4", length = 250)
    private String custom4;

    @Column(name = "custom5", length = 250)
    private String custom5;

    @Column(name = "custom6", length = 250)
    private String custom6;

    @Column(name = "custom7", length = 250)
    private String custom7;

    @Column(name = "custom8", length = 250)
    private String custom8;

    @Column(name = "custom9", length = 250)
    private String custom9;

    @Column(name = "custom10", length = 250)
    private String custom10;

    // Timestamp indicating when the record was purged (can be null)
    
    @Column(name = "purged_at", columnDefinition = "timestamp")
    private Timestamp purgedAt;
}
