package com.udemy.dependencyinjectiondemo.config;

import com.udemy.dependencyinjectiondemo.fakebeans.FakeDataSource;
import com.udemy.dependencyinjectiondemo.fakebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {

    @Value("${db.username}")
    String dbUsername;

    @Value("${db.password}")
    String dbPassword;

    @Value("${db.url}")
    String dbUrl;

    @Value("${jms.username}")
    String jmsUsername;

    @Value("${jms.password}")
    String jmsPassoword;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(dbUsername);
        fakeDataSource.setPassword(dbPassword);
        fakeDataSource.setUrl(dbUrl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassoword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
