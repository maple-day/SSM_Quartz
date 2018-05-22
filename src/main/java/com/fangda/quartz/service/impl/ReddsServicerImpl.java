package com.fangda.quartz.service.impl;

import org.springframework.stereotype.Service;

import com.fangda.quartz.service.ReddsService;

@Service
public class ReddsServicerImpl implements ReddsService {

	@Override
	public void addRedds() {
		System.out.println("ReddsServicerImpl  ---- >>  addRedds");
	}

	@Override
	public void updateRedds() {
		System.out.println("ReddsServicerImpl  ---- >>  updateRedds");
	}

}
