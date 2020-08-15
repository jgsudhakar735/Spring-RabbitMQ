package com.jgsudhakar.spring.mq.services.impl;

import com.jgsudhakar.base.exception.BaseException;
import com.jgsudhakar.spring.mq.dto.request.EmployeReq;
import com.jgsudhakar.spring.mq.dto.response.EmployeRes;
import com.jgsudhakar.spring.mq.entity.EmployeeEntity;
import com.jgsudhakar.spring.mq.services.EmployeeService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.services.impl.EmployeeServiceImpl
 * @Date : 13/08/2020
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public EmployeRes save(EmployeReq dto) throws BaseException {
        return null;
    }

    @Override
    public EmployeRes update(EmployeReq dto) throws BaseException {
        return null;
    }

    @Override
    public EmployeRes findById(Long id) throws BaseException {
        return null;
    }

    @Override
    public EmployeRes findByExample(Example<EmployeeEntity> example) throws BaseException {
        return null;
    }

    @Override
    public List<EmployeRes> findAllByExample(Example<EmployeeEntity> example) throws BaseException {
        return null;
    }

    @Override
    public void delete(Long id) throws BaseException {

    }

    @Override
    public Page<EmployeRes> findAll(Pageable pageable) throws BaseException {
        return null;
    }

    @Override
    public Page<EmployeRes> findAll(Pageable pageable, Example<EmployeeEntity> example) throws BaseException {
        return null;
    }
}
