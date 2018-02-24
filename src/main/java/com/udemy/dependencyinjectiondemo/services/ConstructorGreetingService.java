package com.udemy.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting! I was injected via the constructor.";
    }
}
