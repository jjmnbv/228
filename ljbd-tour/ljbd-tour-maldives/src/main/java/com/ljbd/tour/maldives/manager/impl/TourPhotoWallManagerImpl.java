package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourPhotoWallManager;
import com.ljbd.tour.maldives.model.TourPhotoWall;
import com.ljbd.tour.maldives.dao.TourPhotoWallDao;
import com.ljbd.tour.maldives.model.query.TourPhotoWallQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourPhotoWallManagerImpl extends BaseManagerImpl<TourPhotoWall,java.lang.Integer> implements TourPhotoWallManager{
    @Resource
	private TourPhotoWallDao tourPhotoWallDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourPhotoWallDao(TourPhotoWallDao dao) {
		this.tourPhotoWallDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourPhotoWallDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourPhotoWallQuery query) {
		return tourPhotoWallDao.findPage(query);
	}
	

}
