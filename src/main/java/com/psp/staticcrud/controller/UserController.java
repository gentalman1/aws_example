package com.psp.staticcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

	@GetMapping("user")
	public String getUser() {
		return "user obtained successfull!!";
	}

	@GetMapping("getUser")
	public String getSingleUserDetails() {
		return "Purv Satishbhai Patel";
	}

	@GetMapping("login")
	public String login() {
		return "login details";
	}
}
