package com.ljbd.ocrs.rentalcar.domain.example;


import cn.org.rapid_framework.util.DateConvertUtils;
import com.ljbd.ocrs.rentalcar.domain.common.Org;
import com.ljbd.common.support.domain.BaseEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class Example extends BaseEntity implements java.io.Serializable {
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

    private Integer id;
    /**
     * name       db_column: name
     */
    @Length(max = 20)
    private String name;
    /**
     * email       db_column: email
     */
    @Email
    @Length(max = 20)
    private String email;
    /**
     * yn       db_column: yn
     */

    private Boolean yn;
    /**
     * creatTime       db_column: creat_time
     */

    private Date creatTime;
    /**
     * updateTime       db_column: update_time
     */

    private Date updateTime;

    private Org org = Org.Beijing;

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    //columns END

    public Example() {
    }

    public Example(
            Integer id
    )
    {
        this.id = id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setYn(Boolean value) {
        this.yn = value;
    }

    public Boolean getYn() {
        return this.yn;
    }

    public String getCreatTimeString() {
        return DateConvertUtils.format(getCreatTime(), FORMAT_CREAT_TIME);
    }

    public void setCreatTimeString(String value) {
        setCreatTime(DateConvertUtils.parse(value, FORMAT_CREAT_TIME, Date.class));
    }

    public void setCreatTime(Date value) {
        this.creatTime = value;
    }

    public Date getCreatTime() {
        return this.creatTime;
    }

    public String getUpdateTimeString() {
        return DateConvertUtils.format(getUpdateTime(), FORMAT_UPDATE_TIME);
    }

    public void setUpdateTimeString(String value) {
        setUpdateTime(DateConvertUtils.parse(value, FORMAT_UPDATE_TIME, Date.class));
    }

    public void setUpdateTime(Date value) {
        this.updateTime = value;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("Id", getId())
                .append("Name", getName())
                .append("Email", getEmail())
                .append("Yn", getYn())
                .append("CreatTime", getCreatTime())
                .append("UpdateTime", getUpdateTime())
                .toString();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Example == false) return false;
        if (this == obj) return true;
        Example other = (Example) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
			.isEquals();
	}
}