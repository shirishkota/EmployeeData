package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
}
