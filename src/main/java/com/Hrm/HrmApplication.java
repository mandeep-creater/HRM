package com.Hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Leads Dial App REST API Documentation",
				description = "Leads Dial REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "New xtended technology Software Private Limited",
						email = "info@newxtendedtechnology.com",
						url = "https://newxtendedtechnology.in"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://newxtendedtechnology.in"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "New xtended technology Software Private Limited",
				url = "https://www.carrierCounselling.com/swagger-ui.html"
		)
)
public class HrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmApplication.class, args);
	}

}
