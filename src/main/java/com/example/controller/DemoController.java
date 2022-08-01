package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value = "/")
	public String method()
	{
		
		System.out.println("Merge Check");
		return "Hi";
	}
	@RequestMapping(value = "/Sh")
	public String method1()
	{
		return "Hi Sh";
	}
}
