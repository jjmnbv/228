package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.Example;
import com.ljbd.tour.maldives.model.query.ExampleQuery;
import org.springframework.stereotype.Service;

@Service
public interface ExampleManager extends BaseManager<Example,java.lang.Integer> {

  public Page findPage(ExampleQuery query);
}
