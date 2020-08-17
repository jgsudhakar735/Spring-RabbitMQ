package com.jgsudhakar.spring.mq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.spring.mq.entity.StudentEntity
 * @Date : 15/08/2020
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT")
@EqualsAndHashCode(callSuper = false)
public class StudentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "STU_SEQ")
//    @SequenceGenerator(name = "STU_SEQ", sequenceName = "STU_SEQ",allocationSize = 1,initialValue = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String stuName;

    @Column(name = "ROLL_NO")
    private String rollNo;

    @Column(name = "STANDARD")
    private String standard;

}
