package com.al.raisedexceptions;

public class PhoneAssignError extends Exception {
	
	public PhoneAssignError() {
		// TODO Auto-generated constructor stub
		super("cannot assign the Phone this Type");
	}

	public PhoneAssignError(String personType) {
		// TODO Auto-generated constructor stub
		super("cannot assign the Phone for "+personType);
	}
}
