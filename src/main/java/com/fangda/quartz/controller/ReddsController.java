package com.fangda.quartz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v")
@RestController
public class ReddsController {

	@RequestMapping("a")
	public String meod() {
		return "hello world";
	}
	
	
}
