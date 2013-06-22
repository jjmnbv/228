package com.ljbd.common.support;

import org.springframework.dao.DataAccessException;

import java.io.Serializable;
import java.util.List;

/**
 * User: wxd
 * Date: 2012-2-29
 * Time: 17:09:44
 */
public interface BaseManager <E, PK extends Serializable> {

    E getById(PK id) throws DataAccessException;

    List<E> findAll() throws DataAccessException;

    int saveOrUpdate(E entity) throws DataAccessException;

    int save(E entity) throws DataAccessException;

    int removeById(PK id) throws DataAccessException;

    int update(E entity) throws DataAccessException;

    boolean isUnique(E entity, String uniquePropertyNames) throws DataAccessException;
}