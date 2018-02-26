package com.udemy.dependencyinjectiondemo.services;

public class PrimaryItGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryItGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getItalianGreeting();
    }
}
