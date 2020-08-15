package com.jgsudhakar.spring.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jgsudhakar"})
public class SpringRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqApplication.class, args);
	}

}
