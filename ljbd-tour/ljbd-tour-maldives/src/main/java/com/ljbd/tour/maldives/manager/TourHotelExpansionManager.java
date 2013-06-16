package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourHotelExpansion;
import com.ljbd.tour.maldives.model.query.TourHotelExpansionQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourHotelExpansionManager extends BaseManager<TourHotelExpansion,java.lang.Integer> {

  public Page findPage(TourHotelExpansionQuery query);
}
