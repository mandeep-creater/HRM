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
@Table(name = "ohrm_work_week")
public class WorkWeek {

	 
	   @Id
	    @Column(name = "id", nullable = false, columnDefinition = "int unsigned")
	    private Long id; // Use Long for unsigned int

	    @Column(name = "operational_country_id", columnDefinition = "int unsigned")
	    private Long operationalCountryId; // Use Long for unsigned int, nullable is true

	    @Column(name = "mon", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int mon;

	    @Column(name = "tue", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int tue;

	    @Column(name = "wed", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int wed;

	    @Column(name = "thu", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int thu;

	    @Column(name = "fri", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int fri;

	    @Column(name = "sat", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int sat;

	    @Column(name = "sun", nullable = false, columnDefinition = "tinyint unsigned default 0")
	    private int sun;
}
