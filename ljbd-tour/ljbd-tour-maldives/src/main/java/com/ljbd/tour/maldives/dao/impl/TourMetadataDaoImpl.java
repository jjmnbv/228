package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourMetadata;
import com.ljbd.tour.maldives.dao.TourMetadataDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourMetadataQuery;

@Repository
public class TourMetadataDaoImpl extends BaseIbatis3Dao<TourMetadata,java.lang.Integer> implements TourMetadataDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourMetadata";
  }

  public int saveOrUpdate(TourMetadata entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourMetadataQuery query) {
      return pageQuery("TourMetadata.findPage",query);
  }



	
}
