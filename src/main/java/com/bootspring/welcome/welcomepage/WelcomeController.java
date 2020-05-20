package com.bootspring.welcome.welcomepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com/goutam")
public class WelcomeController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping(value="/welcome/{name}", method=RequestMethod.GET)
	private String sendWelcome(@PathVariable String name) {
		
		return "Hey "+ name +" welcome to Spring project :) :) ...";
	}
}
