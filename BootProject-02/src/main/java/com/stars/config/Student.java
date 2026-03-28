package com.stars.config;

import org.springframework.stereotype.Component;

import com.al.raisedexceptions.PhoneAssignError;

import jakarta.annotation.PostConstruct;

@Component("student")
public class Student extends APerson {
	


	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Student.Student()");
	}
	
	@PostConstruct
	public void myInit() throws PhoneAssignError {
		if(this!=null) {
		    if(age<18) {
		    	throw new PhoneAssignError();
		    }
		}else {
			throw new NullPointerException("Person Object is Null");
		}
	}
	
	public String toString() {
		return "Name     : "+firstName+" "+middleName+" "+lastName+"\n"+
				"Address :"+pAddress+"\n"+
				"Age     :"+age+"\n"+
				"Phone   :"+phone;
				
	}
}
