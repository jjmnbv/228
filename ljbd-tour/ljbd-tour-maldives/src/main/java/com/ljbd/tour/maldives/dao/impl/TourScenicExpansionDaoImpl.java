package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourScenicExpansion;
import com.ljbd.tour.maldives.dao.TourScenicExpansionDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourScenicExpansionQuery;

@Repository
public class TourScenicExpansionDaoImpl extends BaseIbatis3Dao<TourScenicExpansion,java.lang.Integer> implements TourScenicExpansionDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourScenicExpansion";
  }

  public int saveOrUpdate(TourScenicExpansion entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourScenicExpansionQuery query) {
      return pageQuery("TourScenicExpansion.findPage",query);
  }



	
}
