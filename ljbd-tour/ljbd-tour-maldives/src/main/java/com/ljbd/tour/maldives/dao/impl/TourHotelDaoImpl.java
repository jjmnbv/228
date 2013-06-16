package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourHotel;
import com.ljbd.tour.maldives.dao.TourHotelDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourHotelQuery;

@Repository
public class TourHotelDaoImpl extends BaseIbatis3Dao<TourHotel,java.lang.Integer> implements TourHotelDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourHotel";
  }

  public int saveOrUpdate(TourHotel entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourHotelQuery query) {
      return pageQuery("TourHotel.findPage",query);
  }



	
}
