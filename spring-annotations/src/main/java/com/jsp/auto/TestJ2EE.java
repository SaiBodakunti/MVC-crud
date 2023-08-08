package com.jsp.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.comp.MyConfig;

public class TestJ2EE {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Mobile mobile= (Mobile) applicationContext.getBean("mobile");
		mobile.simName();

	}

}
