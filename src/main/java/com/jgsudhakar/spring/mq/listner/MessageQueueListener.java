package com.jgsudhakar.spring.mq.listner;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.listner.RabbitMQListner
 * @Date : 14/08/2020
 */
@Service
public class MessageQueueListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println(" In the Message Method ");
        System.out.println(new String(message.getBody()));
    }

    @Override
    public void containerAckMode(AcknowledgeMode mode) {
        System.out.println(" In the containerAckMode Method ");
    }

    @Override
    public void onMessageBatch(List<Message> messages) {
        System.out.println(" In the onMessageBatch Method ");
    }
}
