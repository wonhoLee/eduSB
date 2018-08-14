package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "It is a home";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "hello world!!";
	}
}
