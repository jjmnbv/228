package com.ljbd.tour.maldives.dao.impl;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.tour.maldives.model.Example;
import com.ljbd.tour.maldives.dao.ExampleDao;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.query.ExampleQuery;

@Repository
public class ExampleDaoImpl extends BaseIbatis3Dao<Example,java.lang.Integer> implements ExampleDao{

  @Override
  public String getIbatisMapperNamesapce() {
     return "Example";
  }

  public int saveOrUpdate(Example entity) {
     int count = 0 ;

    if(entity.getId() == null) {
       count = save(entity);
    }
    else {
       count = update(entity);
    }
       return count ;
  }

  public Page findPage(ExampleQuery query) {
      return pageQuery("Example.findPage",query);
  }



	
}
