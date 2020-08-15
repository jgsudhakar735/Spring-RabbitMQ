package com.jgsudhakar.spring.mq.services.impl;

import com.jgsudhakar.base.exception.BaseException;
import com.jgsudhakar.spring.mq.dto.request.StudentReq;
import com.jgsudhakar.spring.mq.dto.response.StudentRes;
import com.jgsudhakar.spring.mq.entity.StudentEntity;
import com.jgsudhakar.spring.mq.repository.StudentRepository;
import com.jgsudhakar.spring.mq.services.StudentService;
import com.jgsudhakar.spring.mq.util.MapperUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.services.impl.EmployeeServiceImpl
 * @Date : 13/08/2020
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private MapperUtility mapperUtility;

    @Override
    public StudentRes save(StudentReq dto) throws BaseException {
        StudentEntity studentEntity = mapperUtility.convertToDBEntity(dto);
        studentEntity = studentRepository.saveOrUpdateRecord(studentEntity);
        return mapperUtility.convertFromDBEntity(studentEntity);
    }

    @Override
    public StudentRes update(StudentReq dto) throws BaseException {
        StudentEntity studentEntity = mapperUtility.convertToDBEntity(dto);
        studentEntity.setId(dto.getId());
        studentEntity = studentRepository.saveOrUpdateRecord(studentEntity);
        return mapperUtility.convertFromDBEntity(studentEntity);
    }

    @Override
    public StudentRes findById(Long id) throws BaseException {
        Optional<StudentEntity> data = studentRepository.findById(id);
        if(data.isPresent())
            return mapperUtility.convertFromDBEntity(data.get());

        return null;
    }

    @Override
    public StudentRes findByExample(Example<StudentEntity> example) throws BaseException {
        Optional<StudentEntity> data = studentRepository.findOne(example);
        if(data.isPresent())
            return mapperUtility.convertFromDBEntity(data.get());

        return null;
    }

    @Override
    public List<StudentRes> findAllByExample(Example<StudentEntity> example) throws BaseException {
        return null;
    }

    @Override
    public void delete(Long id) throws BaseException {

    }

    @Override
    public Page<StudentRes> findAll(Pageable pageable) throws BaseException {
        return null;
    }

    @Override
    public Page<StudentRes> findAll(Pageable pageable, Example<StudentEntity> example) throws BaseException {
        return null;
    }
}
