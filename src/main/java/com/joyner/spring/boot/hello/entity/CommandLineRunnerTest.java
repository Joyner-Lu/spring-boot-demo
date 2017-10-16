package com.joyner.spring.boot.hello.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * 测试下commanLineRunner
 * @author 62358
 *
 */
@Component
public class CommandLineRunnerTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//测试
		System.out.println("============CommandLineRunnerTest");

	}

}
