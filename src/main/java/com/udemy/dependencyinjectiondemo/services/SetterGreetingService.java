package com.udemy.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting! I was injected by the setter.";
    }
}
