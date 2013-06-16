package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourDetailMaldivesManager;
import com.ljbd.tour.maldives.model.TourDetailMaldives;
import com.ljbd.tour.maldives.dao.TourDetailMaldivesDao;
import com.ljbd.tour.maldives.model.query.TourDetailMaldivesQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourDetailMaldivesManagerImpl extends BaseManagerImpl<TourDetailMaldives,java.lang.Integer> implements TourDetailMaldivesManager{
    @Resource
	private TourDetailMaldivesDao tourDetailMaldivesDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourDetailMaldivesDao(TourDetailMaldivesDao dao) {
		this.tourDetailMaldivesDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourDetailMaldivesDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourDetailMaldivesQuery query) {
		return tourDetailMaldivesDao.findPage(query);
	}
	

}
