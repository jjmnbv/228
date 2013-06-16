package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourProductService;
import com.ljbd.tour.maldives.manager.TourProductManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourProductServiceImpl implements TourProductService{
    @Resource
	private TourProductManager tourProductManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourProductManager(TourProductManager manager) {
		this.tourProductManager = manager;
	}

}
