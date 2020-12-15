package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWebController {
	
	@RequestMapping(value= {"/","","/home"})
	public String hello() {
		return "Hello from Bridgelabz";
	}
}
