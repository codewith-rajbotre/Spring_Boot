package com.example.springbootAutowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootAutowiredApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootAutowiredApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
		
	}

}
