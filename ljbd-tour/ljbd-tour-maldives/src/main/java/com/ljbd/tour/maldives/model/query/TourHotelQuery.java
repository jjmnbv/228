package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourHotelQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 酒店名称 */
	private java.lang.String hotelName;
	/** 酒店星级 */
	private java.lang.Integer hotelGrade;
	/** 房型 */
	private java.lang.String room;
	/** 早餐 */
	private Integer breakfast;
	/** 床型 */
	private Integer bedType;
	/** 床型描述 */
	private java.lang.String bedTypeDesc;
	/** 宽带 */
	private Integer broadband;
	/** 是否可加床 */
	private Integer extraBed;
	/** 开业时间 */
	private java.util.Date openedDateBegin;
	private java.util.Date openedDateEnd;
	/** 装饰时间 */
	private java.util.Date decorateDateBegin;
	private java.util.Date decorateDateEnd;
	/** 房间数 */
	private java.lang.Integer roomsNumber;
	/** 酒店电话 */
	private java.lang.String hotelPhone;
	/** 酒店网址 */
	private java.lang.String hotelWebsite;
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
	
	public java.lang.String getRoom() {
		return this.room;
	}
	
	public void setRoom(java.lang.String value) {
		this.room = value;
	}
	
	public Integer getBreakfast() {
		return this.breakfast;
	}
	
	public void setBreakfast(Integer value) {
		this.breakfast = value;
	}
	
	public Integer getBedType() {
		return this.bedType;
	}
	
	public void setBedType(Integer value) {
		this.bedType = value;
	}
	
	public java.lang.String getBedTypeDesc() {
		return this.bedTypeDesc;
	}
	
	public void setBedTypeDesc(java.lang.String value) {
		this.bedTypeDesc = value;
	}
	
	public Integer getBroadband() {
		return this.broadband;
	}
	
	public void setBroadband(Integer value) {
		this.broadband = value;
	}
	
	public Integer getExtraBed() {
		return this.extraBed;
	}
	
	public void setExtraBed(Integer value) {
		this.extraBed = value;
	}
	
	public java.util.Date getOpenedDateBegin() {
		return this.openedDateBegin;
	}
	
	public void setOpenedDateBegin(java.util.Date value) {
		this.openedDateBegin = value;
	}	
	
	public java.util.Date getOpenedDateEnd() {
		return this.openedDateEnd;
	}
	
	public void setOpenedDateEnd(java.util.Date value) {
		this.openedDateEnd = value;
	}
	
	public java.util.Date getDecorateDateBegin() {
		return this.decorateDateBegin;
	}
	
	public void setDecorateDateBegin(java.util.Date value) {
		this.decorateDateBegin = value;
	}	
	
	public java.util.Date getDecorateDateEnd() {
		return this.decorateDateEnd;
	}
	
	public void setDecorateDateEnd(java.util.Date value) {
		this.decorateDateEnd = value;
	}
	
	public java.lang.Integer getRoomsNumber() {
		return this.roomsNumber;
	}
	
	public void setRoomsNumber(java.lang.Integer value) {
		this.roomsNumber = value;
	}
	
	public java.lang.String getHotelPhone() {
		return this.hotelPhone;
	}
	
	public void setHotelPhone(java.lang.String value) {
		this.hotelPhone = value;
	}
	
	public java.lang.String getHotelWebsite() {
		return this.hotelWebsite;
	}
	
	public void setHotelWebsite(java.lang.String value) {
		this.hotelWebsite = value;
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

