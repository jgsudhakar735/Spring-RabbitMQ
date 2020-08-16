package com.jgsudhakar.spring.mq.exception;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.base.exception.BaseException
 * @Date : 30/05/2020
 */
//@Log4j2
public class BaseException extends RuntimeException {

    /**
     * Error Code which Passing to the Base Exception
     * */
    private String errorCode;

    /**
     * Error Message which Passing to the Base Exception
     * */
    private String errorMessage;

    public BaseException() {
        super();
    }

    public BaseException(String errMessage) {
        super(errMessage);
        this.errorMessage = errMessage;
    }

    public BaseException(Throwable throwable) {
        super(throwable);
    }

    public BaseException(String errMessage, Throwable throwable) {
        super(errMessage,throwable);
        this.errorMessage = errMessage;
    }

    public BaseException(String errorCode, String errMessage) {
        super(errMessage);
        this.errorCode = errorCode;
        this.errorMessage = errMessage;
    }

    public BaseException(String errorCode, String errMessage, Throwable throwable) {
        super(errMessage,throwable);
        this.errorCode = errorCode;
        this.errorMessage = errMessage;
    }

}
