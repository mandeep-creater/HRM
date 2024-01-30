package com.Hrm.model.timesheet;

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
@Table(name = "ohrm_timesheet_action_log")

public class TimeSheetActionLog {
	
	// Primary key for the timesheet action log
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timesheet_action_log_id", nullable = false, columnDefinition = "bigint")
    
    private Long timesheetActionLogId;

    // Comment associated with the action log (can be null)
    
    @Column(name = "comment", length = 255)
    private String comment;

    // Action performed (can be null)
    
    @Column(name = "action", length = 255)
    private String action;

    // Date and time when the action was performed
    
    @Column(name = "date_time", nullable = false, columnDefinition = "date")
    private LocalDate dateTime;

    // ID of the user who performed the action
    @Column(name = "performed_by", nullable = false)
    private int performedBy;

    // Foreign key referencing the associated timesheet
    
    @Column(name = "timesheet_id", nullable = false)
    private Long timesheetId;

}
