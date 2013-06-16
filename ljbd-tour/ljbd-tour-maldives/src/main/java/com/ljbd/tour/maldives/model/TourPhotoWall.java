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


public class TourPhotoWall extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourPhotoWall";
	public static final String ALIAS_ID = "号编";
	public static final String ALIAS_PHOTO_TITLE = "图片标题";
	public static final String ALIAS_PHOTO_CATEGORY = "图片分类";
	public static final String ALIAS_DESCRPTION = "图片描述";
	public static final String ALIAS_PHOTE_PATH = "图片路径";
	public static final String ALIAS_TOUR_PRODUCT_ID = "产品编号";
	public static final String ALIAS_EFFECTIVE = "发布标识";
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
     * 号编       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 图片标题       db_column: photo_title 
     */	
	@Length(max=0)
	private java.lang.String photoTitle;
    /**
     * 图片分类       db_column: photo_category 
     */	
	
	private java.lang.Integer photoCategory;
    /**
     * 图片描述       db_column: descrption 
     */	
	@Length(max=0)
	private java.lang.String descrption;
    /**
     * 图片路径       db_column: phote_path 
     */	
	@Length(max=0)
	private java.lang.String photePath;
    /**
     * 产品编号       db_column: tour_product_id 
     */	
	
	private java.lang.Integer tourProductId;
    /**
     * 发布标识       db_column: effective 
     */	
	@Max(127)
	private Integer effective;
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

	public TourPhotoWall(){
	}

	public TourPhotoWall(
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
	public void setPhotoTitle(java.lang.String value) {
		this.photoTitle = value;
	}
	
	public java.lang.String getPhotoTitle() {
		return this.photoTitle;
	}
	public void setPhotoCategory(java.lang.Integer value) {
		this.photoCategory = value;
	}
	
	public java.lang.Integer getPhotoCategory() {
		return this.photoCategory;
	}
	public void setDescrption(java.lang.String value) {
		this.descrption = value;
	}
	
	public java.lang.String getDescrption() {
		return this.descrption;
	}
	public void setPhotePath(java.lang.String value) {
		this.photePath = value;
	}
	
	public java.lang.String getPhotePath() {
		return this.photePath;
	}
	public void setTourProductId(java.lang.Integer value) {
		this.tourProductId = value;
	}
	
	public java.lang.Integer getTourProductId() {
		return this.tourProductId;
	}
	public void setEffective(Integer value) {
		this.effective = value;
	}
	
	public Integer getEffective() {
		return this.effective;
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
			.append("PhotoTitle",getPhotoTitle())
			.append("PhotoCategory",getPhotoCategory())
			.append("Descrption",getDescrption())
			.append("PhotePath",getPhotePath())
			.append("TourProductId",getTourProductId())
			.append("Effective",getEffective())
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
		if(obj instanceof TourPhotoWall == false) return false;
		if(this == obj) return true;
		TourPhotoWall other = (TourPhotoWall)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

