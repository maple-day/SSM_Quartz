package com.fangda.quartz.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fangda.quartz.service.ReddsService;

@Component
public class JobAddRedds {

	@Autowired
	private ReddsService reddsService;
	
	public void execute() {
		System.out.println("定时任务 ---》》》JobAddRedds  =====>>> 2s执行一次");
		reddsService.addRedds();
	}
}
