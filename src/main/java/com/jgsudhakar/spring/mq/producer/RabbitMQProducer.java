package com.jgsudhakar.spring.mq.producer;

import com.jgsudhakar.spring.mq.util.Constants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.producer.RabbitMQProducer
 * @Date : 14/08/2020
 */
@Service
public class RabbitMQProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void sendDataToListner (String data) {
        this.rabbitTemplate.convertAndSend(Constants.TOPIC_EXCHANGE_TYPE,Constants.ROUTER_KEY, data);
        System.out.println("Message Sent !");
    }
}
