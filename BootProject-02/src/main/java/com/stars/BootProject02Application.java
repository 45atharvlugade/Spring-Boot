package com.stars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.stars.config.AdharCard;
import com.stars.config.IPerson;

@SpringBootApplication
@ImportResource("applicationContext.xml")
public class BootProject02Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProject02Application.class, args);
				
		AdharCard ac=ctx.getBean("adharcard",AdharCard.class);
		
		ac.printAdharCard();
				
	
	
	}

}
