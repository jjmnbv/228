package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourPhotoWall;
import com.ljbd.tour.maldives.model.query.TourPhotoWallQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourPhotoWallManager extends BaseManager<TourPhotoWall,java.lang.Integer> {

  public Page findPage(TourPhotoWallQuery query);
}
