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
@Table(name = "ohrm_timesheet")
public class TimeSheet {

	 // Primary key for the timesheet
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timesheet_id", nullable = false, columnDefinition = "bigint")
    private Long timesheetId;

    // State of the timesheet
    @Column(name = "state", nullable = false, length = 255)
    private String state;

    // Start date of the timesheet
    @Column(name = "start_date", nullable = false, columnDefinition = "date")
    private LocalDate startDate;

    // End date of the timesheet
    @Column(name = "end_date", nullable = false, columnDefinition = "date")
    private LocalDate endDate;

    // Employee ID associated with the timesheet
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

}
