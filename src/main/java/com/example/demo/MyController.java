package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping(path = "/admin")
	public String admin() {
		return "admin";
	}

	@GetMapping(path = "/user")
	public String user() {
		return "user";
	}
}
