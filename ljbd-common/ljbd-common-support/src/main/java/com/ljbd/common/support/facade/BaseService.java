package com.ljbd.common.support.facade;

import java.io.Serializable;
import java.util.List;

/**
 * User: wangxiaodong
 * Date: 2012-5-25
 * Time: 11:52:48
 */
public interface BaseService<E, PK extends Serializable> {

    E getById(PK id) ;

    List<E> findAll() ;

    int saveOrUpdate(E entity) ;

    int save(E entity) ;

    int removeById(PK id) ;

    int update(E entity) ;

    boolean isUnique(E entity, String uniquePropertyNames);
}