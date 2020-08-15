package com.jgsudhakar.spring.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.jgsudhakar.spring.mq.util.Constants.*;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.config.RabbitMQTopicTypeConfig
 * @Date : 15/08/2020
 */
@Configuration
public class TopicExchangeTypeConfig {

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
    public TopicExchange exchange() {
        return new TopicExchange(TOPIC_EXCHANGE_TYPE);
    }

    @Bean
    Binding employeeBinding(Queue empQueue, TopicExchange exchange) {
        return BindingBuilder.bind(empQueue).to(exchange).with(STUDENT_ROUTE);
    }

    @Bean
    Binding studentBinding(Queue studentQueue, TopicExchange exchange) {
        return BindingBuilder.bind(studentQueue).to(exchange).with(EMPLOYEE_ROUTE);
    }
}
