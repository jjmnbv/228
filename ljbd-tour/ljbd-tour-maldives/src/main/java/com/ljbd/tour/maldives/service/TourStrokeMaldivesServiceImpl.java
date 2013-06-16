package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourStrokeMaldivesService;
import com.ljbd.tour.maldives.manager.TourStrokeMaldivesManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourStrokeMaldivesServiceImpl implements TourStrokeMaldivesService{
    @Resource
	private TourStrokeMaldivesManager tourStrokeMaldivesManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourStrokeMaldivesManager(TourStrokeMaldivesManager manager) {
		this.tourStrokeMaldivesManager = manager;
	}

}
