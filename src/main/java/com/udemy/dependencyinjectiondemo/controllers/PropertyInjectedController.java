package com.udemy.dependencyinjectiondemo.controllers;

import com.udemy.dependencyinjectiondemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
