package com.jgsudhakar.spring.mq.api;

import com.jgsudhakar.spring.mq.dto.request.EmployeReq;
import com.jgsudhakar.spring.mq.enums.ExchangeType;
import com.jgsudhakar.spring.mq.producer.RabbitMQProducer;
import com.jgsudhakar.spring.mq.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.api.EmployeeController
 * @Date : 13/08/2020
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @PostMapping("")
    public String save(
            @RequestBody EmployeReq employeReq,
            @RequestHeader(value = "exchangeType", required = true) ExchangeType exchangeType) {
        rabbitMQProducer.send(employeReq,exchangeType, Constants.EMPLOYEE_ROUTE);
        return "Employee Details sent Successfully to Rabbit MQ :)";
    }
}
