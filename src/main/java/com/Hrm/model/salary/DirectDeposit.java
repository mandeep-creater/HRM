package com.Hrm.model.salary;

import java.math.BigDecimal;

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
@Table(name = "hs_hr_emp_directdebit")
public class DirectDeposit {
	
	
	// Primary key for the table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    // Associated salary ID
    
    @Column(name = "salary_id", nullable = false)
    private int salaryId;

    // Direct deposit routing number
    
    @Column(name = "dd_routing_num", nullable = false)
    private int ddRoutingNum;

    // Direct deposit account
    
    @Column(name = "dd_account", nullable = false)
    private String ddAccount;

    // Direct deposit amount
    
    @Column(name = "dd_amount", nullable = false)
    private BigDecimal ddAmount;

    // Direct deposit account type
    
    @Column(name = "dd_account_type", nullable = false)
    private String ddAccountType;

    // Direct deposit transaction type
    
    @Column(name = "dd_transaction_type", nullable = false)
    private String ddTransactionType;

}
