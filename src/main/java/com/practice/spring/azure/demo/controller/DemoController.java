package com.practice.spring.azure.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/get-msg")
	public String getMessage() {
		return "Welcome Spring Azure Demo Project!!";
	}

}
