package com.stars.models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component("employee")
@RequiredArgsConstructor
public class Employee {

	@NonNull
	private Integer empid;
	@NonNull
	private Long phoneNumber;
	@NonNull
	private String empName;
	@NonNull
	private String Address;
	@NonNull
	private Double salary;
	@NonNull
	private String role;
	@NonNull
	private String emial;
		
}
