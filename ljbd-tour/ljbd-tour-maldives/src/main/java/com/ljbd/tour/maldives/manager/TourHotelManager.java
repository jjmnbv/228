package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourHotel;
import com.ljbd.tour.maldives.model.query.TourHotelQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourHotelManager extends BaseManager<TourHotel,java.lang.Integer> {

  public Page findPage(TourHotelQuery query);
}
