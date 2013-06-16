package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourScenicService;
import com.ljbd.tour.maldives.manager.TourScenicManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourScenicServiceImpl implements TourScenicService{
    @Resource
	private TourScenicManager tourScenicManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourScenicManager(TourScenicManager manager) {
		this.tourScenicManager = manager;
	}

}
