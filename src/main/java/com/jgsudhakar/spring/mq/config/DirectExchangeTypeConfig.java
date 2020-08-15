package com.jgsudhakar.spring.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.jgsudhakar.spring.mq.util.Constants.*;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.config.RabbitMQDirectTypeConfig
 * @Date : 15/08/2020
 */
@Configuration
public class DirectExchangeTypeConfig {


    // Creating the Employee Queue to send all the employee message to Employee Queue
    @Bean
    @Qualifier("empQueue")
    public Queue empQueue() {
       return new Queue(EMPLOYEE_QUEUE,false);
    }

    // Creating the Student Queue to send all the Student message to Student Queue
    @Bean
    @Qualifier("studentQueue")
    public Queue studentQueue() {
       return new Queue(STUDENT_QUEUE,false);
    }

    // Creating single direct Exchange to route to the specific Queue
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(DIRECT_EXCHANGE_QUEUE);
    }

    @Bean
    Queue queue() {
        return QueueBuilder.durable("dead-letter-queue").withArgument("x-dead-letter-exchange", "deadLetter")
                .withArgument("x-dead-letter-routing-key", "stu-route").build();
    }

    @Bean
    Queue dlq() {
        return QueueBuilder.durable("dead-letter-queue").build();
    }

    @Bean
    DirectExchange deadLetterExchange() {
        return new DirectExchange(DIRECT_DEAD_LETTER);
    }

    @Bean
    @Qualifier("employeeBinding")
    Binding employeeBinding(@Qualifier("empQueue") Queue empQueue, DirectExchange exchange) {
        return BindingBuilder.bind(empQueue).to(exchange).with(EMPLOYEE_ROUTE);
    }

    @Bean
    @Qualifier("studentBinding")
    Binding studentBinding(@Qualifier("studentQueue") Queue studentQueue, DirectExchange exchange) {
        return BindingBuilder.bind(studentQueue).to(exchange).with(STUDENT_ROUTE);
    }
    @Bean
    @Qualifier("studentBinding")
    Binding queueBinding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(STUDENT_ROUTE);
    }

    @Bean
    Binding DLQbinding() {
        return BindingBuilder.bind(dlq()).to(deadLetterExchange()).with("deadLetter");
    }

}
