package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourCompositionMaldivesQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 版面 */
	private java.lang.Integer module;
	/** 板块 */
	private java.lang.Integer forum;
	/** 产品编号 */
	private java.lang.Integer tourProductId;
	/** 标题 */
	private java.lang.String title;
	/** 副标题 */
	private java.lang.String subtitle;
	/** 简介 */
	private java.lang.String summary;
	/** 主推 */
	private Integer mainPush;
	/** 图片 */
	private java.lang.String photoPath;
	/** 销售价格 */
	private java.lang.Long sellingPrice;
	/** 满意度 */
	private java.lang.Integer satisfaction;
	/** 评价数 */
	private java.lang.Integer evaluate;
	/** 酒店编号 */
	private java.lang.Integer tourHotelId;
	/** 酒店名称 */
	private java.lang.String hotelName;
	/** 酒店等级 */
	private java.lang.Integer hotelGrade;
	/** 酒店位置 */
	private java.lang.String hotelLocation;
	/** 创建时间 */
	private java.util.Date createDateBegin;
	private java.util.Date createDateEnd;
	/** 创建人 */
	private java.lang.String createName;
	/** 更改时间 */
	private java.util.Date updateDateBegin;
	private java.util.Date updateDateEnd;
	/** 更改人 */
	private java.lang.String updateName;
	/** 版本号 */
	private java.lang.Integer sysVersion;
	/** 删除标识 */
	private Integer yn;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getModule() {
		return this.module;
	}
	
	public void setModule(java.lang.Integer value) {
		this.module = value;
	}
	
	public java.lang.Integer getForum() {
		return this.forum;
	}
	
	public void setForum(java.lang.Integer value) {
		this.forum = value;
	}
	
	public java.lang.Integer getTourProductId() {
		return this.tourProductId;
	}
	
	public void setTourProductId(java.lang.Integer value) {
		this.tourProductId = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getSubtitle() {
		return this.subtitle;
	}
	
	public void setSubtitle(java.lang.String value) {
		this.subtitle = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public Integer getMainPush() {
		return this.mainPush;
	}
	
	public void setMainPush(Integer value) {
		this.mainPush = value;
	}
	
	public java.lang.String getPhotoPath() {
		return this.photoPath;
	}
	
	public void setPhotoPath(java.lang.String value) {
		this.photoPath = value;
	}
	
	public java.lang.Long getSellingPrice() {
		return this.sellingPrice;
	}
	
	public void setSellingPrice(java.lang.Long value) {
		this.sellingPrice = value;
	}
	
	public java.lang.Integer getSatisfaction() {
		return this.satisfaction;
	}
	
	public void setSatisfaction(java.lang.Integer value) {
		this.satisfaction = value;
	}
	
	public java.lang.Integer getEvaluate() {
		return this.evaluate;
	}
	
	public void setEvaluate(java.lang.Integer value) {
		this.evaluate = value;
	}
	
	public java.lang.Integer getTourHotelId() {
		return this.tourHotelId;
	}
	
	public void setTourHotelId(java.lang.Integer value) {
		this.tourHotelId = value;
	}
	
	public java.lang.String getHotelName() {
		return this.hotelName;
	}
	
	public void setHotelName(java.lang.String value) {
		this.hotelName = value;
	}
	
	public java.lang.Integer getHotelGrade() {
		return this.hotelGrade;
	}
	
	public void setHotelGrade(java.lang.Integer value) {
		this.hotelGrade = value;
	}
	
	public java.lang.String getHotelLocation() {
		return this.hotelLocation;
	}
	
	public void setHotelLocation(java.lang.String value) {
		this.hotelLocation = value;
	}
	
	public java.util.Date getCreateDateBegin() {
		return this.createDateBegin;
	}
	
	public void setCreateDateBegin(java.util.Date value) {
		this.createDateBegin = value;
	}	
	
	public java.util.Date getCreateDateEnd() {
		return this.createDateEnd;
	}
	
	public void setCreateDateEnd(java.util.Date value) {
		this.createDateEnd = value;
	}
	
	public java.lang.String getCreateName() {
		return this.createName;
	}
	
	public void setCreateName(java.lang.String value) {
		this.createName = value;
	}
	
	public java.util.Date getUpdateDateBegin() {
		return this.updateDateBegin;
	}
	
	public void setUpdateDateBegin(java.util.Date value) {
		this.updateDateBegin = value;
	}	
	
	public java.util.Date getUpdateDateEnd() {
		return this.updateDateEnd;
	}
	
	public void setUpdateDateEnd(java.util.Date value) {
		this.updateDateEnd = value;
	}
	
	public java.lang.String getUpdateName() {
		return this.updateName;
	}
	
	public void setUpdateName(java.lang.String value) {
		this.updateName = value;
	}
	
	public java.lang.Integer getSysVersion() {
		return this.sysVersion;
	}
	
	public void setSysVersion(java.lang.Integer value) {
		this.sysVersion = value;
	}
	
	public Integer getYn() {
		return this.yn;
	}
	
	public void setYn(Integer value) {
		this.yn = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

