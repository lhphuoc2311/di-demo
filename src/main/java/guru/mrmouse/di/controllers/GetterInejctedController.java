package guru.mrmouse.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.mrmouse.di.services.GreetingServices;

/**
 * @author mrmouse
 * @date May 4, 2019
 * @Time 2:39:43 PM
 */
@Controller
public class GetterInejctedController {
	
	private GreetingServices greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	public void setGreetingService(GreetingServices greetingService) {
		this.greetingService = greetingService;
	}
	
	

}
