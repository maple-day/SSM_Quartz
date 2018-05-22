package com.fangda.quartz.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fangda.quartz.service.ReddsService;

@Component
public class JobUpdateRedds {

	@Autowired
	private ReddsService reddsService;

	public void execute() {
		System.out.println("定时任务 ---》》》JobUpdateRedds -----》》》 5s执行");
		reddsService.updateRedds();
	}
}
