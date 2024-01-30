package com.Hrm.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "ohrm_user_selection_rule")
public class UserSelectionRule {
	
		@Id
		private int id;

		// Name of the user selection rule (not nullable)
		@NotNull
	    @Column(name = "name")
	    private String name;

		// Description of the user selection rule
	    @Column(name = "description")
	    private String description;

	 // Implementation class for the user selection rule (not nullable)
	    @NotNull
	    @Column(name = "implementation_class")
	    private String implementationClass;

	 // XML data associated with the user selection rule (supports text data type)
	    @Column(name = "rule_xml_data", columnDefinition = "text")
	    private String ruleXmlData;

}
