package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourProduct;
import com.ljbd.tour.maldives.model.query.TourProductQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourProductManager extends BaseManager<TourProduct,java.lang.Integer> {

  public Page findPage(TourProductQuery query);
}
