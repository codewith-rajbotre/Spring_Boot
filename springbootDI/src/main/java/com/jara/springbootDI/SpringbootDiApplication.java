package com.jara.springbootDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDiApplication.class, args);

		Dev obj = context.getBean(Dev.class) ;
		obj.printText();
	}

}
