package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.ExampleManager;
import com.ljbd.tour.maldives.model.Example;
import com.ljbd.tour.maldives.dao.ExampleDao;
import com.ljbd.tour.maldives.model.query.ExampleQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class ExampleManagerImpl extends BaseManagerImpl<Example,java.lang.Integer> implements ExampleManager{
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
