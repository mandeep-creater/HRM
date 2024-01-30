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
@Table(name="ohrm_user_role_screen")
public class UserRoleScreenPermission {
	

	             // Primary key for the user role screen permissions
	    @Id
	    private int id;
	
	    		// Foreign key referencing the user role
	    @Column(name = "user_role_id")
	    @NotNull
	    private int userRoleId;
	
	    		// Foreign key referencing the screen
	    @Column(name = "screen_id")
	    @NotNull
	    private int screenId;
	
	    		// Permission flags
	   
	    @Column(name = "can_read")
	    @NotNull
	    private boolean canRead;
	
	    @Column(name = "can_create")
	    @NotNull
	    private boolean canCreate;
	
	    @Column(name = "can_update")
	    @NotNull
	    private boolean canUpdate;
	
	    @Column(name = "can_delete")
	    @NotNull
	    private boolean canDelete;

	

}
