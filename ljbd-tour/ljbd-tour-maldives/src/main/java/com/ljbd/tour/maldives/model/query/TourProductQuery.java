package com.ljbd.tour.maldives.model.query;
import com.ljbd.common.support.BaseQuery;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


public class TourProductQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 编号 */
	private java.lang.Integer id;
	/** 状态 */
	private Integer status;
	/** 标题 */
	private java.lang.String title;
	/** 副标题 */
	private java.lang.String subtitle;
	/** 简介 */
	private java.lang.String summary;
	/** 分类1栏目 */
	private java.lang.Integer categoryI;
	/** 分类2线路类别 */
	private java.lang.Integer categoryIi;
	/** 分类3线路主题 */
	private java.lang.Integer categoryIii;
	/** 分类4 */
	private java.lang.Integer categoryIv;
	/** 供应商 */
	private java.lang.String supplier;
	/** 底价 */
	private java.lang.Long purchasePrice;
	/** 销售价 */
	private java.lang.Long sellingPrice;
	/** 行程天数 */
	private java.lang.Integer travelDays;
	/** 交通 */
	private java.lang.Integer traffic;
	/** 满意度 */
	private java.lang.Integer satisfaction;
	/** 评价数 */
	private java.lang.Integer evaluate;
	/** 备注 */
	private java.lang.String remark;
	/** 是否主推 */
	private Integer mainPush;
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
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
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
	
	public java.lang.Integer getCategoryI() {
		return this.categoryI;
	}
	
	public void setCategoryI(java.lang.Integer value) {
		this.categoryI = value;
	}
	
	public java.lang.Integer getCategoryIi() {
		return this.categoryIi;
	}
	
	public void setCategoryIi(java.lang.Integer value) {
		this.categoryIi = value;
	}
	
	public java.lang.Integer getCategoryIii() {
		return this.categoryIii;
	}
	
	public void setCategoryIii(java.lang.Integer value) {
		this.categoryIii = value;
	}
	
	public java.lang.Integer getCategoryIv() {
		return this.categoryIv;
	}
	
	public void setCategoryIv(java.lang.Integer value) {
		this.categoryIv = value;
	}
	
	public java.lang.String getSupplier() {
		return this.supplier;
	}
	
	public void setSupplier(java.lang.String value) {
		this.supplier = value;
	}
	
	public java.lang.Long getPurchasePrice() {
		return this.purchasePrice;
	}
	
	public void setPurchasePrice(java.lang.Long value) {
		this.purchasePrice = value;
	}
	
	public java.lang.Long getSellingPrice() {
		return this.sellingPrice;
	}
	
	public void setSellingPrice(java.lang.Long value) {
		this.sellingPrice = value;
	}
	
	public java.lang.Integer getTravelDays() {
		return this.travelDays;
	}
	
	public void setTravelDays(java.lang.Integer value) {
		this.travelDays = value;
	}
	
	public java.lang.Integer getTraffic() {
		return this.traffic;
	}
	
	public void setTraffic(java.lang.Integer value) {
		this.traffic = value;
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
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public Integer getMainPush() {
		return this.mainPush;
	}
	
	public void setMainPush(Integer value) {
		this.mainPush = value;
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

