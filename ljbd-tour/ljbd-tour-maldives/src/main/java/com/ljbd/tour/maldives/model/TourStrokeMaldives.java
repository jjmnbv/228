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


public class TourStrokeMaldives extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourStrokeMaldives";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_TOUR_PRODUCT_ID = "产品编号";
	public static final String ALIAS_DEPARTURE = "出发地";
	public static final String ALIAS_DESTINATION = "目的地";
	public static final String ALIAS_TPN = "行程序号";
	public static final String ALIAS_DURATION = "滞留天数";
	public static final String ALIAS_TRAFFIC = "交通";
	public static final String ALIAS_TOUR_SCENIC_ID = "景点编号";
	public static final String ALIAS_SCENIC_NAME = "景点名称";
	public static final String ALIAS_TOUR_HOTEL_ID = "酒店编号";
	public static final String ALIAS_HOTEL_NAME = "酒店名称";
	public static final String ALIAS_ROOM = "房型名称";
	public static final String ALIAS_CAPACITY = "居住人数";
	public static final String ALIAS_BREAKFAST = "早餐";
	public static final String ALIAS_BED_TYPE = "床型";
	public static final String ALIAS_BROADBAND = "宽带";
	public static final String ALIAS_DINING = "用餐";
	public static final String ALIAS_RELATED_ATTRACTIONS = "相关景点";
	public static final String ALIAS_DESCRIPTION = "描述信息";
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
     * 产品编号       db_column: tour_product_id 
     */	
	
	private java.lang.Integer tourProductId;
    /**
     * 出发地       db_column: departure 
     */	
	@Length(max=0)
	private java.lang.String departure;
    /**
     * 目的地       db_column: destination 
     */	
	@Length(max=0)
	private java.lang.String destination;
    /**
     * 行程序号       db_column: tpn 
     */	
	
	private java.lang.Integer tpn;
    /**
     * 滞留天数       db_column: duration 
     */	
	
	private java.lang.Integer duration;
    /**
     * 交通       db_column: traffic 
     */	
	
	private java.lang.Integer traffic;
    /**
     * 景点编号       db_column: tour_scenic_id 
     */	
	
	private java.lang.Integer tourScenicId;
    /**
     * 景点名称       db_column: scenic_name 
     */	
	@Length(max=0)
	private java.lang.String scenicName;
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
     * 房型名称       db_column: room 
     */	
	@Length(max=0)
	private java.lang.String room;
    /**
     * 居住人数       db_column: capacity 
     */	
	@Max(127)
	private Integer capacity;
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
     * 宽带       db_column: broadband 
     */	
	@Max(127)
	private Integer broadband;
    /**
     * 用餐       db_column: dining 
     */	
	@Length(max=0)
	private java.lang.String dining;
    /**
     * 相关景点       db_column: related_attractions 
     */	
	@Length(max=0)
	private java.lang.String relatedAttractions;
    /**
     * 描述信息       db_column: description 
     */	
	@Length(max=0)
	private java.lang.String description;
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

	public TourStrokeMaldives(){
	}

	public TourStrokeMaldives(
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
	public void setDeparture(java.lang.String value) {
		this.departure = value;
	}
	
	public java.lang.String getDeparture() {
		return this.departure;
	}
	public void setDestination(java.lang.String value) {
		this.destination = value;
	}
	
	public java.lang.String getDestination() {
		return this.destination;
	}
	public void setTpn(java.lang.Integer value) {
		this.tpn = value;
	}
	
	public java.lang.Integer getTpn() {
		return this.tpn;
	}
	public void setDuration(java.lang.Integer value) {
		this.duration = value;
	}
	
	public java.lang.Integer getDuration() {
		return this.duration;
	}
	public void setTraffic(java.lang.Integer value) {
		this.traffic = value;
	}
	
	public java.lang.Integer getTraffic() {
		return this.traffic;
	}
	public void setTourScenicId(java.lang.Integer value) {
		this.tourScenicId = value;
	}
	
	public java.lang.Integer getTourScenicId() {
		return this.tourScenicId;
	}
	public void setScenicName(java.lang.String value) {
		this.scenicName = value;
	}
	
	public java.lang.String getScenicName() {
		return this.scenicName;
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
	public void setRoom(java.lang.String value) {
		this.room = value;
	}
	
	public java.lang.String getRoom() {
		return this.room;
	}
	public void setCapacity(Integer value) {
		this.capacity = value;
	}
	
	public Integer getCapacity() {
		return this.capacity;
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
	public void setBroadband(Integer value) {
		this.broadband = value;
	}
	
	public Integer getBroadband() {
		return this.broadband;
	}
	public void setDining(java.lang.String value) {
		this.dining = value;
	}
	
	public java.lang.String getDining() {
		return this.dining;
	}
	public void setRelatedAttractions(java.lang.String value) {
		this.relatedAttractions = value;
	}
	
	public java.lang.String getRelatedAttractions() {
		return this.relatedAttractions;
	}
	public void setDescription(java.lang.String value) {
		this.description = value;
	}
	
	public java.lang.String getDescription() {
		return this.description;
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
			.append("Departure",getDeparture())
			.append("Destination",getDestination())
			.append("Tpn",getTpn())
			.append("Duration",getDuration())
			.append("Traffic",getTraffic())
			.append("TourScenicId",getTourScenicId())
			.append("ScenicName",getScenicName())
			.append("TourHotelId",getTourHotelId())
			.append("HotelName",getHotelName())
			.append("Room",getRoom())
			.append("Capacity",getCapacity())
			.append("Breakfast",getBreakfast())
			.append("BedType",getBedType())
			.append("Broadband",getBroadband())
			.append("Dining",getDining())
			.append("RelatedAttractions",getRelatedAttractions())
			.append("Description",getDescription())
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
		if(obj instanceof TourStrokeMaldives == false) return false;
		if(this == obj) return true;
		TourStrokeMaldives other = (TourStrokeMaldives)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

