/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-13
**/
package com.yh.hr.res.pb.bo;

import com.yh.platform.core.bo.BaseBo;

public class PbResumeInfo extends BaseBo {
	private static final long serialVersionUID = 2515516587055227706L;

    /**
     *工作简历OID
     **/
	private java.lang.Long resumeOid;
    /**
     *PersonOid
     **/
	private java.lang.Long personOid;
    /**
     *开始时间
     **/
	private java.util.Date startDate;
    /**
     *截止时间
     **/
	private java.util.Date endDate;
    /**
     *工作单位
     **/
	private java.lang.String unit;
    /**
     *职务
     **/
	private java.lang.String duty;
    /**
     *备注
     **/
	private java.lang.String remark;
    /**
     *创建人ID
     **/
	private java.lang.String createBy;
    /**
     *创建人名称
     **/
	private java.lang.String createName;
    /**
     *创建时间
     **/
	private java.util.Date createDate;
    /**
     *修改人ID
     **/
	private java.lang.String updateBy;
    /**
     *修改人名称
     **/
	private java.lang.String updateName;
    /**
     *修改时间
     **/
	private java.util.Date updateDate;

	public PbResumeInfo() {}

    public PbResumeInfo(java.lang.Long resumeOid) {
        this.resumeOid = resumeOid;
    }

	public void setResumeOid(java.lang.Long resumeOid){
		this.resumeOid = resumeOid;
	}

	public java.lang.Long getResumeOid(){
		return this.resumeOid;
	}

	public void setPersonOid(java.lang.Long personOid){
		this.personOid = personOid;
	}

	public java.lang.Long getPersonOid(){
		return this.personOid;
	}

	public void setStartDate(java.util.Date startDate){
		this.startDate = startDate;
	}

	public java.util.Date getStartDate(){
		return this.startDate;
	}

	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}

	public java.util.Date getEndDate(){
		return this.endDate;
	}

	public void setUnit(java.lang.String unit){
		this.unit = unit;
	}

	public java.lang.String getUnit(){
		return this.unit;
	}

	public void setDuty(java.lang.String duty){
		this.duty = duty;
	}

	public java.lang.String getDuty(){
		return this.duty;
	}

	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}

	public java.lang.String getRemark(){
		return this.remark;
	}

	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}

	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}

	public java.lang.String getCreateName(){
		return this.createName;
	}

	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}

	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}

	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}

	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}

	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

}
