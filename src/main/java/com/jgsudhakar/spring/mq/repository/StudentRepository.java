package com.jgsudhakar.spring.mq.repository;

import com.jgsudhakar.spring.mq.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.repository.StudentRepository
 * @Date : 15/08/2020
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
