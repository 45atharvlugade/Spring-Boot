package com.stars.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@ConfigurationProperties("per.info")
@Data
public class Person {

	private String name;
	
	private String address;
	
	private Long mobileNo;
	
	private Integer age;
	
	private Double salary;
}
