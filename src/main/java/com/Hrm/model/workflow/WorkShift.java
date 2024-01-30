package com.Hrm.model.workflow;

import java.math.BigDecimal;
import java.sql.Time;

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
@Table(name = "ohrm_work_shift")
public class WorkShift {

	 // Primary key for the work schedule
    @Id
    private int id;

    // Name of the work schedule (not nullable)
    @Column(name = "name", nullable = false, length = 250)
    private String name;

    // Hours per day for the work schedule (not nullable)
    @Column(name = "hours_per_day", nullable = false, precision = 4, scale = 2)
    private BigDecimal hoursPerDay;

    // Start time of the work schedule (not nullable)
    @Column(name = "start_time", nullable = false)
    private Time startTime;

    // End time of the work schedule (not nullable)
    @Column(name = "end_time", nullable = false)
    private Time endTime;
}
