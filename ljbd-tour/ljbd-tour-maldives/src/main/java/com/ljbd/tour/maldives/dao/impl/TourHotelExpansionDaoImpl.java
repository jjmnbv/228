package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourHotelExpansion;
import com.ljbd.tour.maldives.dao.TourHotelExpansionDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourHotelExpansionQuery;

@Repository
public class TourHotelExpansionDaoImpl extends BaseIbatis3Dao<TourHotelExpansion,java.lang.Integer> implements TourHotelExpansionDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourHotelExpansion";
  }

  public int saveOrUpdate(TourHotelExpansion entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourHotelExpansionQuery query) {
      return pageQuery("TourHotelExpansion.findPage",query);
  }



	
}
