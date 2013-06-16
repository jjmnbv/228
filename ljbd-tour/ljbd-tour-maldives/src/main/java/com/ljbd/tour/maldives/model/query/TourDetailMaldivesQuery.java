package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourDetailMaldivesQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 产品编号 */
	private java.lang.Integer tourProductId;
	/** 交通 */
	private java.lang.Integer traffic;
	/** 交通级别 */
	private java.lang.Integer trafficGrade;
	/** 启程时间 */
	private java.util.Date departureTimeBegin;
	private java.util.Date departureTimeEnd;
	/** 启程到站时间 */
	private java.util.Date departureArrivalTimeBegin;
	private java.util.Date departureArrivalTimeEnd;
	/** 启程出发地 */
	private java.lang.String departureStart;
	/** 启程目的地 */
	private java.lang.String departureDestination;
	/** 返程时间 */
	private java.util.Date returnTimeBegin;
	private java.util.Date returnTimeEnd;
	/** 返程到站时间 */
	private java.util.Date returnArrivalTimeBegin;
	private java.util.Date returnArrivalTimeEnd;
	/** 返程出发地 */
	private java.lang.String returnStart;
	/** 返程目的地 */
	private java.lang.String returnDestination;
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
	
	public java.lang.Integer getTraffic() {
		return this.traffic;
	}
	
	public void setTraffic(java.lang.Integer value) {
		this.traffic = value;
	}
	
	public java.lang.Integer getTrafficGrade() {
		return this.trafficGrade;
	}
	
	public void setTrafficGrade(java.lang.Integer value) {
		this.trafficGrade = value;
	}
	
	public java.util.Date getDepartureTimeBegin() {
		return this.departureTimeBegin;
	}
	
	public void setDepartureTimeBegin(java.util.Date value) {
		this.departureTimeBegin = value;
	}	
	
	public java.util.Date getDepartureTimeEnd() {
		return this.departureTimeEnd;
	}
	
	public void setDepartureTimeEnd(java.util.Date value) {
		this.departureTimeEnd = value;
	}
	
	public java.util.Date getDepartureArrivalTimeBegin() {
		return this.departureArrivalTimeBegin;
	}
	
	public void setDepartureArrivalTimeBegin(java.util.Date value) {
		this.departureArrivalTimeBegin = value;
	}	
	
	public java.util.Date getDepartureArrivalTimeEnd() {
		return this.departureArrivalTimeEnd;
	}
	
	public void setDepartureArrivalTimeEnd(java.util.Date value) {
		this.departureArrivalTimeEnd = value;
	}
	
	public java.lang.String getDepartureStart() {
		return this.departureStart;
	}
	
	public void setDepartureStart(java.lang.String value) {
		this.departureStart = value;
	}
	
	public java.lang.String getDepartureDestination() {
		return this.departureDestination;
	}
	
	public void setDepartureDestination(java.lang.String value) {
		this.departureDestination = value;
	}
	
	public java.util.Date getReturnTimeBegin() {
		return this.returnTimeBegin;
	}
	
	public void setReturnTimeBegin(java.util.Date value) {
		this.returnTimeBegin = value;
	}	
	
	public java.util.Date getReturnTimeEnd() {
		return this.returnTimeEnd;
	}
	
	public void setReturnTimeEnd(java.util.Date value) {
		this.returnTimeEnd = value;
	}
	
	public java.util.Date getReturnArrivalTimeBegin() {
		return this.returnArrivalTimeBegin;
	}
	
	public void setReturnArrivalTimeBegin(java.util.Date value) {
		this.returnArrivalTimeBegin = value;
	}	
	
	public java.util.Date getReturnArrivalTimeEnd() {
		return this.returnArrivalTimeEnd;
	}
	
	public void setReturnArrivalTimeEnd(java.util.Date value) {
		this.returnArrivalTimeEnd = value;
	}
	
	public java.lang.String getReturnStart() {
		return this.returnStart;
	}
	
	public void setReturnStart(java.lang.String value) {
		this.returnStart = value;
	}
	
	public java.lang.String getReturnDestination() {
		return this.returnDestination;
	}
	
	public void setReturnDestination(java.lang.String value) {
		this.returnDestination = value;
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

