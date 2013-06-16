package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourScenicManager;
import com.ljbd.tour.maldives.model.TourScenic;
import com.ljbd.tour.maldives.dao.TourScenicDao;
import com.ljbd.tour.maldives.model.query.TourScenicQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourScenicManagerImpl extends BaseManagerImpl<TourScenic,java.lang.Integer> implements TourScenicManager{
    @Resource
	private TourScenicDao tourScenicDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourScenicDao(TourScenicDao dao) {
		this.tourScenicDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourScenicDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourScenicQuery query) {
		return tourScenicDao.findPage(query);
	}
	

}
