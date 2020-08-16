package com.jgsudhakar.spring.mq.services;

import com.jgsudhakar.spring.mq.exception.BaseException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.base.service.BaseDBServices
 * @Date : 26/06/2020
 */
public interface BaseDBServices<REQ, RES, ENTITY> {


    /**
     * This method will be used to Insert/ Create an entry in Data Base {@link REQ}.
     * This will be taking the parameter of DTO and at service layer this can be
     * converted as Entity and save.
     *
     * <pre>
     *  <i> How to Use :</i>
     *      Autowire / Inject the {@link com.jgsudhakar.base.repository.BaseRepository} arguments of Entity class and Primary key class.
     *      And directly call the {@link com.jgsudhakar.base.repository.BaseRepository#saveOrUpdateRecord(ENTITY)}.
     *      This will persist the data in the DataBase and return the saved entity back.
     * </pre>
     *
     *
     * @param dto
     * @return
     * @throws BaseException
     */
    public RES save(REQ dto) throws BaseException;

    /**
     * This method will be used to Update an entry in Data Base {@link REQ}. This
     * will be taking the parameter of DTO and at service layer this can be
     * converted as Entity and save.
     *
     * <pre>
     *  <i> How to Use :</i>
     *      Autowire / Inject the {@link com.jgsudhakar.base.repository.BaseRepository} arguments of Entity class and Primary key class.
     *      And directly call the {@link com.jgsudhakar.base.repository.BaseRepository#saveOrUpdateRecord(ENTITY)}.
     *      This will persist the data in the DataBase and return the saved entity back.
     * </pre>
     *
     * Note : While Editing , Version will be updated by default , we should not
     * increment the value at our end.
     *
     * @return RES
     * @throws BaseException
     */
    public RES update(REQ dto) throws BaseException;

    /**
     * This method is used to fetch the Data based on the Primary of the Table.
     *
     * @param id
     * @return
     * @throws BaseException
     */
    public RES findById(Long id) throws BaseException;

    /**
     * This method will be used to fetch the single record with the specified conditions. This method should be used in the combination of
     * Unique Field In the Table or with the Primary Key in the Table.
     * <pre>
     * <i>How to Use:</i>
     *
     * ENTITY entity = new ENTITY();
     * entity.set..(XXX);
     * RES response = service.findByExample(Example.of(entity));
     * </pre>
     * @param example
     * @return
     * @throws BaseException
     */
    public RES findByExample(Example<ENTITY> example) throws BaseException;

    /**
     * This method will be used to fetch the single record with the specified conditions. This method can be used with Single record or multiple record combination.
     *
     * <pre>
     * <i>How to Use:</i>
     *
     * ENTITY entity = new ENTITY();
     * entity.set..(XXX);
     * List<RES> response = service.findByExample(Example.of(entity));
     * </pre>
     * @param example
     * @return
     * @throws BaseException
     */
    public List<RES> findAllByExample(Example<ENTITY> example) throws BaseException;

    /**
     * To delete the record with Primary key in the table.
     * @param id
     * @throws BaseException
     */
    public void delete(Long id) throws BaseException;

    /**
     * This will return the Complete data from the table with Pagination .If you do not want Pagination we can pass the {@link Pageable#unpaged()} object to this method.
     * If this request object is having {@link Pageable#unpaged()} then this will return the complete data from the table.
     *
     *  * <pre>
     * <i>How to Use :</i>
     *

     * Page<RES> response = service.findAll(Pageable.unpaged());
     * </pre>
     *
     * @param pageable
     * @return
     * @throws BaseException
     */
    public Page<RES> findAll(Pageable pageable) throws BaseException;

    /**
     * This will return the Complete data from the table with Pagination .If you do not want Pagination we can pass the {@link Pageable#unpaged()} object to this method.
     * If this request object is having {@link Pageable#unpaged()} then this will return the complete data from the table.
     * Here Addition to the above method you can pass the Condition to the method with example object.
     * <pre>
     * <i>How to Use :</i>
     *
     * ENTITY entity = new ENTITY();
     * entity.set..(XXX);
     * Page<RES> response = service.findAll(Pageable.unpaged(),Example.of(entity));
     * </pre>
     *
     * @param pageable
     * @param example
     * @return
     * @throws BaseException
     */
    public Page<RES> findAll(Pageable pageable, Example<ENTITY> example) throws BaseException;

}
