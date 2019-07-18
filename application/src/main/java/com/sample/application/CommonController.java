package com.sample.application;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommonController {

	@Resource
	FeignConf feignConf;
	
	@Resource
	FeignConf2 feignConf2;

 	@GetMapping("/api1")
	public String value1() {
 		return "samples";
 	}
 	
 	@GetMapping("/api2")
	public String value2() {
		return feignConf.samples1();
 	}
 	
 	@GetMapping("/api3")
 	public String value3() {
 		return feignConf.samples2();
 	}
 	
 	@GetMapping("/api4")
 	public String value4() {
 		return feignConf2.api1();
 	}
}
