package guru.mrmouse.di.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author mrmouse
 * @date May 3, 2019
 */
@Controller
public class MyController {
	public String hello() {
		System.out.println("Hello !!!");
		return "foo";
	}

}
