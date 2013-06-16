package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourExpansionManager;
import com.ljbd.tour.maldives.model.TourExpansion;
import com.ljbd.tour.maldives.dao.TourExpansionDao;
import com.ljbd.tour.maldives.model.query.TourExpansionQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourExpansionManagerImpl extends BaseManagerImpl<TourExpansion,java.lang.Integer> implements TourExpansionManager{
    @Resource
	private TourExpansionDao tourExpansionDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourExpansionDao(TourExpansionDao dao) {
		this.tourExpansionDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourExpansionDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourExpansionQuery query) {
		return tourExpansionDao.findPage(query);
	}
	

}
