package com.udemy.dependencyinjectiondemo.controllers;

import com.udemy.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimaryControllerTest {

    private PrimaryController primaryController;

    @Before
    public void setUp() throws Exception {
        this.primaryController = new PrimaryController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, primaryController.sayHello());
    }
}
