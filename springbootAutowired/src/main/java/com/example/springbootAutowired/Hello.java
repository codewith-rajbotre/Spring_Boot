package com.example.springbootAutowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello{
    @RequestMapping("/")
    public String greetings(){
        return "Hello world";
    }
}