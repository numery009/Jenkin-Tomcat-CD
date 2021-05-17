package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@GetMapping("/get")
	public String message() {
		return "Hello world! I am updated in Tomcat 8.5.";
	}
}
