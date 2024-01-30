package com.Hrm.model.user;

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

@Table(name="ohrm_user_role_data_group")

public class UserRolePermission {     // data group table class
	
	
		 
	    @Id
	    @NotNull
	    private int id;
	
	    // Foreign key referencing the user role
	    @Column(name = "user_role_id")
	    private int userRoleId;
	
	    // Foreign key referencing the data group
	    @Column(name = "data_group_id")
	    private int dataGroupId;
	
	    // Permission flags
	    @Column(name = "can_read")
	    private boolean canRead;
	
	    @Column(name = "can_create")
	    private boolean canCreate;
	
	    @Column(name = "can_update")
	    private boolean canUpdate;
	
	    @Column(name = "can_delete")
	    private boolean canDelete;
	
	    // Flag indicating self-permission
	    @Column(name = "self")
	    private boolean self;

}
