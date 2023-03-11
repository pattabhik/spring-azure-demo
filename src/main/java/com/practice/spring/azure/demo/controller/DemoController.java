package com.practice.spring.azure.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/get-msg")
	public String getMessage() {
		return "Welcome Spring Azure Demo Project!!";
	}

}
