package com.jsp.inb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class MyConfig {
	@Bean
	public ArrayList create(){
		return new ArrayList();

	}
}
