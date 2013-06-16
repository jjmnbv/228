package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourExpansionService;
import com.ljbd.tour.maldives.manager.TourExpansionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourExpansionServiceImpl implements TourExpansionService{
    @Resource
	private TourExpansionManager tourExpansionManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourExpansionManager(TourExpansionManager manager) {
		this.tourExpansionManager = manager;
	}

}
