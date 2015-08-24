package org.cloude.groovy.springboot.cmd.app

import org.cloude.groovy.springboot.cmd.app.service.DemoService
import org.cloude.groovy.springboot.cmd.app.service.JavaDemoService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
class SpringCmdApp implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(SpringCmdApp.class)
	
	@Autowired
	ApplicationProperties applicationProperties
	
	@Autowired
	DemoService demoService
	
	@Autowired
	JavaDemoService javaService
	
	@Autowired
	JdbcTemplate jdbcTemplate

	static main(args) {
		SpringApplication.run(SpringCmdApp.class, args);
	}
	
	@Override
	public void run(String... args) {
		log.info applicationProperties.applicationName
		log.info demoService.getHelloMessage()
		log.info javaService.helloWorld()
		log.info jdbcTemplate.toString()
	}

}
