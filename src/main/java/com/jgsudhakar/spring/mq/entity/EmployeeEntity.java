package com.jgsudhakar.spring.mq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.entity.EmployeeEntity
 * @Date : 13/08/2020
 */
@Entity(name = "EMPLOYEE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "AS_SEQ")
    @SequenceGenerator(name = "AS_SEQ", sequenceName = "AS_SEQ",allocationSize = 1,initialValue = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String empFirstName;

    @Column(name = "LAST_NAME")
    private String empLastName;
}
