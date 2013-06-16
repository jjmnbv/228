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


public class TourMetadata extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourMetadata";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_METADATA_GROUP = "分组";
	public static final String ALIAS_METADATA_KEY_I = "分类1";
	public static final String ALIAS_METADATA_KEY_II = "分类2";
	public static final String ALIAS_METADATA_KEY_III = "分类3";
	public static final String ALIAS_METADATA_KEY_IV = "分类4";
	public static final String ALIAS_METADATA_VALUE = "对应值";
	public static final String ALIAS_METADATA_VALUE_NAME = "名称";
	public static final String ALIAS_METADATA_REMARK = "备注描述";
	public static final String ALIAS_CREATE_DATE = "创建时间";
	public static final String ALIAS_CREATE_NAME = "创建人";
	public static final String ALIAS_UPDATE_DATE = "更改时间";
	public static final String ALIAS_UPDATE_NAME = "更改人";
	public static final String ALIAS_SYS_VERSION = "版本";
	public static final String ALIAS_YN = "有效标识";
	
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
     * 分组       db_column: metadata_group 
     */	
	
	private java.lang.Integer metadataGroup;
    /**
     * 分类1       db_column: metadata_key_i 
     */	
	
	private java.lang.Integer metadataKeyI;
    /**
     * 分类2       db_column: metadata_key_ii 
     */	
	
	private java.lang.Integer metadataKeyIi;
    /**
     * 分类3       db_column: metadata_key_iii 
     */	
	@Length(max=0)
	private java.lang.String metadataKeyIii;
    /**
     * 分类4       db_column: metadata_key_iv 
     */	
	@Length(max=0)
	private java.lang.String metadataKeyIv;
    /**
     * 对应值       db_column: metadata_value 
     */	
	@Length(max=0)
	private java.lang.String metadataValue;
    /**
     * 名称       db_column: metadata_value_name 
     */	
	@Length(max=0)
	private java.lang.String metadataValueName;
    /**
     * 备注描述       db_column: metadata_remark 
     */	
	@Length(max=0)
	private java.lang.String metadataRemark;
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
     * 版本       db_column: sys_version 
     */	
	
	private java.lang.Integer sysVersion;
    /**
     * 有效标识       db_column: yn 
     */	
	@Max(127)
	private Integer yn;
	//columns END

	public TourMetadata(){
	}

	public TourMetadata(
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
	public void setMetadataGroup(java.lang.Integer value) {
		this.metadataGroup = value;
	}
	
	public java.lang.Integer getMetadataGroup() {
		return this.metadataGroup;
	}
	public void setMetadataKeyI(java.lang.Integer value) {
		this.metadataKeyI = value;
	}
	
	public java.lang.Integer getMetadataKeyI() {
		return this.metadataKeyI;
	}
	public void setMetadataKeyIi(java.lang.Integer value) {
		this.metadataKeyIi = value;
	}
	
	public java.lang.Integer getMetadataKeyIi() {
		return this.metadataKeyIi;
	}
	public void setMetadataKeyIii(java.lang.String value) {
		this.metadataKeyIii = value;
	}
	
	public java.lang.String getMetadataKeyIii() {
		return this.metadataKeyIii;
	}
	public void setMetadataKeyIv(java.lang.String value) {
		this.metadataKeyIv = value;
	}
	
	public java.lang.String getMetadataKeyIv() {
		return this.metadataKeyIv;
	}
	public void setMetadataValue(java.lang.String value) {
		this.metadataValue = value;
	}
	
	public java.lang.String getMetadataValue() {
		return this.metadataValue;
	}
	public void setMetadataValueName(java.lang.String value) {
		this.metadataValueName = value;
	}
	
	public java.lang.String getMetadataValueName() {
		return this.metadataValueName;
	}
	public void setMetadataRemark(java.lang.String value) {
		this.metadataRemark = value;
	}
	
	public java.lang.String getMetadataRemark() {
		return this.metadataRemark;
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
			.append("MetadataGroup",getMetadataGroup())
			.append("MetadataKeyI",getMetadataKeyI())
			.append("MetadataKeyIi",getMetadataKeyIi())
			.append("MetadataKeyIii",getMetadataKeyIii())
			.append("MetadataKeyIv",getMetadataKeyIv())
			.append("MetadataValue",getMetadataValue())
			.append("MetadataValueName",getMetadataValueName())
			.append("MetadataRemark",getMetadataRemark())
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
		if(obj instanceof TourMetadata == false) return false;
		if(this == obj) return true;
		TourMetadata other = (TourMetadata)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

