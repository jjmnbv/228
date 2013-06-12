package com.ljbd.ocrs.rentalcar.facade.example;

import cn.org.rapid_framework.page.Page;
import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;
import com.ljbd.common.support.facade.BaseService;

/**
 * Created by IntelliJ IDEA.
 * User: wangjiaqi
 * Date: 2013-1-16
 * Time: 18:22:21
 * To change this template use File | Settings | File Templates.
 */
public interface ExampleFacade extends BaseService<Example, Integer> {

	public Page findPage(ExampleQuery query);
}
