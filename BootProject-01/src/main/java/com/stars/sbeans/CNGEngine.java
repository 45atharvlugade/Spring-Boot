package com.stars.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine {

	
	public CNGEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("CNGEngine.CNGEngine()");
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("CNGEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub

		System.out.println("CNGEngine.stopEngine()");
	}

}
