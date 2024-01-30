package com.Hrm.model.user;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "ohrm_user")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 @NotNull
    private int id; 
	 
    @Column(name = "user_role_id")
    @NotNull
    private int userRoleId; 
   
    @Column(name = "emp_number")
	private Integer empNumber;     // Use Integer for nullable integers
	
    @Column(name = "user_name", length = 10000)
	private String userName; 
	
    @Column(name = "user_password", length = 10000)
	private String userPassword; 
	
    @Column(name = "deleted ")
    @NotNull
	private boolean deleted; 		// Assuming tinyint(1) is used for boolean values
	
    @Column(name = "status ")
    @NotNull
	private boolean status; 		// Assuming tinyint(1) is used for boolean values
	
    @Column(name = "date_entered ")
	private LocalDateTime dateEntered; 		// Assuming you have imported java.time.LocalDateTime
	
    @Column(name = "date_modified ")
	private LocalDateTime dateModified; 	// Assuming you have imported java.time.LocalDateTime
	
    @Column(name = "modified_user_id ")
	private Integer modifiedUserId; 	// Use Integer for nullable integers
	
    @Column(name = "created_by ")
	private Integer createdBy; 			// Use Integer for nullable integers

	

}
