package com.stars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.stars.sbeans.Person;

@SpringBootApplication
@PropertySource("")
public class ConfigurationPropertiesBulkInjection1Application {

	public static void main(String[] args) {
		
	try(	
		ConfigurableApplicationContext ctx =SpringApplication.run(ConfigurationPropertiesBulkInjection1Application.class, args);
			
			){
		
		Person details=ctx.getBean("pInfo",Person.class);
		System.out.println(details);
		
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
