package com.udemy.dependencyinjectiondemo.controllers;

import com.udemy.dependencyinjectiondemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
