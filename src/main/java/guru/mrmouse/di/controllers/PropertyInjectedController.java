package guru.mrmouse.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.mrmouse.di.services.GreetingServicesImpl;

/**
 * @author mrmouse
 * @date May 4, 2019
 * @Time 2:26:48 PM
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingServicesImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	 

}
