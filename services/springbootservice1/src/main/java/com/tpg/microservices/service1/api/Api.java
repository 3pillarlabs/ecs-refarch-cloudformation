package com.tpg.microservices.service1.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	/**
	 * This method is called to check the service availability and 
	 * can also be configured with Application Load Balancer to check
	 * the service health
	 *
	 * Can be called like localhost:2221/service1
	 * 
	 * @return return a string value
	 */
	@RequestMapping("/service1")
	public String callRootPath() {
		return "Welcome to the 3Pilar Global springboot service sample";
	}
	
	/**
	 * This method can be called like localhost:2221/hello
	 * 
	 * @return return a string value
	 */
	@RequestMapping("/service1/hello")
	public String hello() {
		return "Hello, how are you today...";
	}
}
