package com.jsp.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJ2EE {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	Admin admin=(Admin) applicationContext.getBean("admin");
	admin.test();
}
}
