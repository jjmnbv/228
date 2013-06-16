package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourScenic;
import com.ljbd.tour.maldives.dao.TourScenicDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourScenicQuery;

@Repository
public class TourScenicDaoImpl extends BaseIbatis3Dao<TourScenic,java.lang.Integer> implements TourScenicDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourScenic";
  }

  public int saveOrUpdate(TourScenic entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourScenicQuery query) {
      return pageQuery("TourScenic.findPage",query);
  }



	
}
