package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.TourPhotoWallService;
import com.ljbd.tour.maldives.manager.TourPhotoWallManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class TourPhotoWallServiceImpl implements TourPhotoWallService{
    @Resource
	private TourPhotoWallManager tourPhotoWallManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTourPhotoWallManager(TourPhotoWallManager manager) {
		this.tourPhotoWallManager = manager;
	}

}
