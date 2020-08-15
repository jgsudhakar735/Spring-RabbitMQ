package com.jgsudhakar.spring.mq.services;

import com.jgsudhakar.base.service.BaseDBServices;
import com.jgsudhakar.spring.mq.dto.request.StudentReq;
import com.jgsudhakar.spring.mq.dto.response.StudentRes;
import com.jgsudhakar.spring.mq.entity.StudentEntity;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.services.StudentService
 * @Date : 13/08/2020
 */
public interface StudentService extends BaseDBServices<StudentReq, StudentRes, StudentEntity> {
}
