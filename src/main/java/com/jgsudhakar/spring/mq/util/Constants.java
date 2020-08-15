package com.jgsudhakar.spring.mq.util;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.util.Constants
 * @Date : 14/08/2020
 */
public final class Constants {

    private Constants(){

    }

    public static String LISTENER_NAME = "jgsudhakar";

    public static String QUEUE_NAME = "msg-queue";

    public static String TOPIC_EXCHANGE_TYPE = "msg-topic";

    public static String DIRECT_EXCHANGE_TYPE = "msg-direct";

    public static String DIRECT_EXCHANGE_QUEUE = "msg-direct-queue";

    public static String ROUTER_KEY = LISTENER_NAME + "_router";

}
