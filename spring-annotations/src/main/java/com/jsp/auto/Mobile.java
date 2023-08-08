package com.jsp.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Mobile {
	@Autowired
	Sim s;
	public void simName() {
		s.sPN();
	}
}
