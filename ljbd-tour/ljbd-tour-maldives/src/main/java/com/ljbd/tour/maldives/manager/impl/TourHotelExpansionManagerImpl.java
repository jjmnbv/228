package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourHotelExpansionManager;
import com.ljbd.tour.maldives.model.TourHotelExpansion;
import com.ljbd.tour.maldives.dao.TourHotelExpansionDao;
import com.ljbd.tour.maldives.model.query.TourHotelExpansionQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourHotelExpansionManagerImpl extends BaseManagerImpl<TourHotelExpansion,java.lang.Integer> implements TourHotelExpansionManager{
    @Resource
	private TourHotelExpansionDao tourHotelExpansionDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourHotelExpansionDao(TourHotelExpansionDao dao) {
		this.tourHotelExpansionDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourHotelExpansionDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourHotelExpansionQuery query) {
		return tourHotelExpansionDao.findPage(query);
	}
	

}
