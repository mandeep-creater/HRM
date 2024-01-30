package com.Hrm.model.employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "hs_hr_emp_member_detail")
public class EmployeeMembers {
	

    // Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    // Employee number
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Membership code
    @Column(name = "membship_code", nullable = false)
    private int membshipCode;

    // Subscription ownership
    @Column(name = "ememb_subscript_ownership", length = 20)
    private String emembSubscriptOwnership;

    // Subscription amount
    @Column(name = "ememb_subscript_amount", precision = 15, scale = 2)
    private BigDecimal emembSubscriptAmount;

    // Subscription currency
    @Column(name = "ememb_subs_currency", length = 20)
    private String emembSubsCurrency;

    // Commencement date of the membership
    @Column(name = "ememb_commence_date")
    private LocalDate emembCommenceDate;

    // Renewal date of the membership
    @Column(name = "ememb_renewal_date")
    private LocalDate emembRenewalDate;


}
