package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourScenic;
import com.ljbd.tour.maldives.model.query.TourScenicQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourScenicManager extends BaseManager<TourScenic,java.lang.Integer> {

  public Page findPage(TourScenicQuery query);
}
