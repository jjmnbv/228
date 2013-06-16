package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourStrokeMaldives;
import com.ljbd.tour.maldives.dao.TourStrokeMaldivesDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourStrokeMaldivesQuery;

@Repository
public class TourStrokeMaldivesDaoImpl extends BaseIbatis3Dao<TourStrokeMaldives,java.lang.Integer> implements TourStrokeMaldivesDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourStrokeMaldives";
  }

  public int saveOrUpdate(TourStrokeMaldives entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourStrokeMaldivesQuery query) {
      return pageQuery("TourStrokeMaldives.findPage",query);
  }



	
}
