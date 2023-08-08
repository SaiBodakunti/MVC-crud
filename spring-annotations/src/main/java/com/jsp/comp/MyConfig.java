package com.jsp.comp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jsp.inb.ArrayList;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class MyConfig {
	
	@Bean
	public ArrayList create() {
		return new ArrayList();
	}
	

}
