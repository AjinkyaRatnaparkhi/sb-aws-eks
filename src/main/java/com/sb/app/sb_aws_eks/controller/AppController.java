package com.sb.app.sb_aws_eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/getData")
	public String getData() {
		return " Spring boot app is up "; 
	}
	
}
