package com.Hrm.model.workflow;

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
@Table(name = "ohrm_workflow_state_machine")
public class WorkFlow {
	
	 // Primary key for the workflow item
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "bigint")
    private Long id;

    // Name of the workflow
    @Column(name = "workflow", nullable = false, length = 255)
    private String workflow;

    // Current state of the workflow item
    @Column(name = "state", nullable = false, length = 255)
    private String state;

    // Role associated with the workflow item
    @Column(name = "role", nullable = false, length = 255)
    private String role;

    // Action performed on the workflow item
    @Column(name = "action", nullable = false, length = 255)
    private String action;

    // Resulting state after the action is performed
    @Column(name = "resulting_state", nullable = false, length = 255)
    private String resultingState;

    // Roles to notify about the workflow item (can be null)
    @Column(name = "roles_to_notify", columnDefinition = "text")
    private String rolesToNotify;

    // Priority of the workflow item (default is 0)
    @Column(name = "priority", nullable = false, columnDefinition = "int default 0")
    private int priority;

}
