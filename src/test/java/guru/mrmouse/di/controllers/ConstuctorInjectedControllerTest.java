package guru.mrmouse.di.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.mrmouse.di.services.GreetingServicesImpl;

/**
 * @author mrmouse
 * @date May 4, 2019
 * @Time 7:32:05 PM
 */
public class ConstuctorInjectedControllerTest {
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServicesImpl());
	}
	
	@Test
	public void testGreeting () throws Exception{
		assertEquals(GreetingServicesImpl.HELLO_MOUSE_GURU,constructorInjectedController.sayHello());
	}

}
