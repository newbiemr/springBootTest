package com.emre.deneme.demoApplise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAppliseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoAppliseApplication.class, args);
		
		System.out.print("dsa");
		
		SikkoClass c1 = context.getBean(SikkoClass.class);
		SikkoClass c2 = context.getBean(SikkoClass.class);
		
	}

}
