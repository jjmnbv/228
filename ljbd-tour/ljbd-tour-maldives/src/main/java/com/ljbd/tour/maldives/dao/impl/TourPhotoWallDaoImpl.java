package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.TourPhotoWall;
import com.ljbd.tour.maldives.dao.TourPhotoWallDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.TourPhotoWallQuery;

@Repository
public class TourPhotoWallDaoImpl extends BaseIbatis3Dao<TourPhotoWall,java.lang.Integer> implements TourPhotoWallDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "TourPhotoWall";
  }

  public int saveOrUpdate(TourPhotoWall entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(TourPhotoWallQuery query) {
      return pageQuery("TourPhotoWall.findPage",query);
  }



	
}
