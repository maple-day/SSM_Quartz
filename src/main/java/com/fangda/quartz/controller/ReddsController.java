package com.fangda.quartz.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v")
@RestController
public class ReddsController {

	@RequestMapping("hello")
	public String hello() {
		return "hello world :"+new Date();
	}
	
	
}
