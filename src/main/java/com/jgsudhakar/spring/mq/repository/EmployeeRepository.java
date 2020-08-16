package com.jgsudhakar.spring.mq.repository;

import com.jgsudhakar.spring.mq.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.repository.EmployeeRepository
 * @Date : 13/08/2020
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
