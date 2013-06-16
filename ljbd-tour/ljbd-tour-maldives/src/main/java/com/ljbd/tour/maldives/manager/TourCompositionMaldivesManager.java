package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourCompositionMaldives;
import com.ljbd.tour.maldives.model.query.TourCompositionMaldivesQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourCompositionMaldivesManager extends BaseManager<TourCompositionMaldives,java.lang.Integer> {

  public Page findPage(TourCompositionMaldivesQuery query);
}
