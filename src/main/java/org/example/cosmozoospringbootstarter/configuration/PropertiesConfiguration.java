package org.example.cosmozoospringbootstarter.configuration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@AutoConfiguration
@PropertySource("classpath:cosmozoo-spring-boot-starter-application.properties")
public class PropertiesConfiguration {
}
