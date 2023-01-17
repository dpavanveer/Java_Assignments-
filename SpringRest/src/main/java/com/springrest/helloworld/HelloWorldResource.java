package com.springrest.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	@RequestMapping("/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	@RequestMapping("/hello-world-bean")
	public Helloworldbean helloworldbean() {
		return new Helloworldbean("Hello World");
	}
	
	@RequestMapping("/hello-world-path-param/{name}")
	public Helloworldbean helloworldbeanPathParam(@PathVariable String name) {
		return new Helloworldbean("Hello World," + name);
	}
	
	@RequestMapping("/hello-world-path-param/{name}/{message}")
	public Helloworldbean helloworldMultiplePathParam(@PathVariable String name,@PathVariable String message) {
		return new Helloworldbean("Hello World " + name + ","+message);
	}
	
}