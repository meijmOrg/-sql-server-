/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-13 
 */
package com.yh.hr.res.pb.dto;

import com.yh.platform.core.util.DateUtil;


public class PbRewardInfoDTO {

	private java.lang.Long rewardOid;        //RewardOid
	private java.lang.Long personOid;        //PersonOid
	private java.lang.String rewardName;        //奖励名称
	private java.lang.String rewardTypeCode;        //奖励类别
	private java.lang.String honourLevel;        //授予荣誉称号级别
	private java.lang.String encouragementReason;        //奖励原因
	private java.lang.String rewardUnit;        //奖励批准单位
	private java.util.Date rewardDate;        //奖励批准日期
	private java.lang.String rewardDateStr;        //奖励批准日期
	private java.lang.String remark;        //备注
	private java.lang.String createBy;        //创建人ID
	private java.lang.String createName;        //创建人名称
	private java.util.Date createDate;        //创建时间
	private java.lang.String updateBy;        //修改人ID
	private java.lang.String updateName;        //修改人名称
	private java.util.Date updateDate;        //修改时间

	public void setRewardOid(java.lang.Long rewardOid){
		this.rewardOid = rewardOid;
	}

	public java.lang.Long getRewardOid(){
		return this.rewardOid;
	}
	public void setPersonOid(java.lang.Long personOid){
		this.personOid = personOid;
	}

	public java.lang.Long getPersonOid(){
		return this.personOid;
	}
	public void setRewardName(java.lang.String rewardName){
		this.rewardName = rewardName;
	}

	public java.lang.String getRewardName(){
		return this.rewardName;
	}
	public void setRewardTypeCode(java.lang.String rewardTypeCode){
		this.rewardTypeCode = rewardTypeCode;
	}

	public java.lang.String getRewardTypeCode(){
		return this.rewardTypeCode;
	}
	public void setHonourLevel(java.lang.String honourLevel){
		this.honourLevel = honourLevel;
	}

	public java.lang.String getHonourLevel(){
		return this.honourLevel;
	}
	public void setEncouragementReason(java.lang.String encouragementReason){
		this.encouragementReason = encouragementReason;
	}

	public java.lang.String getEncouragementReason(){
		return this.encouragementReason;
	}
	public void setRewardUnit(java.lang.String rewardUnit){
		this.rewardUnit = rewardUnit;
	}

	public java.lang.String getRewardUnit(){
		return this.rewardUnit;
	}
	public void setRewardDate(java.util.Date rewardDate){
		this.rewardDate = rewardDate;
		if(rewardDate!=null){
			this.rewardDateStr = DateUtil.formatDate(rewardDate);
		}
	}

	public java.util.Date getRewardDate(){
		return this.rewardDate;
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

	public java.lang.String getRewardDateStr() {
		return rewardDateStr;
	}

	public void setRewardDateStr(java.lang.String rewardDateStr) {
		this.rewardDateStr = rewardDateStr;
		if(rewardDateStr!=null){
			this.rewardDate = DateUtil.parseDate(rewardDateStr);
		}
	}
}