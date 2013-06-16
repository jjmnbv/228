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


public class TourHotel extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourHotel";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_HOTEL_NAME = "酒店名称";
	public static final String ALIAS_HOTEL_GRADE = "酒店星级";
	public static final String ALIAS_ROOM = "房型";
	public static final String ALIAS_BREAKFAST = "早餐";
	public static final String ALIAS_BED_TYPE = "床型";
	public static final String ALIAS_BED_TYPE_DESC = "床型描述";
	public static final String ALIAS_BROADBAND = "宽带";
	public static final String ALIAS_EXTRA_BED = "是否可加床";
	public static final String ALIAS_OPENED_DATE = "开业时间";
	public static final String ALIAS_DECORATE_DATE = "装饰时间";
	public static final String ALIAS_ROOMS_NUMBER = "房间数";
	public static final String ALIAS_HOTEL_PHONE = "酒店电话";
	public static final String ALIAS_HOTEL_WEBSITE = "酒店网址";
	public static final String ALIAS_CREATE_DATE = "创建时间";
	public static final String ALIAS_CREATE_NAME = "创建人";
	public static final String ALIAS_UPDATE_DATE = "更改时间";
	public static final String ALIAS_UPDATE_NAME = "更改人";
	public static final String ALIAS_SYS_VERSION = "版本号";
	public static final String ALIAS_YN = "删除标识";
	
	//date formats
	public static final String FORMAT_OPENED_DATE = DATE_FORMAT;
	public static final String FORMAT_DECORATE_DATE = DATE_FORMAT;
	public static final String FORMAT_CREATE_DATE = DATE_FORMAT;
	public static final String FORMAT_UPDATE_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 编号       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 酒店名称       db_column: hotel_name 
     */	
	@Length(max=0)
	private java.lang.String hotelName;
    /**
     * 酒店星级       db_column: hotel_grade 
     */	
	
	private java.lang.Integer hotelGrade;
    /**
     * 房型       db_column: room 
     */	
	@Length(max=0)
	private java.lang.String room;
    /**
     * 早餐       db_column: breakfast 
     */	
	@Max(127)
	private Integer breakfast;
    /**
     * 床型       db_column: bed_type 
     */	
	@Max(127)
	private Integer bedType;
    /**
     * 床型描述       db_column: bed_type_desc 
     */	
	@Length(max=0)
	private java.lang.String bedTypeDesc;
    /**
     * 宽带       db_column: broadband 
     */	
	@Max(127)
	private Integer broadband;
    /**
     * 是否可加床       db_column: extra_bed 
     */	
	@Max(127)
	private Integer extraBed;
    /**
     * 开业时间       db_column: opened_date 
     */	
	
	private java.util.Date openedDate;
    /**
     * 装饰时间       db_column: decorate_date 
     */	
	
	private java.util.Date decorateDate;
    /**
     * 房间数       db_column: rooms_number 
     */	
	
	private java.lang.Integer roomsNumber;
    /**
     * 酒店电话       db_column: hotel_phone 
     */	
	@Length(max=0)
	private java.lang.String hotelPhone;
    /**
     * 酒店网址       db_column: hotel_website 
     */	
	@Length(max=0)
	private java.lang.String hotelWebsite;
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

	public TourHotel(){
	}

	public TourHotel(
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
	public void setRoom(java.lang.String value) {
		this.room = value;
	}
	
	public java.lang.String getRoom() {
		return this.room;
	}
	public void setBreakfast(Integer value) {
		this.breakfast = value;
	}
	
	public Integer getBreakfast() {
		return this.breakfast;
	}
	public void setBedType(Integer value) {
		this.bedType = value;
	}
	
	public Integer getBedType() {
		return this.bedType;
	}
	public void setBedTypeDesc(java.lang.String value) {
		this.bedTypeDesc = value;
	}
	
	public java.lang.String getBedTypeDesc() {
		return this.bedTypeDesc;
	}
	public void setBroadband(Integer value) {
		this.broadband = value;
	}
	
	public Integer getBroadband() {
		return this.broadband;
	}
	public void setExtraBed(Integer value) {
		this.extraBed = value;
	}
	
	public Integer getExtraBed() {
		return this.extraBed;
	}
	public String getOpenedDateString() {
		return DateConvertUtils.format(getOpenedDate(), FORMAT_OPENED_DATE);
	}
	public void setOpenedDateString(String value) {
		setOpenedDate(DateConvertUtils.parse(value, FORMAT_OPENED_DATE,java.util.Date.class));
	}
	
	public void setOpenedDate(java.util.Date value) {
		this.openedDate = value;
	}
	
	public java.util.Date getOpenedDate() {
		return this.openedDate;
	}
	public String getDecorateDateString() {
		return DateConvertUtils.format(getDecorateDate(), FORMAT_DECORATE_DATE);
	}
	public void setDecorateDateString(String value) {
		setDecorateDate(DateConvertUtils.parse(value, FORMAT_DECORATE_DATE,java.util.Date.class));
	}
	
	public void setDecorateDate(java.util.Date value) {
		this.decorateDate = value;
	}
	
	public java.util.Date getDecorateDate() {
		return this.decorateDate;
	}
	public void setRoomsNumber(java.lang.Integer value) {
		this.roomsNumber = value;
	}
	
	public java.lang.Integer getRoomsNumber() {
		return this.roomsNumber;
	}
	public void setHotelPhone(java.lang.String value) {
		this.hotelPhone = value;
	}
	
	public java.lang.String getHotelPhone() {
		return this.hotelPhone;
	}
	public void setHotelWebsite(java.lang.String value) {
		this.hotelWebsite = value;
	}
	
	public java.lang.String getHotelWebsite() {
		return this.hotelWebsite;
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
			.append("HotelName",getHotelName())
			.append("HotelGrade",getHotelGrade())
			.append("Room",getRoom())
			.append("Breakfast",getBreakfast())
			.append("BedType",getBedType())
			.append("BedTypeDesc",getBedTypeDesc())
			.append("Broadband",getBroadband())
			.append("ExtraBed",getExtraBed())
			.append("OpenedDate",getOpenedDate())
			.append("DecorateDate",getDecorateDate())
			.append("RoomsNumber",getRoomsNumber())
			.append("HotelPhone",getHotelPhone())
			.append("HotelWebsite",getHotelWebsite())
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
		if(obj instanceof TourHotel == false) return false;
		if(this == obj) return true;
		TourHotel other = (TourHotel)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

