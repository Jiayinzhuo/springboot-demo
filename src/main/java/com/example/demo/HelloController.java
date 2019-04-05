package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {
	
	//http://localhost:8080/demo/hello?name=Jiayin
	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return "Hello " + name;
	}

}
