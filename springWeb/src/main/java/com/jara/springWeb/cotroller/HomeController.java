package com.jara.springWeb.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController{

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Home Page!";
    }

    @GetMapping("/about")
    public String getInfo(){
        return "Hello from get mapping";
    }
}