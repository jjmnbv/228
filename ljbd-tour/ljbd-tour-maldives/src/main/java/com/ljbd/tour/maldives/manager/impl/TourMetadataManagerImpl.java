package com.ljbd.tour.maldives.manager.impl;
import com.ljbd.common.support.BaseManagerImpl;
import com.ljbd.tour.maldives.manager.TourMetadataManager;
import com.ljbd.tour.maldives.model.TourMetadata;
import com.ljbd.tour.maldives.dao.TourMetadataDao;
import com.ljbd.tour.maldives.model.query.TourMetadataQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.ljbd.common.support.EntityDao;
import cn.org.rapid_framework.page.Page;
@Service
@Transactional
public class TourMetadataManagerImpl extends BaseManagerImpl<TourMetadata,java.lang.Integer> implements TourMetadataManager{
    @Resource
	private TourMetadataDao tourMetadataDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourMetadataDao(TourMetadataDao dao) {
		this.tourMetadataDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.tourMetadataDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(TourMetadataQuery query) {
		return tourMetadataDao.findPage(query);
	}
	

}
