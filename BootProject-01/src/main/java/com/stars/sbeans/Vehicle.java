package com.stars.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	
	@Autowired
    @Qualifier("motor")
	private IEngine engine;
	
	public void journeyStarted(String startPlace,String endPlace) {
		System.out.println("journey Started From :"+startPlace);
		engine.startEngine();
		System.out.println("Journey Ended At :"+endPlace);
		engine.stopEngine();
	}
}
