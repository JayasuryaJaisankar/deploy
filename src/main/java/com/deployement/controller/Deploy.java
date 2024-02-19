package com.deployement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deploy {
	@GetMapping("/surya")
	public String helo() {
		return "Surya";
	}

}
