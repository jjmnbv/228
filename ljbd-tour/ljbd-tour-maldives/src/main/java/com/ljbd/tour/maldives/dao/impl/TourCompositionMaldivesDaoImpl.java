package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourCompositionMaldives;
import com.ljbd.tour.maldives.dao.TourCompositionMaldivesDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourCompositionMaldivesQuery;

@Repository
public class TourCompositionMaldivesDaoImpl extends BaseIbatis3Dao<TourCompositionMaldives,java.lang.Integer> implements TourCompositionMaldivesDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourCompositionMaldives";
  }

  public int saveOrUpdate(TourCompositionMaldives entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourCompositionMaldivesQuery query) {
      return pageQuery("TourCompositionMaldives.findPage",query);
  }



	
}
