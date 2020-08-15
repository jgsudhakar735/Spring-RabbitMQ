package com.jgsudhakar.spring.mq.dto.request;

import com.jgsudhakar.base.request.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.dto.request.EmployeReq
 * @Date : 13/08/2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeReq extends BaseRequest<EmployeReq> {

    private String firstName;

    private String lastName;
}
