package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourHotelManager;
import com.ljbd.tour.maldives.model.TourHotel;
import com.ljbd.tour.maldives.dao.TourHotelDao;
import com.ljbd.tour.maldives.model.query.TourHotelQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourHotelManagerImpl extends BaseManagerImpl<TourHotel,java.lang.Integer> implements TourHotelManager{
    @Resource
	private TourHotelDao tourHotelDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourHotelDao(TourHotelDao dao) {
		this.tourHotelDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourHotelDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourHotelQuery query) {
		return tourHotelDao.findPage(query);
	}
	

}
