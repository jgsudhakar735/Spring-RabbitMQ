package com.jgsudhakar.spring.mq.services;

import com.jgsudhakar.base.request.BaseRequest;
import com.jgsudhakar.base.response.BaseResponse;
import com.jgsudhakar.base.service.BaseDBServices;
import com.jgsudhakar.base.service.BaseService;
import com.jgsudhakar.spring.mq.dto.request.EmployeReq;
import com.jgsudhakar.spring.mq.dto.response.EmployeRes;
import com.jgsudhakar.spring.mq.entity.EmployeeEntity;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.services.imple.EmployeeService
 * @Date : 13/08/2020
 */
public interface EmployeeService extends BaseDBServices<EmployeReq , EmployeRes , EmployeeEntity> {
}
