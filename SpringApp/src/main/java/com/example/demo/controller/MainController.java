package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String welcome() {
		return "<h2>Welcome</h2><br><p>This is a sample project</p>";
	}
}
