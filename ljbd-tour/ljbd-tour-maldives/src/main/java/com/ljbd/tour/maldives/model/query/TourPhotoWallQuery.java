package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourPhotoWallQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 号编 */
	private java.lang.Integer id;
	/** 图片标题 */
	private java.lang.String photoTitle;
	/** 图片分类 */
	private java.lang.Integer photoCategory;
	/** 图片描述 */
	private java.lang.String descrption;
	/** 图片路径 */
	private java.lang.String photePath;
	/** 产品编号 */
	private java.lang.Integer tourProductId;
	/** 发布标识 */
	private Integer effective;
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
	
	public java.lang.String getPhotoTitle() {
		return this.photoTitle;
	}
	
	public void setPhotoTitle(java.lang.String value) {
		this.photoTitle = value;
	}
	
	public java.lang.Integer getPhotoCategory() {
		return this.photoCategory;
	}
	
	public void setPhotoCategory(java.lang.Integer value) {
		this.photoCategory = value;
	}
	
	public java.lang.String getDescrption() {
		return this.descrption;
	}
	
	public void setDescrption(java.lang.String value) {
		this.descrption = value;
	}
	
	public java.lang.String getPhotePath() {
		return this.photePath;
	}
	
	public void setPhotePath(java.lang.String value) {
		this.photePath = value;
	}
	
	public java.lang.Integer getTourProductId() {
		return this.tourProductId;
	}
	
	public void setTourProductId(java.lang.Integer value) {
		this.tourProductId = value;
	}
	
	public Integer getEffective() {
		return this.effective;
	}
	
	public void setEffective(Integer value) {
		this.effective = value;
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

