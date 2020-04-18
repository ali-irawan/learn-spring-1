package com.devtalks.spring.session1;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.devtalks.spring.session1.service.Login;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Session1Application {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(Session1Application.class, args);
	}

	public Session1Application() {
		System.out.println("Constructor");
		System.out.println(context);
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Post Construct");		
		System.out.println(context);
		
		Login login = context.getBean(Login.class);
		System.out.println(login);
	}
}
