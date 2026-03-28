package com.stars.sbeans;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private String employeeId;
	
	private String employeeFirstName;
	
	private String employeeMiddleName;
	
	private String employeeLastName;
	
	private Double employeeSalary;
	
	private String employeeRole;
	
	private String employeeSpecialRole;
	
	private Date joinDate;
	
	
}
