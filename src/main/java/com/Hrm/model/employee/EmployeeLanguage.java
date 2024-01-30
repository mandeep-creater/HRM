package com.Hrm.model.employee;

import java.math.BigDecimal;
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
@Table(name = "hs_hr_emp_language")
public class EmployeeLanguage {
	
	   @Id
	    @Column(name = "emp_number")
	    private int empNumber;

	    @Id
	    @Column(name = "lang_id")
	    private int langId;

	    @Id
	    @Column(name = "fluency")
	    private short fluency;

	    @Column(name = "competency")
	    private Short competency;

	    @Column(name = "comments", length = 100)
	    private String comments;


}
