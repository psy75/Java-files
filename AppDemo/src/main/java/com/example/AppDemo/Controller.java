package com.example.AppDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String greet() {
		return "Hello world, welcome to Spring application..";
	}

}
