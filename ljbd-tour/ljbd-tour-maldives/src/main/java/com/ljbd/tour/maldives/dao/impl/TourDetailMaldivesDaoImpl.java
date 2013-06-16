package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourDetailMaldives;
import com.ljbd.tour.maldives.dao.TourDetailMaldivesDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourDetailMaldivesQuery;

@Repository
public class TourDetailMaldivesDaoImpl extends BaseIbatis3Dao<TourDetailMaldives,java.lang.Integer> implements TourDetailMaldivesDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourDetailMaldives";
  }

  public int saveOrUpdate(TourDetailMaldives entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourDetailMaldivesQuery query) {
      return pageQuery("TourDetailMaldives.findPage",query);
  }



	
}
