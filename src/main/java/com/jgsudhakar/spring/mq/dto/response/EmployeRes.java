package com.jgsudhakar.spring.mq.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.dto.response.EmployeRes
 * @Date : 13/08/2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeRes implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;
}
