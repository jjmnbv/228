package com.ljbd.common.support.service;

import com.ljbd.common.support.facade.BaseService;
import com.ljbd.common.support.manager.BaseManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @param <E>
 * @param <PK>
 */
public abstract class BaseServiceImpl<E, PK extends Serializable> implements BaseService<E, PK> {
    protected Log log = LogFactory.getLog(getClass());

    protected abstract BaseManager getBaseManager();


    public E getById(PK id) {
        return (E) getBaseManager().getById(id);
    }


    public List<E> findAll() {
        return getBaseManager().findAll();
    }

    /**
     * 根据id检查是否插入或是更新数据
     */
    @Transactional
    public int saveOrUpdate(E entity) {
        return getBaseManager().saveOrUpdate(entity);
    }

    /**
     * 插入数据
     */
    @Transactional
    public int save(E entity) {
        return getBaseManager().save(entity);
    }

    @Transactional
    public int removeById(PK id) {
        return getBaseManager().removeById(id);
    }

    @Transactional
    public int update(E entity) {
        return getBaseManager().update(entity);
    }

    @Transactional
    public boolean isUnique(E entity, String uniquePropertyNames) {
        return getBaseManager().isUnique(entity, uniquePropertyNames);
    }

}