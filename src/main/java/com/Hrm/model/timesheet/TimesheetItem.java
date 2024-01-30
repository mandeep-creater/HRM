package com.Hrm.model.timesheet;

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
@Table(name = "ohrm_timesheet_item;")
public class TimesheetItem {
	
	// Primary key for the timesheet item
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timesheet_item_id", nullable = false, columnDefinition = "bigint")
    private Long timesheetItemId;

    // Foreign key referencing the associated timesheet
    @Column(name = "timesheet_id", nullable = false)
    private Long timesheetId;

    // Date of the timesheet item
    @Column(name = "date", nullable = false, columnDefinition = "date")
    private LocalDate date;

    // Duration of the timesheet item (can be null)
    @Column(name = "duration", columnDefinition = "bigint")
    private Long duration;

    // Comment associated with the timesheet item (can be null)
    @Column(name = "comment", columnDefinition = "text")
    private String comment;

    // Foreign key referencing the associated project
    @Column(name = "project_id", nullable = false)
    private Long projectId;

    // Foreign key referencing the associated employee
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    // Foreign key referencing the associated activity
    @Column(name = "activity_id", nullable = false)
    private Long activityId;


}
