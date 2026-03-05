package com.example.springbootAutowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAutowiredApplication.class, args);
		System.out.println("Autowired Keyword Example");
	}

}
