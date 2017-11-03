package com.joyner.spring.boot.hello;

import java.util.Arrays;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.joyner.spring.boot.hello.entity.MyBean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(Application.class);
    	app.setBannerMode(Banner.Mode.LOG);
    	app.run(args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    	
    	
    	MyBean my = ctx.getBean(MyBean.class);
		System.out.println("看下属性值的覆盖问题：" + my.getName());
		System.out.println("user's age:" + my.getAge());

        return args -> {
        	//System.out.println(args);
           // System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                //System.out.println(beanName);
            }

        };
    }

}