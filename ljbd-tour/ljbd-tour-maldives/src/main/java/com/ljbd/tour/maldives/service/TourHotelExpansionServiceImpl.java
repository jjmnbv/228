package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourHotelExpansionService;
import com.ljbd.tour.maldives.manager.TourHotelExpansionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourHotelExpansionServiceImpl implements TourHotelExpansionService{
    @Resource
	private TourHotelExpansionManager tourHotelExpansionManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourHotelExpansionManager(TourHotelExpansionManager manager) {
		this.tourHotelExpansionManager = manager;
	}

}
