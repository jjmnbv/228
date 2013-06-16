package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourStrokeMaldivesManager;
import com.ljbd.tour.maldives.model.TourStrokeMaldives;
import com.ljbd.tour.maldives.dao.TourStrokeMaldivesDao;
import com.ljbd.tour.maldives.model.query.TourStrokeMaldivesQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourStrokeMaldivesManagerImpl extends BaseManagerImpl<TourStrokeMaldives,java.lang.Integer> implements TourStrokeMaldivesManager{
    @Resource
	private TourStrokeMaldivesDao tourStrokeMaldivesDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourStrokeMaldivesDao(TourStrokeMaldivesDao dao) {
		this.tourStrokeMaldivesDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourStrokeMaldivesDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourStrokeMaldivesQuery query) {
		return tourStrokeMaldivesDao.findPage(query);
	}
	

}
