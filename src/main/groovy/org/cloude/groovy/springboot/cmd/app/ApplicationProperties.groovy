package org.cloude.groovy.springboot.cmd.app

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class ApplicationProperties {

	@Value('${application.name}')
	String applicationName
}
