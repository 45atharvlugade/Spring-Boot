package com.stars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.stars.sbeans.Hospital;
import com.stars.sbeans.Patient;

@SpringBootApplication
public class SpringBootYmlProj01Application {

	public static void main(String[] args) {
		try(
	    ConfigurableApplicationContext ctx=
	    SpringApplication.run(SpringBootYmlProj01Application.class, args);
		        ){
		    
		    Patient p=ctx.getBean("patientInfo",Patient.class);
		    System.out.println(p);
		    
		    Hospital hs=ctx.getBean("hospital",Hospital.class);
		    System.out.println(hs);
		    
		}catch(Exception e) {
		    e.printStackTrace();
		}
	}

}
