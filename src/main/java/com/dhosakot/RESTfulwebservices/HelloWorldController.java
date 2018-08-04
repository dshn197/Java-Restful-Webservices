package com.dhosakot.RESTfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET ,path="/helloWorld")
	public String helloWorld() {
		return "Hi darshan here, hello, how are you doing?";
	}
	
	@RequestMapping(method=RequestMethod.GET ,path="/helloWorldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	
}
