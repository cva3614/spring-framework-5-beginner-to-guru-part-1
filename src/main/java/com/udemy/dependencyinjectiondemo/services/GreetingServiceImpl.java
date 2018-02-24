package com.udemy.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Greeting!";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
