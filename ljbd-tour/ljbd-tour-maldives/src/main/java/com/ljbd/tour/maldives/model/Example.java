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


public class Example extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Example";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_YN = "yn";
	public static final String ALIAS_CREAT_TIME = "creatTime";
	public static final String ALIAS_UPDATE_TIME = "updateTime";
	
	//date formats
	public static final String FORMAT_CREAT_TIME = DATE_FORMAT;
	public static final String FORMAT_UPDATE_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * name       db_column: name 
     */	
	@Length(max=50)
	private java.lang.String name;
    /**
     * email       db_column: email 
     */	
	@Email @Length(max=50)
	private java.lang.String email;
    /**
     * yn       db_column: yn 
     */	
	@Max(127)
	private Integer yn;
    /**
     * creatTime       db_column: creat_time 
     */	
	
	private java.util.Date creatTime;
    /**
     * updateTime       db_column: update_time 
     */	
	
	private java.util.Date updateTime;
	//columns END

	public Example(){
	}

	public Example(
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setYn(Integer value) {
		this.yn = value;
	}
	
	public Integer getYn() {
		return this.yn;
	}
	public String getCreatTimeString() {
		return DateConvertUtils.format(getCreatTime(), FORMAT_CREAT_TIME);
	}
	public void setCreatTimeString(String value) {
		setCreatTime(DateConvertUtils.parse(value, FORMAT_CREAT_TIME,java.util.Date.class));
	}
	
	public void setCreatTime(java.util.Date value) {
		this.creatTime = value;
	}
	
	public java.util.Date getCreatTime() {
		return this.creatTime;
	}
	public String getUpdateTimeString() {
		return DateConvertUtils.format(getUpdateTime(), FORMAT_UPDATE_TIME);
	}
	public void setUpdateTimeString(String value) {
		setUpdateTime(DateConvertUtils.parse(value, FORMAT_UPDATE_TIME,java.util.Date.class));
	}
	
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("Email",getEmail())
			.append("Yn",getYn())
			.append("CreatTime",getCreatTime())
			.append("UpdateTime",getUpdateTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Example == false) return false;
		if(this == obj) return true;
		Example other = (Example)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

