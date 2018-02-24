package com.udemy.dependencyinjectiondemo.controllers;

import com.udemy.dependencyinjectiondemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
