package com.jgsudhakar.spring.mq;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


@EnableAutoConfiguration
@Configuration
@ComponentScan
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringRabbitMqApplication.class);
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.setProperty("log4j2.loggerContextFactory", "com.mxlogger.configuration.log4j2.MxLog4jContextFactory");
		System.setProperty("log4j.shutdownHookEnabled", "true");
		servletContext.addListener(RequestContextListener.class);
		super.onStartup(servletContext);
	}
	


}
