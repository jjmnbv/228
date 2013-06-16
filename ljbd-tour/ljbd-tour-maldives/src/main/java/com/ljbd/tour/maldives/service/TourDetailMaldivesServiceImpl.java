package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourDetailMaldivesService;
import com.ljbd.tour.maldives.manager.TourDetailMaldivesManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourDetailMaldivesServiceImpl implements TourDetailMaldivesService{
    @Resource
	private TourDetailMaldivesManager tourDetailMaldivesManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourDetailMaldivesManager(TourDetailMaldivesManager manager) {
		this.tourDetailMaldivesManager = manager;
	}

}
