package com.jgsudhakar.spring.mq.api;

import com.jgsudhakar.spring.mq.dto.request.StudentReq;
import com.jgsudhakar.spring.mq.enums.ExchangeType;
import com.jgsudhakar.spring.mq.producer.RabbitMQProducer;
import com.jgsudhakar.spring.mq.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.api.StudentController
 * @Date : 15/08/2020
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @PostMapping("")
    public String save(
          @RequestBody StudentReq studentReq,
          @RequestHeader(value = "exchangeType", required = true) ExchangeType exchangeType) {
        rabbitMQProducer.send(studentReq,exchangeType, Constants.STUDENT_ROUTE);
        return "Student Details sent Successfully to Rabbit MQ :)";
    }
}
