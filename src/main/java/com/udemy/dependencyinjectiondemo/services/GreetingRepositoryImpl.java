package com.udemy.dependencyinjectiondemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Primary greeting!";
    }

    @Override
    public String getLatvianGreeting() {
        return "Sveiks!";
    }

    @Override
    public String getItalianGreeting() {
        return "Ciao!";
    }
}
