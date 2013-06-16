package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourDetailMaldives;
import com.ljbd.tour.maldives.model.query.TourDetailMaldivesQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourDetailMaldivesManager extends BaseManager<TourDetailMaldives,java.lang.Integer> {

  public Page findPage(TourDetailMaldivesQuery query);
}
