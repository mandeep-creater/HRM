package com.Hrm.model.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
@Table(name = "hs_hr_emp_picture")
public class EmployeePicture {
	
	 // Employee number, primary key
    @Id
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Employee picture data (binary large object)
    @Lob
    @Column(name = "epic_picture")
    private byte[] epicPicture;

    // Filename of the employee picture
    @Column(name = "epic_filename", length = 100)
    private String epicFilename;

    // Type of the employee picture (e.g., JPEG, PNG)
    @Column(name = "epic_type", length = 50)
    private String epicType;

    // Size of the employee picture file
    @Column(name = "epic_file_size", length = 20)
    private String epicFileSize;

    // Width of the employee picture in pixels
    @Column(name = "epic_file_width", length = 20)
    private String epicFileWidth;

    // Height of the employee picture in pixels
    @Column(name = "epic_file_height", length = 20)
    private String epicFileHeight;


}
