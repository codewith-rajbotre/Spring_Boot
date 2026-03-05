package com.jara.springbootDI;

import org.springframework.stereotype.Component;

@Component
public class Dev{
    public void printText(){
        System.out.println("Inside the print text");
    }
}