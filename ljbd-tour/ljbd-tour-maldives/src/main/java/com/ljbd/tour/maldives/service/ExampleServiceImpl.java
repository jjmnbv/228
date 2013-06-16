package com.ljbd.tour.maldives.service;
import com.ljbd.tour.maldives.facade.ExampleService;
import com.ljbd.tour.maldives.manager.ExampleManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
public class ExampleServiceImpl implements ExampleService{
    @Resource
	private ExampleManager exampleManager;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setExampleManager(ExampleManager manager) {
		this.exampleManager = manager;
	}

}
