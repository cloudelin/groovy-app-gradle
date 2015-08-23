package org.cloude.groovy.spring.boot.web.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@EnableAutoConfiguration
class SpringWebApp {

	static main(args) {
		SpringApplication.run(SpringWebApp.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

}