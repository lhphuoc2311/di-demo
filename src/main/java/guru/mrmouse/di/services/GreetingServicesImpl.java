package guru.mrmouse.di.services;

import org.springframework.stereotype.Service;

/**
 * @author mrmouse
 * @date May 4, 2019
 * @Time 2:12:18 PM
 */
@Service
public class GreetingServicesImpl implements GreetingServices{
	public static final String HELLO_MOUSE_GURU = "Hello Gurus !!!!";
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO_MOUSE_GURU;
	}

}
