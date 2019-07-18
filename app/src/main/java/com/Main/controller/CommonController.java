package com.Main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/api1")
	public String api1() {
		return "/api1";
	}
	
	@GetMapping("/api2")
	public String api2() {
		return "/api2";
	}
}
