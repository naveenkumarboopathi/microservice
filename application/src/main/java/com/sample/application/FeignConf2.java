package com.sample.application;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="second-app")
@RibbonClient(name="second-app")
public interface FeignConf2 {

	@GetMapping("/api2")
	public String api1();
	
}
