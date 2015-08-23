package org.cloude.groovy.springboot.cmd.app

import org.cloude.groovy.springboot.cmd.app.service.DemoService;
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringCmdApp implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(SpringCmdApp.class)
	
	@Autowired
	ApplicationProperties applicationProperties
	
	@Autowired
	DemoService demoService

	static main(args) {
		SpringApplication.run(SpringCmdApp.class, args);
	}
	
	@Override
	public void run(String... args) {
		log.info applicationProperties.applicationName
		log.info demoService.getHelloMessage()
	}

}
