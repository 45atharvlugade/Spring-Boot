package com.stars.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@Component("person")
@ConfigurationProperties("person.info")
public class Person {

	
	private String personId;
	
	private String personName;
	
	
	private String personAddress;
	
	private Double personSalary;
	
	private Long mobileNumber;
	
	
}
