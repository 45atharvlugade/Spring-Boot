package com.stars.sbeans;

import org.springframework.stereotype.Component;

@Component("PEngine")
public class PetrolEngine implements IEngine {

  public PetrolEngine() {
	// TODO Auto-generated constructor stub
	  System.out.println("PetrolEngine.PetrolEngine()");
  }
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub		
	   System.out.println("PetrolEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
        System.out.println("PetrolEngine.stopEngine()");
	}

}
