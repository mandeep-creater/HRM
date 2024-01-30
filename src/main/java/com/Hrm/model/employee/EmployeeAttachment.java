package com.Hrm.model.employee;

import java.sql.Timestamp;

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
@Table(name = "hs_hr_emp_attachment")
public class EmployeeAttachment {
	
	
	@Id
    @Column(name = "emp_number", nullable = false)
    private int empNumber;

    // Unique identifier for the attachment
	
    @Id
    @Column(name = "eattach_id", nullable = false)
    private int eattachId;

    // Description of the attachment
    
    @Column(name = "eattach_desc")
    private String eattachDesc;

    // Filename of the attachment
    
    @Column(name = "eattach_filename")
    private String eattachFilename;

    // Size of the attachment in bytes
    
    @Column(name = "eattach_size")
    private int eattachSize;

    // Actual content of the attachment (binary data)
    
    @Lob
    @Column(name = "eattach_attachment")
    private byte[] eattachAttachment;

    // Type of the attachment
    
    @Column(name = "eattach_type")
    private String eattachType;

    // Screen associated with the attachment
    
    @Column(name = "screen")
    private String screen;

    // User who attached the file
    
    @Column(name = "attached_by")
    private int attachedBy;

    // Name of the user who attached the file
    
    @Column(name = "attached_by_name")
    private String attachedByName;

    // Time when the file was attached, using the current timestamp as default
    
    @Column(name = "attached_time", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp attachedTime;

}
