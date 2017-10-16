package com.joyner.spring.boot.hello;

import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/addUser.do")
    public String addUser() {
    	System.out.println("add new user");
    	return "success";
    }

}