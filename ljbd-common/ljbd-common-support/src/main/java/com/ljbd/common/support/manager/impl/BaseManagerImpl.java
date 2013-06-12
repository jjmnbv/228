package com.ljbd.common.support.manager.impl;

import com.ljbd.common.support.dao.EntityDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author badqiu
 */
@Transactional
public abstract class BaseManagerImpl<E,PK extends Serializable> {
	protected Log log = LogFactory.getLog(getClass());

	protected abstract EntityDao getEntityDao();


    @Transactional(readOnly=true)
	public E getById(PK id) throws DataAccessException {
		return (E)getEntityDao().getById(id);
	}


    @Transactional(readOnly=true)
	public List<E> findAll() throws DataAccessException {
		return getEntityDao().findAll();
	}

	/** 根据id检查是否插入或是更新数据 */

    public int saveOrUpdate(E entity) throws DataAccessException {

		return getEntityDao().saveOrUpdate(entity);
	}

	/** 插入数据 */

    public int save(E entity) throws DataAccessException {
		return getEntityDao().save(entity);
	}


    public int removeById(PK id) throws DataAccessException {
		return getEntityDao().deleteById(id);
	}


    public int update(E entity) throws DataAccessException {
		return getEntityDao().update(entity);
	}


    @Transactional(readOnly=true)
	public boolean isUnique(E entity, String uniquePropertyNames) throws DataAccessException {
		return getEntityDao().isUnique(entity, uniquePropertyNames);
	}

}