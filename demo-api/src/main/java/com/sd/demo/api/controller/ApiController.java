package com.sd.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World";
	}
	
	
}
