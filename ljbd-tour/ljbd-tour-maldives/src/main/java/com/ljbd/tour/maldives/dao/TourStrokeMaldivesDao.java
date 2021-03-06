/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.ljbd.tour.maldives.dao;

import java.util.*;



import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.ljbd.tour.maldives.model.*;
import com.ljbd.tour.maldives.dao.*;
import com.ljbd.tour.maldives.service.*;
import com.ljbd.tour.maldives.model.query.*;


import org.springframework.stereotype.Repository;
import com.ljbd.common.support.BaseIbatis3Dao;
import com.ljbd.common.support.EntityDao;
import org.springframework.stereotype.Service;

@Repository
public interface TourStrokeMaldivesDao extends EntityDao<TourStrokeMaldives,java.lang.Integer>{


	public String getIbatisMapperNamesapce() ;

	public int saveOrUpdate(TourStrokeMaldives entity);

	public Page findPage(TourStrokeMaldivesQuery query);


}
