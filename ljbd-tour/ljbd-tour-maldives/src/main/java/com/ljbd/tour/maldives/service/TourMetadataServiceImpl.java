package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourMetadataService;
import com.ljbd.tour.maldives.manager.TourMetadataManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourMetadataServiceImpl implements TourMetadataService{
    @Resource
	private TourMetadataManager tourMetadataManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourMetadataManager(TourMetadataManager manager) {
		this.tourMetadataManager = manager;
	}

}
