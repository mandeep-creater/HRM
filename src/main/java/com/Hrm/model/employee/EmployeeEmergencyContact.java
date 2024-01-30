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
@Table(name = "hs_hr_emp_emergency_contacts")
public class EmployeeEmergencyContact {
	
		@Id 
	    @Column(name = "emp_number", nullable = false)
	    private int empNumber;

	    // Sequence number for the emergency contact
		
	    @Column(name = "eec_seqno", nullable = false)
	    private int eecSeqno;

	    // Name of the emergency contact
	    
	    @Column(name = "eec_name")
	    private String eecName;

	    // Relationship of the employee with the emergency contact
	    
	    @Column(name = "eec_relationship")
	    private String eecRelationship;

	    // Home number of the emergency contact
	    
	    @Column(name = "eec_home_no")
	    private String eecHomeNo;

	    // Mobile number of the emergency contact
	    
	    @Column(name = "eec_mobile_no")
	    private String eecMobileNo;

	    // Office number of the emergency contact
	    
	    @Column(name = "eec_office_no")
	    private String eecOfficeNo;

}
