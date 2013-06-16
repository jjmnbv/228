package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourExpansion;
import com.ljbd.tour.maldives.dao.TourExpansionDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourExpansionQuery;

@Repository
public class TourExpansionDaoImpl extends BaseIbatis3Dao<TourExpansion,java.lang.Integer> implements TourExpansionDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourExpansion";
  }

  public int saveOrUpdate(TourExpansion entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourExpansionQuery query) {
      return pageQuery("TourExpansion.findPage",query);
  }



	
}
