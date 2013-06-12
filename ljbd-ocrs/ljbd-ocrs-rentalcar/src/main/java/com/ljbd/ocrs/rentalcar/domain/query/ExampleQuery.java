
package com.ljbd.ocrs.rentalcar.domain.query;


import com.ljbd.ocrs.rentalcar.domain.common.Org;
import com.ljbd.common.support.domain.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ExampleQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;


	/** id */
	private Integer id;
	/** name */
	private String name;
	/** email */
	private String email;
	/** yn */
	private Boolean yn;
	/** creatTime */
	private Date creatTimeBegin;
	private Date creatTimeEnd;
	/** updateTime */
	private Date updateTimeBegin;
	private Date updateTimeEnd;

     private Org org= Org.Beijing;

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public Boolean getYn() {
		return this.yn;
	}

	public void setYn(Boolean value) {
		this.yn = value;
	}

	public Date getCreatTimeBegin() {
		return this.creatTimeBegin;
	}

	public void setCreatTimeBegin(Date value) {
		this.creatTimeBegin = value;
	}

	public Date getCreatTimeEnd() {
		return this.creatTimeEnd;
	}

	public void setCreatTimeEnd(Date value) {
		this.creatTimeEnd = value;
	}

	public Date getUpdateTimeBegin() {
		return this.updateTimeBegin;
	}

	public void setUpdateTimeBegin(Date value) {
		this.updateTimeBegin = value;
	}

	public Date getUpdateTimeEnd() {
		return this.updateTimeEnd;
	}

	public void setUpdateTimeEnd(Date value) {
		this.updateTimeEnd = value;
	}


	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}

}