package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourMetadataQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 分组 */
	private java.lang.Integer metadataGroup;
	/** 分类1 */
	private java.lang.Integer metadataKeyI;
	/** 分类2 */
	private java.lang.Integer metadataKeyIi;
	/** 分类3 */
	private java.lang.String metadataKeyIii;
	/** 分类4 */
	private java.lang.String metadataKeyIv;
	/** 对应值 */
	private java.lang.String metadataValue;
	/** 名称 */
	private java.lang.String metadataValueName;
	/** 备注描述 */
	private java.lang.String metadataRemark;
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
	/** 版本 */
	private java.lang.Integer sysVersion;
	/** 有效标识 */
	private Integer yn;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getMetadataGroup() {
		return this.metadataGroup;
	}
	
	public void setMetadataGroup(java.lang.Integer value) {
		this.metadataGroup = value;
	}
	
	public java.lang.Integer getMetadataKeyI() {
		return this.metadataKeyI;
	}
	
	public void setMetadataKeyI(java.lang.Integer value) {
		this.metadataKeyI = value;
	}
	
	public java.lang.Integer getMetadataKeyIi() {
		return this.metadataKeyIi;
	}
	
	public void setMetadataKeyIi(java.lang.Integer value) {
		this.metadataKeyIi = value;
	}
	
	public java.lang.String getMetadataKeyIii() {
		return this.metadataKeyIii;
	}
	
	public void setMetadataKeyIii(java.lang.String value) {
		this.metadataKeyIii = value;
	}
	
	public java.lang.String getMetadataKeyIv() {
		return this.metadataKeyIv;
	}
	
	public void setMetadataKeyIv(java.lang.String value) {
		this.metadataKeyIv = value;
	}
	
	public java.lang.String getMetadataValue() {
		return this.metadataValue;
	}
	
	public void setMetadataValue(java.lang.String value) {
		this.metadataValue = value;
	}
	
	public java.lang.String getMetadataValueName() {
		return this.metadataValueName;
	}
	
	public void setMetadataValueName(java.lang.String value) {
		this.metadataValueName = value;
	}
	
	public java.lang.String getMetadataRemark() {
		return this.metadataRemark;
	}
	
	public void setMetadataRemark(java.lang.String value) {
		this.metadataRemark = value;
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

