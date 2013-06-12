package com.ljbd.ocrs.rentalcar.dao.example;

import cn.org.rapid_framework.page.Page;
import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;
import com.ljbd.common.support.dao.EntityDao;


/**
 * User: wxd
 * Date: 2012-2-29
 * Time: 14:47:24
 */
public interface ExampleDao extends EntityDao<Example, Integer> {
    Page findPage(ExampleQuery query);
}