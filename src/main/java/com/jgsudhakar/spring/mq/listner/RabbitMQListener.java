package com.jgsudhakar.spring.mq.listner;

import com.jgsudhakar.spring.mq.dto.request.StudentReq;
import com.jgsudhakar.spring.mq.services.EmployeeService;
import com.jgsudhakar.spring.mq.services.StudentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.listner.RabbitMQListener
 * @Date : 15/08/2020
 */
@Component
public class RabbitMQListener {

    @Autowired
    private StudentService studentService;

    @Autowired
    private EmployeeService employeeService;

    @RabbitListener(queues = {"stu-queue"})
    public <T> void studentListener(StudentReq studentReq) {
        System.out.println("StudentReq Message From RabbitMQ: " + studentReq.toString());
        studentService.save(studentReq);
    }

//    @RabbitListener(queues = {"stu-queue"})
//    public <T> void headerMessage(Message message) {
//        System.out.println("Header Message From RabbitMQ: " + message.toString());
//    }

    @RabbitListener(queues = {"emp-queue"})
    public <T> void employeeListener(T reqData) {
            System.out.println("Employee Recieved Message From RabbitMQ: " + reqData.toString());
    }

}
