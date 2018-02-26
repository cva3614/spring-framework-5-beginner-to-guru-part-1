package com.udemy.dependencyinjectiondemo;

import com.udemy.dependencyinjectiondemo.controllers.*;
import com.udemy.dependencyinjectiondemo.fakebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		SimpleController controller = (SimpleController) context.getBean("simpleController");
		controller.hello();

		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
	}
}
