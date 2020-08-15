package com.jgsudhakar.spring.mq.producer;

import com.jgsudhakar.spring.mq.enums.ExchangeType;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.jgsudhakar.spring.mq.util.Constants.*;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.producer.RabbitMQProducer
 * @Date : 14/08/2020
 */
@Service
public class RabbitMQProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public <T> void send(T reqObj, ExchangeType exchangeType,String router) {
        switch (exchangeType){
        case DIRECT:
            directQueue(reqObj,router);
            break;
        case FANOUT:
            fanoutQueue(reqObj,router);
            break;
        case TOPIC:
            topicQueue(reqObj,router);
            break;
        default:
            headersQueue(reqObj,router);
            break;
        }

    }

    private <T> void directQueue(T reqObj,String router) {
        this.rabbitTemplate.convertAndSend(DIRECT_EXCHANGE_QUEUE,router, reqObj);
//        this.rabbitTemplate.convertAndSend(DIRECT_EXCHANGE_QUEUE,router, reqObj);
    }

    private <T> void fanoutQueue(T requestObj,String router) {
        this.rabbitTemplate.convertAndSend(FANOUT_EXCHANGE_QUEUE,"", requestObj);
    }

    private <T> void topicQueue(T requestObj,String router) {
        this.rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_TYPE,router, requestObj);
    }

    private <T> void headersQueue(T requestObj,String router) {
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("type", "stu-queue");
        MessageConverter messageConverter = new SimpleMessageConverter();
        Message message = messageConverter.toMessage(requestObj, messageProperties);

        this.rabbitTemplate.convertAndSend(HEADER_EXCHANGE_QUEUE,"", message);
    }
}
