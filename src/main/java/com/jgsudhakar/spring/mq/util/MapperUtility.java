package com.jgsudhakar.spring.mq.util;

import com.jgsudhakar.spring.mq.dto.request.StudentReq;
import com.jgsudhakar.spring.mq.dto.response.StudentRes;
import com.jgsudhakar.spring.mq.entity.StudentEntity;
import org.springframework.stereotype.Component;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.util.MapperUtility
 * @Date : 15/08/2020
 */
@Component
public class MapperUtility {

    public StudentEntity convertToDBEntity (StudentReq studentReq) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setRollNo(studentReq.getRollNo());
        studentEntity.setStandard(studentReq.getStandard());
        studentEntity.setStuName(studentReq.getStuName());
        return studentEntity;
    }


    public StudentRes convertFromDBEntity (StudentEntity studentEntity) {
        StudentRes studentRes = new StudentRes();
        studentRes.setRollNo(studentEntity.getRollNo());
        studentRes.setStandard(studentEntity.getStandard());
        studentRes.setStuName(studentEntity.getStuName());
        studentRes.setId(studentEntity.getId());
        return studentRes;
    }
}
