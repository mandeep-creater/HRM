package com.Hrm.model;

import java.time.LocalDateTime;

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
@Table(name = "ohrm_upgrade_history")
public class UpgradeRecord {
	
	// Primary key for the upgrade record
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "int")
    private Long id;

    // Version at the start of the upgrade
    @Column(name = "start_version", length = 30)
    private String startVersion;

    // Version at the end of the upgrade
    @Column(name = "end_version", length = 30)
    private String endVersion;

    // Incremental value at the start of the upgrade
    @Column(name = "start_increment", nullable = false)
    private int startIncrement;

    // Incremental value at the end of the upgrade
    @Column(name = "end_increment", nullable = false)
    private int endIncrement;

    // Date and time when the upgrade was performed
    @Column(name = "upgraded_date", columnDefinition = "datetime")
    private LocalDateTime upgradedDate;

}
