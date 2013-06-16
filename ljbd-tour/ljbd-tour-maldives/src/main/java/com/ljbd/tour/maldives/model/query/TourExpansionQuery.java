package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourExpansionQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 产品编号 */
	private java.lang.Integer tourProductId;
	/** 分类一级标识 */
	private java.lang.Integer categoryI;
	/** 一级标识名称 */
	private java.lang.String categoryIname;
	/** 分类二级标识 */
	private java.lang.Integer categoryIi;
	/** 二级标识名称 */
	private java.lang.String categoryIiName;
	/** 分类三级标识 */
	private java.lang.Integer categoryIii;
	/** 三级标识名称 */
	private java.lang.String categoryIiiName;
	/** 协助三级分类标识 */
	private java.lang.Integer categoryAssisted;
	/** 分类内容 */
	private java.lang.String categoryContent;
	/** 排序 */
	private java.lang.Integer sequence;
	/** 备注 */
	private java.lang.String remark;
	/** 扩展标记 */
	private Integer extensibleMarkup;
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
	
	public java.lang.Integer getCategoryI() {
		return this.categoryI;
	}
	
	public void setCategoryI(java.lang.Integer value) {
		this.categoryI = value;
	}
	
	public java.lang.String getCategoryIname() {
		return this.categoryIname;
	}
	
	public void setCategoryIname(java.lang.String value) {
		this.categoryIname = value;
	}
	
	public java.lang.Integer getCategoryIi() {
		return this.categoryIi;
	}
	
	public void setCategoryIi(java.lang.Integer value) {
		this.categoryIi = value;
	}
	
	public java.lang.String getCategoryIiName() {
		return this.categoryIiName;
	}
	
	public void setCategoryIiName(java.lang.String value) {
		this.categoryIiName = value;
	}
	
	public java.lang.Integer getCategoryIii() {
		return this.categoryIii;
	}
	
	public void setCategoryIii(java.lang.Integer value) {
		this.categoryIii = value;
	}
	
	public java.lang.String getCategoryIiiName() {
		return this.categoryIiiName;
	}
	
	public void setCategoryIiiName(java.lang.String value) {
		this.categoryIiiName = value;
	}
	
	public java.lang.Integer getCategoryAssisted() {
		return this.categoryAssisted;
	}
	
	public void setCategoryAssisted(java.lang.Integer value) {
		this.categoryAssisted = value;
	}
	
	public java.lang.String getCategoryContent() {
		return this.categoryContent;
	}
	
	public void setCategoryContent(java.lang.String value) {
		this.categoryContent = value;
	}
	
	public java.lang.Integer getSequence() {
		return this.sequence;
	}
	
	public void setSequence(java.lang.Integer value) {
		this.sequence = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public Integer getExtensibleMarkup() {
		return this.extensibleMarkup;
	}
	
	public void setExtensibleMarkup(Integer value) {
		this.extensibleMarkup = value;
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

