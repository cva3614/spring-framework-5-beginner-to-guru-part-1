package com.udemy.dependencyinjectiondemo.services;

public class PrimaryLvGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryLvGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getLatvianGreeting();
    }
}
