package com.ljbd.ocrs.rentalcar.manager.example.impl;

import cn.org.rapid_framework.page.Page;

import com.ljbd.ocrs.rentalcar.dao.example.ExampleDao;
import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;
import com.ljbd.ocrs.rentalcar.manager.example.ExampleManager;
import com.ljbd.common.support.dao.EntityDao;
import com.ljbd.common.support.manager.impl.BaseManagerImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class ExampleManagerImpl extends BaseManagerImpl<Example, Integer> implements ExampleManager {
    @Resource
	private ExampleDao exampleDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setExampleDao(ExampleDao dao) {
		this.exampleDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.exampleDao;
	}

	@Transactional(readOnly=true)
	public Page findPage(ExampleQuery query) {
		return exampleDao.findPage(query);
	}

}