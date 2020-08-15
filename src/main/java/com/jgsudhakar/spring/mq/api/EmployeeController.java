package com.jgsudhakar.spring.mq.api;

import com.jgsudhakar.base.controller.BaseController;
import com.jgsudhakar.spring.mq.producer.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.api.EmployeeController
 * @Date : 13/08/2020
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController extends BaseController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @GetMapping("/{name}")
    public String getName(@PathVariable(name = "name") String name) {
        rabbitMQProducer.sendDataToListner(name);
        return "Welcome ! "+ name + " \n Message sent Successfully to Rabbit MQ :)";
    }
}
