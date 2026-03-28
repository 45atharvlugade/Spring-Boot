package com.stars.sbeans;

import org.springframework.stereotype.Component;

@Component("DEngine")
public class DieselEngine implements IEngine {

	
	public DieselEngine() {
	System.out.println("DieselEngine.DieselEngine()");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine.stopEngine()");

	}

}
