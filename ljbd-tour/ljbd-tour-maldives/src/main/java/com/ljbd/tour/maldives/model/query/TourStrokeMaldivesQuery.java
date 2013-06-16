package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourStrokeMaldivesQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 产品编号 */
	private java.lang.Integer tourProductId;
	/** 出发地 */
	private java.lang.String departure;
	/** 目的地 */
	private java.lang.String destination;
	/** 行程序号 */
	private java.lang.Integer tpn;
	/** 滞留天数 */
	private java.lang.Integer duration;
	/** 交通 */
	private java.lang.Integer traffic;
	/** 景点编号 */
	private java.lang.Integer tourScenicId;
	/** 景点名称 */
	private java.lang.String scenicName;
	/** 酒店编号 */
	private java.lang.Integer tourHotelId;
	/** 酒店名称 */
	private java.lang.String hotelName;
	/** 房型名称 */
	private java.lang.String room;
	/** 居住人数 */
	private Integer capacity;
	/** 早餐 */
	private Integer breakfast;
	/** 床型 */
	private Integer bedType;
	/** 宽带 */
	private Integer broadband;
	/** 用餐 */
	private java.lang.String dining;
	/** 相关景点 */
	private java.lang.String relatedAttractions;
	/** 描述信息 */
	private java.lang.String description;
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
	
	public java.lang.Integer getTourProductId() {
		return this.tourProductId;
	}
	
	public void setTourProductId(java.lang.Integer value) {
		this.tourProductId = value;
	}
	
	public java.lang.String getDeparture() {
		return this.departure;
	}
	
	public void setDeparture(java.lang.String value) {
		this.departure = value;
	}
	
	public java.lang.String getDestination() {
		return this.destination;
	}
	
	public void setDestination(java.lang.String value) {
		this.destination = value;
	}
	
	public java.lang.Integer getTpn() {
		return this.tpn;
	}
	
	public void setTpn(java.lang.Integer value) {
		this.tpn = value;
	}
	
	public java.lang.Integer getDuration() {
		return this.duration;
	}
	
	public void setDuration(java.lang.Integer value) {
		this.duration = value;
	}
	
	public java.lang.Integer getTraffic() {
		return this.traffic;
	}
	
	public void setTraffic(java.lang.Integer value) {
		this.traffic = value;
	}
	
	public java.lang.Integer getTourScenicId() {
		return this.tourScenicId;
	}
	
	public void setTourScenicId(java.lang.Integer value) {
		this.tourScenicId = value;
	}
	
	public java.lang.String getScenicName() {
		return this.scenicName;
	}
	
	public void setScenicName(java.lang.String value) {
		this.scenicName = value;
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
	
	public java.lang.String getRoom() {
		return this.room;
	}
	
	public void setRoom(java.lang.String value) {
		this.room = value;
	}
	
	public Integer getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(Integer value) {
		this.capacity = value;
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
	
	public Integer getBroadband() {
		return this.broadband;
	}
	
	public void setBroadband(Integer value) {
		this.broadband = value;
	}
	
	public java.lang.String getDining() {
		return this.dining;
	}
	
	public void setDining(java.lang.String value) {
		this.dining = value;
	}
	
	public java.lang.String getRelatedAttractions() {
		return this.relatedAttractions;
	}
	
	public void setRelatedAttractions(java.lang.String value) {
		this.relatedAttractions = value;
	}
	
	public java.lang.String getDescription() {
		return this.description;
	}
	
	public void setDescription(java.lang.String value) {
		this.description = value;
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

