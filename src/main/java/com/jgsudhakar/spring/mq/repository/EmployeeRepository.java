package com.jgsudhakar.spring.mq.repository;

import com.jgsudhakar.base.repository.BaseRepository;
import com.jgsudhakar.spring.mq.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.repository.EmployeeRepository
 * @Date : 13/08/2020
 */
@Repository
public interface EmployeeRepository extends BaseRepository<EmployeeEntity,Long> {
}
