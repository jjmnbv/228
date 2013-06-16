package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourStrokeMaldives;
import com.ljbd.tour.maldives.model.query.TourStrokeMaldivesQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourStrokeMaldivesManager extends BaseManager<TourStrokeMaldives,java.lang.Integer> {

  public Page findPage(TourStrokeMaldivesQuery query);
}
