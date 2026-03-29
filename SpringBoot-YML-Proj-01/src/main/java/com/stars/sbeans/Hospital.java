package com.stars.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hospital")
@ConfigurationProperties("hospital.info")
@Data
public class Hospital {

	private String name;
	
	private String address;
	
	private Long pincode;
	
}
