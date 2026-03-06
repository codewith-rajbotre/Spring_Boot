package com.example.springbootAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev{
     
     @Autowired
     @Qualifier("desktop")
     Computer com ;
     public void build(){
        com.printString();
         System.out.println("Build for Dev class");
     } 
}