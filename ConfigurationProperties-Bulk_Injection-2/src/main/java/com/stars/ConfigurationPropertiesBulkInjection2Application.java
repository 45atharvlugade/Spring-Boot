package com.stars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.stars.sbeans.Person;

@SpringBootApplication
@PropertySource("com/nt/config/Info.properties")
public class ConfigurationPropertiesBulkInjection2Application {

	public static void main(String[] args) {
		
		try(
				ConfigurableApplicationContext ctx=SpringApplication.run(ConfigurationPropertiesBulkInjection2Application.class, args);
				){
			
			Person person=ctx.getBean("person",Person.class);
			System.out.println(person);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
