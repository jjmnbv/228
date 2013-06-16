/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.ljbd.tour.maldives.model;
import com.ljbd.common.support.BaseEntity;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;



import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.ljbd.tour.maldives.model.*;
import com.ljbd.tour.maldives.dao.*;
import com.ljbd.tour.maldives.service.*;
import com.ljbd.tour.maldives.model.query.*;


public class TourDetailMaldives extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourDetailMaldives";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_TOUR_PRODUCT_ID = "产品编号";
	public static final String ALIAS_TRAFFIC = "交通";
	public static final String ALIAS_TRAFFIC_GRADE = "交通级别";
	public static final String ALIAS_DEPARTURE_TIME = "启程时间";
	public static final String ALIAS_DEPARTURE_ARRIVAL_TIME = "启程到站时间";
	public static final String ALIAS_DEPARTURE_START = "启程出发地";
	public static final String ALIAS_DEPARTURE_DESTINATION = "启程目的地";
	public static final String ALIAS_RETURN_TIME = "返程时间";
	public static final String ALIAS_RETURN_ARRIVAL_TIME = "返程到站时间";
	public static final String ALIAS_RETURN_START = "返程出发地";
	public static final String ALIAS_RETURN_DESTINATION = "返程目的地";
	public static final String ALIAS_CREATE_DATE = "创建时间";
	public static final String ALIAS_CREATE_NAME = "创建人";
	public static final String ALIAS_UPDATE_DATE = "更改时间";
	public static final String ALIAS_UPDATE_NAME = "更改人";
	public static final String ALIAS_SYS_VERSION = "版本号";
	public static final String ALIAS_YN = "删除标识";
	
	//date formats
	public static final String FORMAT_DEPARTURE_TIME = DATE_FORMAT;
	public static final String FORMAT_DEPARTURE_ARRIVAL_TIME = DATE_FORMAT;
	public static final String FORMAT_RETURN_TIME = DATE_FORMAT;
	public static final String FORMAT_RETURN_ARRIVAL_TIME = DATE_FORMAT;
	public static final String FORMAT_CREATE_DATE = DATE_FORMAT;
	public static final String FORMAT_UPDATE_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 编号       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 产品编号       db_column: tour_product_id 
     */	
	
	private java.lang.Integer tourProductId;
    /**
     * 交通       db_column: traffic 
     */	
	
	private java.lang.Integer traffic;
    /**
     * 交通级别       db_column: traffic_grade 
     */	
	
	private java.lang.Integer trafficGrade;
    /**
     * 启程时间       db_column: departure_time 
     */	
	
	private java.util.Date departureTime;
    /**
     * 启程到站时间       db_column: departure_arrival_time 
     */	
	
	private java.util.Date departureArrivalTime;
    /**
     * 启程出发地       db_column: departure_start 
     */	
	@Length(max=0)
	private java.lang.String departureStart;
    /**
     * 启程目的地       db_column: departure_destination 
     */	
	@Length(max=0)
	private java.lang.String departureDestination;
    /**
     * 返程时间       db_column: return_time 
     */	
	
	private java.util.Date returnTime;
    /**
     * 返程到站时间       db_column: return_arrival_time 
     */	
	
	private java.util.Date returnArrivalTime;
    /**
     * 返程出发地       db_column: return_start 
     */	
	@Length(max=0)
	private java.lang.String returnStart;
    /**
     * 返程目的地       db_column: return_destination 
     */	
	@Length(max=0)
	private java.lang.String returnDestination;
    /**
     * 创建时间       db_column: create_date 
     */	
	
	private java.util.Date createDate;
    /**
     * 创建人       db_column: create_name 
     */	
	@Length(max=0)
	private java.lang.String createName;
    /**
     * 更改时间       db_column: update_date 
     */	
	
	private java.util.Date updateDate;
    /**
     * 更改人       db_column: update_name 
     */	
	@Length(max=0)
	private java.lang.String updateName;
    /**
     * 版本号       db_column: sys_version 
     */	
	
	private java.lang.Integer sysVersion;
    /**
     * 删除标识       db_column: yn 
     */	
	@Max(127)
	private Integer yn;
	//columns END

	public TourDetailMaldives(){
	}

	public TourDetailMaldives(
		java.lang.Integer id
	){
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setTourProductId(java.lang.Integer value) {
		this.tourProductId = value;
	}
	
	public java.lang.Integer getTourProductId() {
		return this.tourProductId;
	}
	public void setTraffic(java.lang.Integer value) {
		this.traffic = value;
	}
	
	public java.lang.Integer getTraffic() {
		return this.traffic;
	}
	public void setTrafficGrade(java.lang.Integer value) {
		this.trafficGrade = value;
	}
	
	public java.lang.Integer getTrafficGrade() {
		return this.trafficGrade;
	}
	public String getDepartureTimeString() {
		return DateConvertUtils.format(getDepartureTime(), FORMAT_DEPARTURE_TIME);
	}
	public void setDepartureTimeString(String value) {
		setDepartureTime(DateConvertUtils.parse(value, FORMAT_DEPARTURE_TIME,java.util.Date.class));
	}
	
	public void setDepartureTime(java.util.Date value) {
		this.departureTime = value;
	}
	
	public java.util.Date getDepartureTime() {
		return this.departureTime;
	}
	public String getDepartureArrivalTimeString() {
		return DateConvertUtils.format(getDepartureArrivalTime(), FORMAT_DEPARTURE_ARRIVAL_TIME);
	}
	public void setDepartureArrivalTimeString(String value) {
		setDepartureArrivalTime(DateConvertUtils.parse(value, FORMAT_DEPARTURE_ARRIVAL_TIME,java.util.Date.class));
	}
	
	public void setDepartureArrivalTime(java.util.Date value) {
		this.departureArrivalTime = value;
	}
	
	public java.util.Date getDepartureArrivalTime() {
		return this.departureArrivalTime;
	}
	public void setDepartureStart(java.lang.String value) {
		this.departureStart = value;
	}
	
	public java.lang.String getDepartureStart() {
		return this.departureStart;
	}
	public void setDepartureDestination(java.lang.String value) {
		this.departureDestination = value;
	}
	
	public java.lang.String getDepartureDestination() {
		return this.departureDestination;
	}
	public String getReturnTimeString() {
		return DateConvertUtils.format(getReturnTime(), FORMAT_RETURN_TIME);
	}
	public void setReturnTimeString(String value) {
		setReturnTime(DateConvertUtils.parse(value, FORMAT_RETURN_TIME,java.util.Date.class));
	}
	
	public void setReturnTime(java.util.Date value) {
		this.returnTime = value;
	}
	
	public java.util.Date getReturnTime() {
		return this.returnTime;
	}
	public String getReturnArrivalTimeString() {
		return DateConvertUtils.format(getReturnArrivalTime(), FORMAT_RETURN_ARRIVAL_TIME);
	}
	public void setReturnArrivalTimeString(String value) {
		setReturnArrivalTime(DateConvertUtils.parse(value, FORMAT_RETURN_ARRIVAL_TIME,java.util.Date.class));
	}
	
	public void setReturnArrivalTime(java.util.Date value) {
		this.returnArrivalTime = value;
	}
	
	public java.util.Date getReturnArrivalTime() {
		return this.returnArrivalTime;
	}
	public void setReturnStart(java.lang.String value) {
		this.returnStart = value;
	}
	
	public java.lang.String getReturnStart() {
		return this.returnStart;
	}
	public void setReturnDestination(java.lang.String value) {
		this.returnDestination = value;
	}
	
	public java.lang.String getReturnDestination() {
		return this.returnDestination;
	}
	public String getCreateDateString() {
		return DateConvertUtils.format(getCreateDate(), FORMAT_CREATE_DATE);
	}
	public void setCreateDateString(String value) {
		setCreateDate(DateConvertUtils.parse(value, FORMAT_CREATE_DATE,java.util.Date.class));
	}
	
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateName(java.lang.String value) {
		this.createName = value;
	}
	
	public java.lang.String getCreateName() {
		return this.createName;
	}
	public String getUpdateDateString() {
		return DateConvertUtils.format(getUpdateDate(), FORMAT_UPDATE_DATE);
	}
	public void setUpdateDateString(String value) {
		setUpdateDate(DateConvertUtils.parse(value, FORMAT_UPDATE_DATE,java.util.Date.class));
	}
	
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateName(java.lang.String value) {
		this.updateName = value;
	}
	
	public java.lang.String getUpdateName() {
		return this.updateName;
	}
	public void setSysVersion(java.lang.Integer value) {
		this.sysVersion = value;
	}
	
	public java.lang.Integer getSysVersion() {
		return this.sysVersion;
	}
	public void setYn(Integer value) {
		this.yn = value;
	}
	
	public Integer getYn() {
		return this.yn;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("TourProductId",getTourProductId())
			.append("Traffic",getTraffic())
			.append("TrafficGrade",getTrafficGrade())
			.append("DepartureTime",getDepartureTime())
			.append("DepartureArrivalTime",getDepartureArrivalTime())
			.append("DepartureStart",getDepartureStart())
			.append("DepartureDestination",getDepartureDestination())
			.append("ReturnTime",getReturnTime())
			.append("ReturnArrivalTime",getReturnArrivalTime())
			.append("ReturnStart",getReturnStart())
			.append("ReturnDestination",getReturnDestination())
			.append("CreateDate",getCreateDate())
			.append("CreateName",getCreateName())
			.append("UpdateDate",getUpdateDate())
			.append("UpdateName",getUpdateName())
			.append("SysVersion",getSysVersion())
			.append("Yn",getYn())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TourDetailMaldives == false) return false;
		if(this == obj) return true;
		TourDetailMaldives other = (TourDetailMaldives)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

