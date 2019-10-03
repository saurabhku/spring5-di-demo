package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		//System.out.println(((PropertyInjectedController) ctx.getBean("propertyInjectedController")).sayHello()) ;
		//System.out.println(((SetterInjectedController) ctx.getBean("setterInjectedController")).sayHello()) ;
		System.out.println(((ConstructorInjectedController) ctx.getBean("constructorInjectedController")).sayHello()) ;
	}
}
