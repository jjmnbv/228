package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourHotelService;
import com.ljbd.tour.maldives.manager.TourHotelManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourHotelServiceImpl implements TourHotelService{
    @Resource
	private TourHotelManager tourHotelManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourHotelManager(TourHotelManager manager) {
		this.tourHotelManager = manager;
	}

}
