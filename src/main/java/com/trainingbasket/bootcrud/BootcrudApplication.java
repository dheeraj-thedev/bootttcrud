package com.trainingbasket.bootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



//EMS - Employee Management System

@SpringBootApplication
public class BootcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcrudApplication.class, args);
	}

	@Bean
	public ViewResolver getViewResolved() {
		final InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
//			/WEB-INF/jsp/+"ControllerReturns"+.jsp
		return resolver;
	}

}
