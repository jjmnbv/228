package com.ljbd.ocrs.rentalcar.dao.example;


import cn.org.rapid_framework.page.*;

import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;
import com.ljbd.common.support.dao.BaseIbatis3Dao;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ExampleDaoImpl extends BaseIbatis3Dao<Example, Integer> implements ExampleDao {

    @Override
    public String getIbatisMapperNamesapce() {
        return "Example";
    }

    public int saveOrUpdate(Example entity) {
        int count = 0;
        if (entity.getId() == null) {
            count = save(entity);
        } else {

            count = update(entity);
        }
        return count;
    }

    @Override
    public List<Example> findAll() throws DataAccessException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Page findPage(ExampleQuery query) {
        return pageQuery("Example.findPage", query);
    }


}