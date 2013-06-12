package com.ljbd.ocrs.rentalcar.manager.example;

import cn.org.rapid_framework.page.Page;
import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.common.support.manager.BaseManager;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public interface ExampleManager extends BaseManager<Example, Integer> {

	public Page findPage(ExampleQuery query);
}