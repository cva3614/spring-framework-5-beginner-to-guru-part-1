package com.udemy.dependencyinjectiondemo.config;

import com.udemy.dependencyinjectiondemo.services.GreetingRepository;
import com.udemy.dependencyinjectiondemo.services.GreetingService;
import com.udemy.dependencyinjectiondemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingSevice("en");
    }

    @Bean
    @Primary
    @Profile("lv")
    GreetingService primaryLvGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingSevice("lv");
    }

    @Bean
    @Primary
    @Profile("it")
    GreetingService primaryItGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingSevice("it");
    }
}
