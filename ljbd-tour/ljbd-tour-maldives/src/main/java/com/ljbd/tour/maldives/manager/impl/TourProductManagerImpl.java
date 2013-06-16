package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourProductManager;
import com.ljbd.tour.maldives.model.TourProduct;
import com.ljbd.tour.maldives.dao.TourProductDao;
import com.ljbd.tour.maldives.model.query.TourProductQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourProductManagerImpl extends BaseManagerImpl<TourProduct,java.lang.Integer> implements TourProductManager{
    @Resource
	private TourProductDao tourProductDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourProductDao(TourProductDao dao) {
		this.tourProductDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourProductDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourProductQuery query) {
		return tourProductDao.findPage(query);
	}
	

}
