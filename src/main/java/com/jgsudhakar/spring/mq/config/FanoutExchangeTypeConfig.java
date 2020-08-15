package com.jgsudhakar.spring.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.jgsudhakar.spring.mq.util.Constants.*;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.config.RabbitMQFanoutTypeConfig
 * @Date : 15/08/2020
 */

@Configuration
public class FanoutExchangeTypeConfig {

    // Creating the Employee Queue to send all the employee message to Employee Queue
    @Bean
    public Queue empQueue() {
        return new Queue(EMPLOYEE_QUEUE,false);
    }

    // Creating the Student Queue to send all the Student message to Student Queue
    @Bean
    public Queue studentQueue() {
        return new Queue(STUDENT_QUEUE,false);
    }

    // Creating single direct Exchange to route to the specific Queue
    @Bean
    public FanoutExchange exchange() {
        return new FanoutExchange(FANOUT_EXCHANGE_QUEUE);
    }

    @Bean
    Binding employeeBinding(Queue empQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(empQueue).to(exchange);
    }

    @Bean
    Binding studentBinding(Queue studentQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(studentQueue).to(exchange);
    }
}
