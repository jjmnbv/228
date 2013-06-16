package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourMetadata;
import com.ljbd.tour.maldives.model.query.TourMetadataQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourMetadataManager extends BaseManager<TourMetadata,java.lang.Integer> {

  public Page findPage(TourMetadataQuery query);
}
