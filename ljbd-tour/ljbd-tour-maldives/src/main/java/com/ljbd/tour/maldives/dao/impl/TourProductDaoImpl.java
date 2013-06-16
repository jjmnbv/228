package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourProduct;
import com.ljbd.tour.maldives.dao.TourProductDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourProductQuery;

@Repository
public class TourProductDaoImpl extends BaseIbatis3Dao<TourProduct,java.lang.Integer> implements TourProductDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourProduct";
  }

  public int saveOrUpdate(TourProduct entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourProductQuery query) {
      return pageQuery("TourProduct.findPage",query);
  }



	
}
