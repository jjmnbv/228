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


public class TourProduct extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TourProduct";
	public static final String ALIAS_ID = "编号";
	public static final String ALIAS_STATUS = "状态";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_SUBTITLE = "副标题";
	public static final String ALIAS_SUMMARY = "简介";
	public static final String ALIAS_CATEGORY_I = "分类1栏目";
	public static final String ALIAS_CATEGORY_II = "分类2线路类别";
	public static final String ALIAS_CATEGORY_III = "分类3线路主题";
	public static final String ALIAS_CATEGORY_IV = "分类4";
	public static final String ALIAS_SUPPLIER = "供应商";
	public static final String ALIAS_PURCHASE_PRICE = "底价";
	public static final String ALIAS_SELLING_PRICE = "销售价";
	public static final String ALIAS_TRAVEL_DAYS = "行程天数";
	public static final String ALIAS_TRAFFIC = "交通";
	public static final String ALIAS_SATISFACTION = "满意度";
	public static final String ALIAS_EVALUATE = "评价数";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_MAIN_PUSH = "是否主推";
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
     * 状态       db_column: status 
     */	
	@Max(127)
	private Integer status;
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
     * 分类1栏目       db_column: category_i 
     */	
	
	private java.lang.Integer categoryI;
    /**
     * 分类2线路类别       db_column: category_ii 
     */	
	
	private java.lang.Integer categoryIi;
    /**
     * 分类3线路主题       db_column: category_iii 
     */	
	
	private java.lang.Integer categoryIii;
    /**
     * 分类4       db_column: category_iv 
     */	
	
	private java.lang.Integer categoryIv;
    /**
     * 供应商       db_column: supplier 
     */	
	@Length(max=0)
	private java.lang.String supplier;
    /**
     * 底价       db_column: purchase_price 
     */	
	
	private java.lang.Long purchasePrice;
    /**
     * 销售价       db_column: selling_price 
     */	
	
	private java.lang.Long sellingPrice;
    /**
     * 行程天数       db_column: travel_days 
     */	
	
	private java.lang.Integer travelDays;
    /**
     * 交通       db_column: traffic 
     */	
	
	private java.lang.Integer traffic;
    /**
     * 满意度       db_column: satisfaction 
     */	
	
	private java.lang.Integer satisfaction;
    /**
     * 评价数       db_column: evaluate 
     */	
	
	private java.lang.Integer evaluate;
    /**
     * 备注       db_column: remark 
     */	
	@Length(max=0)
	private java.lang.String remark;
    /**
     * 是否主推       db_column: main_push 
     */	
	@Max(127)
	private Integer mainPush;
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

	public TourProduct(){
	}

	public TourProduct(
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
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
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
	public void setCategoryI(java.lang.Integer value) {
		this.categoryI = value;
	}
	
	public java.lang.Integer getCategoryI() {
		return this.categoryI;
	}
	public void setCategoryIi(java.lang.Integer value) {
		this.categoryIi = value;
	}
	
	public java.lang.Integer getCategoryIi() {
		return this.categoryIi;
	}
	public void setCategoryIii(java.lang.Integer value) {
		this.categoryIii = value;
	}
	
	public java.lang.Integer getCategoryIii() {
		return this.categoryIii;
	}
	public void setCategoryIv(java.lang.Integer value) {
		this.categoryIv = value;
	}
	
	public java.lang.Integer getCategoryIv() {
		return this.categoryIv;
	}
	public void setSupplier(java.lang.String value) {
		this.supplier = value;
	}
	
	public java.lang.String getSupplier() {
		return this.supplier;
	}
	public void setPurchasePrice(java.lang.Long value) {
		this.purchasePrice = value;
	}
	
	public java.lang.Long getPurchasePrice() {
		return this.purchasePrice;
	}
	public void setSellingPrice(java.lang.Long value) {
		this.sellingPrice = value;
	}
	
	public java.lang.Long getSellingPrice() {
		return this.sellingPrice;
	}
	public void setTravelDays(java.lang.Integer value) {
		this.travelDays = value;
	}
	
	public java.lang.Integer getTravelDays() {
		return this.travelDays;
	}
	public void setTraffic(java.lang.Integer value) {
		this.traffic = value;
	}
	
	public java.lang.Integer getTraffic() {
		return this.traffic;
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
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setMainPush(Integer value) {
		this.mainPush = value;
	}
	
	public Integer getMainPush() {
		return this.mainPush;
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
			.append("Status",getStatus())
			.append("Title",getTitle())
			.append("Subtitle",getSubtitle())
			.append("Summary",getSummary())
			.append("CategoryI",getCategoryI())
			.append("CategoryIi",getCategoryIi())
			.append("CategoryIii",getCategoryIii())
			.append("CategoryIv",getCategoryIv())
			.append("Supplier",getSupplier())
			.append("PurchasePrice",getPurchasePrice())
			.append("SellingPrice",getSellingPrice())
			.append("TravelDays",getTravelDays())
			.append("Traffic",getTraffic())
			.append("Satisfaction",getSatisfaction())
			.append("Evaluate",getEvaluate())
			.append("Remark",getRemark())
			.append("MainPush",getMainPush())
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
		if(obj instanceof TourProduct == false) return false;
		if(this == obj) return true;
		TourProduct other = (TourProduct)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

