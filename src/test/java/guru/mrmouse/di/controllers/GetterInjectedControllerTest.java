package guru.mrmouse.di.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.mrmouse.di.services.GreetingServicesImpl;

/**
 * @author mrmouse
 * @date May 4, 2019
 * @Time 5:35:35 PM
 */
public class GetterInjectedControllerTest {
	private GetterInejctedController getterInejctedController;
	
	@Before
	public void setUp() throws Exception{
		this.getterInejctedController = new GetterInejctedController();
		this.getterInejctedController.setGreetingService(new GreetingServicesImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServicesImpl.HELLO_MOUSE_GURU, getterInejctedController.sayHello());
	}

}
