package com.sample.application;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="nodemicroservice")
@RibbonClient(name="nodemicroservice")
public interface FeignConf {
	
	@GetMapping("/url")
	public String samples1();
	
	@GetMapping("/info")
	public String samples2();

}
