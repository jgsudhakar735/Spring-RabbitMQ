package com.jgsudhakar.spring.mq.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.dto.request.StudentReq
 * @Date : 15/08/2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentReq implements Serializable {

    private Long id;

    private String stuName;

    private String rollNo;

    private String standard;

}
