package guru.mrmouse.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.mrmouse.di.controllers.ConstructorInjectedController;
import guru.mrmouse.di.controllers.GetterInejctedController;
import guru.mrmouse.di.controllers.MyController;
import guru.mrmouse.di.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController)ctx.getBean("myController");
		controller.hello();
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		
		System.out.println(ctx.getBean(GetterInejctedController.class).sayHello());
		
		
	}

}
