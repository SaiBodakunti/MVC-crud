package com.jsp.inb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.comp.MyConfig;

public class TestJ2EE {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		ArrayList list=(ArrayList)applicationContext.getBean("create");
		System.out.println(list);
	}

}
