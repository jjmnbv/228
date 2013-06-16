package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourCompositionMaldivesManager;
import com.ljbd.tour.maldives.model.TourCompositionMaldives;
import com.ljbd.tour.maldives.dao.TourCompositionMaldivesDao;
import com.ljbd.tour.maldives.model.query.TourCompositionMaldivesQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourCompositionMaldivesManagerImpl extends BaseManagerImpl<TourCompositionMaldives,java.lang.Integer> implements TourCompositionMaldivesManager{
    @Resource
	private TourCompositionMaldivesDao tourCompositionMaldivesDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourCompositionMaldivesDao(TourCompositionMaldivesDao dao) {
		this.tourCompositionMaldivesDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourCompositionMaldivesDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourCompositionMaldivesQuery query) {
		return tourCompositionMaldivesDao.findPage(query);
	}
	

}
