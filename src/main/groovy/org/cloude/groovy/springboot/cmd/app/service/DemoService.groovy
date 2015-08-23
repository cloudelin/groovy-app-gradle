package org.cloude.groovy.springboot.cmd.app.service

import org.springframework.stereotype.Component;

@Component
class DemoService {
	
	def getHelloMessage() {
		return 'Hello world (from service)'
	}
}
