/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-13
**/
package com.yh.hr.res.pt.dto;

import com.yh.platform.core.bo.BaseBo;
import com.yh.platform.core.util.DateUtil;

public class PtPoliticInfoDTO extends BaseBo {
	private static final long serialVersionUID = 2515516587055227706L;

    /**
     *PoliticOid
     **/
	private java.lang.Long politicOid;
    /**
     *BizPersonOid
     **/
	private java.lang.Long bizPersonOid;
    /**
     *基础OID
     **/
	private java.lang.Long basePoliticOid;
    /**
     *政治面貌
     **/
	private java.lang.String politicStatusCode;
    /**
     *参加党派时间
     **/
	private java.util.Date joinPoliticDate;
    /**
     *参加党派时所在单位
     **/
	private java.lang.String unitOfJoinParty;
    /**
     *介绍人
     **/
	private java.lang.String introducer;
    /**
     *转正时间
     **/
	private java.util.Date probationDate;
    /**
     *党内职务名称
     **/
	private java.lang.String politicDutyCode;
    /**
     *离党日期
     **/
	private java.util.Date outPartyDate;
    /**
     *异常事项类别
     **/
	private java.lang.String abnormityType;
    /**
     *异常事项原因
     **/
	private java.lang.String abnormityReason;
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
	
	private java.lang.String joinPoliticDateStr;

	public PtPoliticInfoDTO() {}

    public PtPoliticInfoDTO(java.lang.Long politicOid) {
        this.politicOid = politicOid;
    }

	public void setPoliticOid(java.lang.Long politicOid){
		this.politicOid = politicOid;
	}

	public java.lang.Long getPoliticOid(){
		return this.politicOid;
	}

	public java.lang.Long getBizPersonOid() {
		return bizPersonOid;
	}

	public void setBizPersonOid(java.lang.Long bizPersonOid) {
		this.bizPersonOid = bizPersonOid;
	}

	public java.lang.Long getBasePoliticOid() {
		return basePoliticOid;
	}

	public void setBasePoliticOid(java.lang.Long basePoliticOid) {
		this.basePoliticOid = basePoliticOid;
	}

	public void setPoliticStatusCode(java.lang.String politicStatusCode){
		this.politicStatusCode = politicStatusCode;
	}

	public java.lang.String getPoliticStatusCode(){
		return this.politicStatusCode;
	}

	public void setJoinPoliticDate(java.util.Date joinPoliticDate){
		this.joinPoliticDate = joinPoliticDate;
		this.joinPoliticDateStr =DateUtil.formatDate(joinPoliticDate);
	}

	public java.util.Date getJoinPoliticDate(){
		return this.joinPoliticDate;
	}

	public java.lang.String getJoinPoliticDateStr() {
		return joinPoliticDateStr;
	}

	public void setJoinPoliticDateStr(java.lang.String joinPoliticDateStr) {
		this.joinPoliticDateStr = joinPoliticDateStr;
		this.joinPoliticDate =DateUtil.parseDate(joinPoliticDateStr);
	}

	public void setUnitOfJoinParty(java.lang.String unitOfJoinParty){
		this.unitOfJoinParty = unitOfJoinParty;
	}

	public java.lang.String getUnitOfJoinParty(){
		return this.unitOfJoinParty;
	}

	public void setIntroducer(java.lang.String introducer){
		this.introducer = introducer;
	}

	public java.lang.String getIntroducer(){
		return this.introducer;
	}

	public void setProbationDate(java.util.Date probationDate){
		this.probationDate = probationDate;
	}

	public java.util.Date getProbationDate(){
		return this.probationDate;
	}

	public void setPoliticDutyCode(java.lang.String politicDutyCode){
		this.politicDutyCode = politicDutyCode;
	}

	public java.lang.String getPoliticDutyCode(){
		return this.politicDutyCode;
	}

	public void setOutPartyDate(java.util.Date outPartyDate){
		this.outPartyDate = outPartyDate;
	}

	public java.util.Date getOutPartyDate(){
		return this.outPartyDate;
	}

	public void setAbnormityType(java.lang.String abnormityType){
		this.abnormityType = abnormityType;
	}

	public java.lang.String getAbnormityType(){
		return this.abnormityType;
	}

	public void setAbnormityReason(java.lang.String abnormityReason){
		this.abnormityReason = abnormityReason;
	}

	public java.lang.String getAbnormityReason(){
		return this.abnormityReason;
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
