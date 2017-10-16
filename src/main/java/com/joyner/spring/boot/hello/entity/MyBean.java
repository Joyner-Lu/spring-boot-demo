package com.joyner.spring.boot.hello.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	@Autowired
	public  MyBean(ApplicationArguments args) {
		boolean debug = args.containsOption("debug");
		System.out.println("=================debug:" + debug);
		
		String[] rawArgs = args.getSourceArgs();
		for (String arg : rawArgs) {
			System.out.println("-----------------rawArgs:" + arg);
		}
		
		
		
	}
	
	@Value("${name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
