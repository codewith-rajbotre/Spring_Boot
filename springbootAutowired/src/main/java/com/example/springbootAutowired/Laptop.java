package com.example.springbootAutowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    public void printString(){
        System.out.println("Print a value from laptop");
    }
}