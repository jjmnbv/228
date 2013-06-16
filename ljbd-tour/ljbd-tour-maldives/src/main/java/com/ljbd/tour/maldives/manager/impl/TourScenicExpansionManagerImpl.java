package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourScenicExpansionManager;
import com.ljbd.tour.maldives.model.TourScenicExpansion;
import com.ljbd.tour.maldives.dao.TourScenicExpansionDao;
import com.ljbd.tour.maldives.model.query.TourScenicExpansionQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourScenicExpansionManagerImpl extends BaseManagerImpl<TourScenicExpansion,java.lang.Integer> implements TourScenicExpansionManager{
    @Resource
	private TourScenicExpansionDao tourScenicExpansionDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourScenicExpansionDao(TourScenicExpansionDao dao) {
		this.tourScenicExpansionDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourScenicExpansionDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourScenicExpansionQuery query) {
		return tourScenicExpansionDao.findPage(query);
	}
	

}
