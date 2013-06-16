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


public class TourExpansion extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourExpansion";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_TOUR_PRODUCT_ID = "产品编号";
	public static final String ALIAS_CATEGORY_I = "分类一级标识";
	public static final String ALIAS_CATEGORY_INAME = "一级标识名称";
	public static final String ALIAS_CATEGORY_II = "分类二级标识";
	public static final String ALIAS_CATEGORY_II_NAME = "二级标识名称";
	public static final String ALIAS_CATEGORY_III = "分类三级标识";
	public static final String ALIAS_CATEGORY_III_NAME = "三级标识名称";
	public static final String ALIAS_CATEGORY_ASSISTED = "协助三级分类标识";
	public static final String ALIAS_CATEGORY_CONTENT = "分类内容";
	public static final String ALIAS_SEQUENCE = "排序";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_EXTENSIBLE_MARKUP = "扩展标记";
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
     * 分类一级标识       db_column: category_i 
     */	
	
	private java.lang.Integer categoryI;
    /**
     * 一级标识名称       db_column: category_i_name 
     */	
	@Length(max=0)
	private java.lang.String categoryIname;
    /**
     * 分类二级标识       db_column: category_ii 
     */	
	
	private java.lang.Integer categoryIi;
    /**
     * 二级标识名称       db_column: category_ii_name 
     */	
	@Length(max=0)
	private java.lang.String categoryIiName;
    /**
     * 分类三级标识       db_column: category_iii 
     */	
	
	private java.lang.Integer categoryIii;
    /**
     * 三级标识名称       db_column: category_iii_name 
     */	
	@Length(max=0)
	private java.lang.String categoryIiiName;
    /**
     * 协助三级分类标识       db_column: category_assisted 
     */	
	
	private java.lang.Integer categoryAssisted;
    /**
     * 分类内容       db_column: category_content 
     */	
	@Length(max=0)
	private java.lang.String categoryContent;
    /**
     * 排序       db_column: sequence 
     */	
	
	private java.lang.Integer sequence;
    /**
     * 备注       db_column: remark 
     */	
	@Length(max=0)
	private java.lang.String remark;
    /**
     * 扩展标记       db_column: extensible_markup 
     */	
	@Max(127)
	private Integer extensibleMarkup;
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

	public TourExpansion(){
	}

	public TourExpansion(
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
	public void setCategoryI(java.lang.Integer value) {
		this.categoryI = value;
	}
	
	public java.lang.Integer getCategoryI() {
		return this.categoryI;
	}
	public void setCategoryIname(java.lang.String value) {
		this.categoryIname = value;
	}
	
	public java.lang.String getCategoryIname() {
		return this.categoryIname;
	}
	public void setCategoryIi(java.lang.Integer value) {
		this.categoryIi = value;
	}
	
	public java.lang.Integer getCategoryIi() {
		return this.categoryIi;
	}
	public void setCategoryIiName(java.lang.String value) {
		this.categoryIiName = value;
	}
	
	public java.lang.String getCategoryIiName() {
		return this.categoryIiName;
	}
	public void setCategoryIii(java.lang.Integer value) {
		this.categoryIii = value;
	}
	
	public java.lang.Integer getCategoryIii() {
		return this.categoryIii;
	}
	public void setCategoryIiiName(java.lang.String value) {
		this.categoryIiiName = value;
	}
	
	public java.lang.String getCategoryIiiName() {
		return this.categoryIiiName;
	}
	public void setCategoryAssisted(java.lang.Integer value) {
		this.categoryAssisted = value;
	}
	
	public java.lang.Integer getCategoryAssisted() {
		return this.categoryAssisted;
	}
	public void setCategoryContent(java.lang.String value) {
		this.categoryContent = value;
	}
	
	public java.lang.String getCategoryContent() {
		return this.categoryContent;
	}
	public void setSequence(java.lang.Integer value) {
		this.sequence = value;
	}
	
	public java.lang.Integer getSequence() {
		return this.sequence;
	}
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setExtensibleMarkup(Integer value) {
		this.extensibleMarkup = value;
	}
	
	public Integer getExtensibleMarkup() {
		return this.extensibleMarkup;
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
			.append("CategoryI",getCategoryI())
			.append("CategoryIname",getCategoryIname())
			.append("CategoryIi",getCategoryIi())
			.append("CategoryIiName",getCategoryIiName())
			.append("CategoryIii",getCategoryIii())
			.append("CategoryIiiName",getCategoryIiiName())
			.append("CategoryAssisted",getCategoryAssisted())
			.append("CategoryContent",getCategoryContent())
			.append("Sequence",getSequence())
			.append("Remark",getRemark())
			.append("ExtensibleMarkup",getExtensibleMarkup())
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
		if(obj instanceof TourExpansion == false) return false;
		if(this == obj) return true;
		TourExpansion other = (TourExpansion)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

