package guru.mrmouse.di.controllers;

import org.springframework.stereotype.Controller;

import guru.mrmouse.di.services.GreetingServices;

/**
 * @author mrmouse
 * @date May 4, 2019
 * @Time 4:28:49 PM
 */
@Controller
public class ConstructorInjectedController {
	
	private GreetingServices greetingService;
	
	public ConstructorInjectedController(GreetingServices greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
