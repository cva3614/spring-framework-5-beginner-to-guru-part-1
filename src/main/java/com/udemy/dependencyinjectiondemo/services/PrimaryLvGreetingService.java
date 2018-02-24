package com.udemy.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("lv")
public class PrimaryLvGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Sveiks!";
    }
}
