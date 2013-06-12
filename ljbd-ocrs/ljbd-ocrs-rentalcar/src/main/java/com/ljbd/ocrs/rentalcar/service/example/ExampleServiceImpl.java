package com.ljbd.ocrs.rentalcar.service.example;

import cn.org.rapid_framework.page.Page;
import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;
import com.ljbd.ocrs.rentalcar.facade.example.ExampleFacade;
import com.ljbd.ocrs.rentalcar.manager.example.ExampleManager;
import com.ljbd.common.support.manager.BaseManager;
import com.ljbd.common.support.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: wangjiaqi
 * Date: 2013-1-16
 * Time: 18:33:32
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ExampleServiceImpl extends BaseServiceImpl<Example, Integer> implements ExampleFacade {
    @Resource
	private ExampleManager exampleManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setExampleManager(ExampleManager eManager) {
		this.exampleManager = eManager;
	}

	public Page findPage(ExampleQuery query) {
		return exampleManager.findPage(query);
	}

    @Override
    protected BaseManager getBaseManager() {
       	return this.exampleManager;
    }
}


