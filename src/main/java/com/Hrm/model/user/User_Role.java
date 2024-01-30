package com.Hrm.model.user;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
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
@Table(name="ohrm_user_role")
public class User_Role {

		@Id
		@Column(name = "id")
		@NotNull
	   private int id;
	   
		
		 // Column mapping for "name" with a maximum length of 10000 characters
		
	   @Column(name = "name", length = 10000)
	   @NotNull
	   private String name;
	  
	   // Column mapping for "display_name" with a maximum length of 10000 characters
	   
	   @Column(name = "display_name ", length = 10000)
	   @NotNull
	   private String displayName;
	   
	   // Column mapping for "is_assignable"
	   
	   @Column(name = "is_assignable ")
	   private boolean isAssignable;
	   
	
	   // Column mapping for "is_predefined"
	   
	   @Column(name = "is_predefined ")
	   private boolean isPredefined;
}
