package com.udemy.dependencyinjectiondemo;

import com.udemy.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import com.udemy.dependencyinjectiondemo.controllers.PropertyInjectedController;
import com.udemy.dependencyinjectiondemo.controllers.SetterInjectedController;
import com.udemy.dependencyinjectiondemo.controllers.SimpleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		SimpleController controller = (SimpleController) context.getBean("simpleController");
		controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
