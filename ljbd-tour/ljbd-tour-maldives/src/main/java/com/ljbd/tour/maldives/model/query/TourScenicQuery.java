package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourScenicQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 景点名称 */
	private java.lang.String scenicName;
	/** 英文名称 */
	private java.lang.String scenicNameEn;
	/** 详细地址 */
	private java.lang.String address;
	/** 服务项目 */
	private java.lang.String servicesItems;
	/** 酒店编号 */
	private java.lang.Integer tourHotelId;
	/** 酒店名称 */
	private java.lang.String hotelName;
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
	
	public java.lang.String getScenicName() {
		return this.scenicName;
	}
	
	public void setScenicName(java.lang.String value) {
		this.scenicName = value;
	}
	
	public java.lang.String getScenicNameEn() {
		return this.scenicNameEn;
	}
	
	public void setScenicNameEn(java.lang.String value) {
		this.scenicNameEn = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getServicesItems() {
		return this.servicesItems;
	}
	
	public void setServicesItems(java.lang.String value) {
		this.servicesItems = value;
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

