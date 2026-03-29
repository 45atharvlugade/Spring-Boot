package com.stars.sbeans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("patientInfo")
@ConfigurationProperties("patient.info")
@Data
public class Patient {

	private Integer patientId;
	
	private Long patientMobileNumber;
	
	private Double totalBillAmount;
	
	private String patientName;
	
	private List<Integer> list;
	
	private Map<String,Integer> mapus;
}
