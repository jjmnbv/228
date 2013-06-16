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


public class TourCompositionMaldives extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourCompositionMaldives";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_MODULE = "版面";
	public static final String ALIAS_FORUM = "板块";
	public static final String ALIAS_TOUR_PRODUCT_ID = "产品编号";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_SUBTITLE = "副标题";
	public static final String ALIAS_SUMMARY = "简介";
	public static final String ALIAS_MAIN_PUSH = "主推";
	public static final String ALIAS_PHOTO_PATH = "图片";
	public static final String ALIAS_SELLING_PRICE = "销售价格";
	public static final String ALIAS_SATISFACTION = "满意度";
	public static final String ALIAS_EVALUATE = "评价数";
	public static final String ALIAS_TOUR_HOTEL_ID = "酒店编号";
	public static final String ALIAS_HOTEL_NAME = "酒店名称";
	public static final String ALIAS_HOTEL_GRADE = "酒店等级";
	public static final String ALIAS_HOTEL_LOCATION = "酒店位置";
	public static final String ALIAS_CREATE_DATE = "创建时间";
	public static final String ALIAS_CREATE_NAME = "创建人";
	public static final String ALIAS_UPDATE_DATE = "更改时间";
	public static final String ALIAS_UPDATE_NAME = "更改人";
	public static final String ALIAS_SYS_VERSION = "版本号";
	public static final String ALIAS_YN = "删除标识";
	
	//date formats
	public static final String FORMAT_CREATE_DATE = DATE_FORMAT;
	public static final String FORMAT_UPDATE_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 编号       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 版面       db_column: module 
     */	
	
	private java.lang.Integer module;
    /**
     * 板块       db_column: forum 
     */	
	
	private java.lang.Integer forum;
    /**
     * 产品编号       db_column: tour_product_id 
     */	
	
	private java.lang.Integer tourProductId;
    /**
     * 标题       db_column: title 
     */	
	@Length(max=0)
	private java.lang.String title;
    /**
     * 副标题       db_column: subtitle 
     */	
	@Length(max=0)
	private java.lang.String subtitle;
    /**
     * 简介       db_column: summary 
     */	
	@Length(max=0)
	private java.lang.String summary;
    /**
     * 主推       db_column: main_push 
     */	
	@Max(127)
	private Integer mainPush;
    /**
     * 图片       db_column: photo_path 
     */	
	@Length(max=0)
	private java.lang.String photoPath;
    /**
     * 销售价格       db_column: selling_price 
     */	
	
	private java.lang.Long sellingPrice;
    /**
     * 满意度       db_column: satisfaction 
     */	
	
	private java.lang.Integer satisfaction;
    /**
     * 评价数       db_column: evaluate 
     */	
	
	private java.lang.Integer evaluate;
    /**
     * 酒店编号       db_column: tour_hotel_id 
     */	
	
	private java.lang.Integer tourHotelId;
    /**
     * 酒店名称       db_column: hotel_name 
     */	
	@Length(max=0)
	private java.lang.String hotelName;
    /**
     * 酒店等级       db_column: hotel_grade 
     */	
	
	private java.lang.Integer hotelGrade;
    /**
     * 酒店位置       db_column: hotel_location 
     */	
	@Length(max=0)
	private java.lang.String hotelLocation;
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

	public TourCompositionMaldives(){
	}

	public TourCompositionMaldives(
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
	public void setModule(java.lang.Integer value) {
		this.module = value;
	}
	
	public java.lang.Integer getModule() {
		return this.module;
	}
	public void setForum(java.lang.Integer value) {
		this.forum = value;
	}
	
	public java.lang.Integer getForum() {
		return this.forum;
	}
	public void setTourProductId(java.lang.Integer value) {
		this.tourProductId = value;
	}
	
	public java.lang.Integer getTourProductId() {
		return this.tourProductId;
	}
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setSubtitle(java.lang.String value) {
		this.subtitle = value;
	}
	
	public java.lang.String getSubtitle() {
		return this.subtitle;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	public void setMainPush(Integer value) {
		this.mainPush = value;
	}
	
	public Integer getMainPush() {
		return this.mainPush;
	}
	public void setPhotoPath(java.lang.String value) {
		this.photoPath = value;
	}
	
	public java.lang.String getPhotoPath() {
		return this.photoPath;
	}
	public void setSellingPrice(java.lang.Long value) {
		this.sellingPrice = value;
	}
	
	public java.lang.Long getSellingPrice() {
		return this.sellingPrice;
	}
	public void setSatisfaction(java.lang.Integer value) {
		this.satisfaction = value;
	}
	
	public java.lang.Integer getSatisfaction() {
		return this.satisfaction;
	}
	public void setEvaluate(java.lang.Integer value) {
		this.evaluate = value;
	}
	
	public java.lang.Integer getEvaluate() {
		return this.evaluate;
	}
	public void setTourHotelId(java.lang.Integer value) {
		this.tourHotelId = value;
	}
	
	public java.lang.Integer getTourHotelId() {
		return this.tourHotelId;
	}
	public void setHotelName(java.lang.String value) {
		this.hotelName = value;
	}
	
	public java.lang.String getHotelName() {
		return this.hotelName;
	}
	public void setHotelGrade(java.lang.Integer value) {
		this.hotelGrade = value;
	}
	
	public java.lang.Integer getHotelGrade() {
		return this.hotelGrade;
	}
	public void setHotelLocation(java.lang.String value) {
		this.hotelLocation = value;
	}
	
	public java.lang.String getHotelLocation() {
		return this.hotelLocation;
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
			.append("Module",getModule())
			.append("Forum",getForum())
			.append("TourProductId",getTourProductId())
			.append("Title",getTitle())
			.append("Subtitle",getSubtitle())
			.append("Summary",getSummary())
			.append("MainPush",getMainPush())
			.append("PhotoPath",getPhotoPath())
			.append("SellingPrice",getSellingPrice())
			.append("Satisfaction",getSatisfaction())
			.append("Evaluate",getEvaluate())
			.append("TourHotelId",getTourHotelId())
			.append("HotelName",getHotelName())
			.append("HotelGrade",getHotelGrade())
			.append("HotelLocation",getHotelLocation())
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
		if(obj instanceof TourCompositionMaldives == false) return false;
		if(this == obj) return true;
		TourCompositionMaldives other = (TourCompositionMaldives)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

