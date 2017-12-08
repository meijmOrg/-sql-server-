/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-13
**/
package com.yh.hr.info.ver.unit.comm.web.form;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.validator.ValidatorForm;

import com.yh.platform.core.util.DateUtil;

public class PbPunishmentInfoForm extends ValidatorForm {
	private static final long serialVersionUID = 110119120L;

	private java.lang.Long punishmentOid;
	private java.lang.Long personOid;
	private java.lang.String punishmentName;
	private java.lang.String punishmentReason;
	private java.lang.Long punishmentMonth;
	private java.util.Date punishmentEndDate;
    private String punishmentEndDateStr;
	private java.lang.String punishmentApprovalUnit;
	private java.util.Date punishmentDate;
    private String punishmentDateStr;
	private java.lang.String isCancalPunishment;
	private java.lang.String remark;
	private java.lang.String createBy;
	private java.lang.String createName;
	private java.util.Date createDate;
    private String createDateStr;
	private java.lang.String updateBy;
	private java.lang.String updateName;
	private java.util.Date updateDate;
    private String updateDateStr;

	public PbPunishmentInfoForm() {}

    public void setPunishmentOid(java.lang.Long punishmentOid){
		this.punishmentOid = punishmentOid;
	}

	public java.lang.Long getPunishmentOid(){
		return this.punishmentOid;
	}
    public void setPersonOid(java.lang.Long personOid){
		this.personOid = personOid;
	}

	public java.lang.Long getPersonOid(){
		return this.personOid;
	}
    public void setPunishmentName(java.lang.String punishmentName){
		this.punishmentName = punishmentName;
	}

	public java.lang.String getPunishmentName(){
		return this.punishmentName;
	}
    public void setPunishmentReason(java.lang.String punishmentReason){
		this.punishmentReason = punishmentReason;
	}

	public java.lang.String getPunishmentReason(){
		return this.punishmentReason;
	}
    public void setPunishmentMonth(java.lang.Long punishmentMonth){
		this.punishmentMonth = punishmentMonth;
	}

	public java.lang.Long getPunishmentMonth(){
		return this.punishmentMonth;
	}
    public void setPunishmentEndDate(java.util.Date punishmentEndDate){
		this.punishmentEndDate = punishmentEndDate;
		if(null != punishmentEndDate){
			this.punishmentEndDateStr = DateUtil.format(punishmentEndDate, "yyyy-MM");
         }
	}

	public java.util.Date getPunishmentEndDate(){
		return this.punishmentEndDate;
	}
    public void setPunishmentEndDateStr(String punishmentEndDateStr){
        this.punishmentEndDateStr = punishmentEndDateStr;
        if(StringUtils.isNotEmpty(punishmentEndDateStr)){
               this.punishmentEndDate = DateUtil.parse(punishmentEndDateStr, "yyyy-MM");
        }
    }

    public String getPunishmentEndDateStr(){
        return this.punishmentEndDateStr;
    }
    public void setPunishmentApprovalUnit(java.lang.String punishmentApprovalUnit){
		this.punishmentApprovalUnit = punishmentApprovalUnit;
	}

	public java.lang.String getPunishmentApprovalUnit(){
		return this.punishmentApprovalUnit;
	}
    public void setPunishmentDate(java.util.Date punishmentDate){
		this.punishmentDate = punishmentDate;
		if(null != punishmentDate){
			this.punishmentDateStr = DateUtil.format(punishmentDate, "yyyy-MM");
         }
	}

	public java.util.Date getPunishmentDate(){
		return this.punishmentDate;
	}
    public void setPunishmentDateStr(String punishmentDateStr){
        this.punishmentDateStr = punishmentDateStr;
        if(StringUtils.isNotEmpty(punishmentDateStr)){
               this.punishmentDate = DateUtil.parse(punishmentDateStr, "yyyy-MM");
        }
    }

    public String getPunishmentDateStr(){
        return this.punishmentDateStr;
    }
    public void setIsCancalPunishment(java.lang.String isCancalPunishment){
		this.isCancalPunishment = isCancalPunishment;
	}

	public java.lang.String getIsCancalPunishment(){
		return this.isCancalPunishment;
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
		if(null != createDate){
			this.createDateStr = DateUtil.format(createDate, "yyyy-MM");
         }
	}

	public java.util.Date getCreateDate(){
		return this.createDate;
	}
    public void setCreateDateStr(String createDateStr){
        this.createDateStr = createDateStr;
        if(StringUtils.isNotEmpty(createDateStr)){
               this.createDate = DateUtil.parse(createDateStr, "yyyy-MM");
        }
    }

    public String getCreateDateStr(){
        return this.createDateStr;
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
		if(null != updateDate){
			this.updateDateStr = DateUtil.format(updateDate, "yyyy-MM");
         }
	}

	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
    public void setUpdateDateStr(String updateDateStr){
        this.updateDateStr = updateDateStr;
        if(StringUtils.isNotEmpty(updateDateStr)){
               this.updateDate = DateUtil.parse(updateDateStr, "yyyy-MM");
        }
    }

    public String getUpdateDateStr(){
        return this.updateDateStr;
    }
	public void resetForm() {
		this.punishmentOid = null;
		this.personOid = null;
		this.punishmentName = null;
		this.punishmentReason = null;
		this.punishmentMonth = null;
		this.punishmentEndDate = null;
        this.punishmentEndDateStr = null;
		this.punishmentApprovalUnit = null;
		this.punishmentDate = null;
        this.punishmentDateStr = null;
		this.isCancalPunishment = null;
		this.remark = null;
		this.createBy = null;
		this.createName = null;
		this.createDate = null;
        this.createDateStr = null;
		this.updateBy = null;
		this.updateName = null;
		this.updateDate = null;
        this.updateDateStr = null;
	}

}