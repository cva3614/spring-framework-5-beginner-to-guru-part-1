package com.udemy.dependencyinjectiondemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {

    public String hello(){
        System.out.println("Hello, world!");
        return "hello";
    }
}
