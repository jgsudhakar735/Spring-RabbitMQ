package com.jgsudhakar.spring.mq.util;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.util.Constants
 * @Date : 14/08/2020
 */
public final class Constants {

    private Constants(){

    }

    public static String TOPIC_EXCHANGE_TYPE = "msg-topic";

    public static String DIRECT_EXCHANGE_QUEUE = "msg-direct-queue";

    public static  String EMPLOYEE_QUEUE = "emp-queue";

    public static  String STUDENT_QUEUE = "stu-queue";

    public static  String STUDENT_ROUTE = "stu-route";

    public static  String EMPLOYEE_ROUTE = "emp-route";

    public static String FANOUT_EXCHANGE_QUEUE = "msg-fanout-queue";

    public static String HEADER_EXCHANGE_QUEUE = "msg-header-queue";

    public static String DIRECT_DEAD_LETTER = "deadLetter";
}
