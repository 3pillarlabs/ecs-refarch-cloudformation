package com.tpg.microservices.service2.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	/**
	 * This method is called to check the service availability and 
	 * can also be configured with Application Load Balancer to check
	 * the service health
	 *
	 * Can be called like localhost:2222/service2
	 * 
	 * @return return a string value
	 */
	@RequestMapping("/service2")
	public String callRootPath() {
		return "Welcome to the 3Pilar Global springboot service2 sample";
	}
	
	/**
	 * This method can be called like localhost:2222/service2/hello
	 * 
	 * @return return a string value
	 */
	@RequestMapping("/service2/hello")
	public String hello() {
		return "Hello from service2...";
	}
}
