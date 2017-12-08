/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-11-23
**/
package com.yh.hr.res.pt.bo;

import com.yh.platform.core.bo.BaseBo;

/**
 * 开除信息
 * @author lenghh
 *
 * 时间:2016-11-24下午03:09:39
 */

public class PtDismissInfo extends BaseBo {
	private static final long serialVersionUID = 8536560146441358927L;

	private java.lang.Long  	ptDismissInfoOid;	//PtDismissInfoOid
	private java.lang.Long  	bizPersonOid;	//BizPersonOid
	private java.lang.String	dismissReason;	//开除原因
	private java.lang.String	dismissReasonType;	//开除原因类别
	public java.lang.String getDismissReasonType() {
		return dismissReasonType;
	}

	public void setDismissReasonType(java.lang.String dismissReasonType) {
		this.dismissReasonType = dismissReasonType;
	}

	private java.lang.String	dismissApproveUnitType;	//开除批准机构类别
	private java.lang.String	dismissApproveUnitName;	//开除批准单位名称
	private java.lang.Long  	dismissApproveUnitOid;	//开除批准单位OID
	private java.lang.String	dismissApproveFileno;	//开除批准文号
	private java.util.Date  	dismissEffectDate;	//开除生效日期
	private java.lang.String	createdByCode;	//CreatedByCode
	private java.lang.String	createdByName;	//CreatedByName
	private java.util.Date  	createdDate;	//CreatedDate
	private java.lang.String	updatedByCode;	//UpdatedByCode
	private java.lang.String	updatedByName;	//UpdatedByName
	private java.util.Date  	updatedDate;	//UpdatedDate

	public PtDismissInfo() {
		
	}

	public void setPtDismissInfoOid(java.lang.Long ptDismissInfoOid){
		this.ptDismissInfoOid = ptDismissInfoOid;
	}

	public java.lang.Long getPtDismissInfoOid(){
		return this.ptDismissInfoOid;
	}

	public void setBizPersonOid(java.lang.Long bizPersonOid){
		this.bizPersonOid = bizPersonOid;
	}

	public java.lang.Long getBizPersonOid(){
		return this.bizPersonOid;
	}

	public void setDismissReason(java.lang.String dismissReason){
		this.dismissReason = dismissReason;
	}

	public java.lang.String getDismissReason(){
		return this.dismissReason;
	}

	public void setDismissApproveUnitType(java.lang.String dismissApproveUnitType){
		this.dismissApproveUnitType = dismissApproveUnitType;
	}

	public java.lang.String getDismissApproveUnitType(){
		return this.dismissApproveUnitType;
	}

	public void setDismissApproveUnitName(java.lang.String dismissApproveUnitName){
		this.dismissApproveUnitName = dismissApproveUnitName;
	}

	public java.lang.String getDismissApproveUnitName(){
		return this.dismissApproveUnitName;
	}

	public void setDismissApproveUnitOid(java.lang.Long dismissApproveUnitOid){
		this.dismissApproveUnitOid = dismissApproveUnitOid;
	}

	public java.lang.Long getDismissApproveUnitOid(){
		return this.dismissApproveUnitOid;
	}

	public void setDismissApproveFileno(java.lang.String dismissApproveFileno){
		this.dismissApproveFileno = dismissApproveFileno;
	}

	public java.lang.String getDismissApproveFileno(){
		return this.dismissApproveFileno;
	}

	public void setDismissEffectDate(java.util.Date dismissEffectDate){
		this.dismissEffectDate = dismissEffectDate;
	}

	public java.util.Date getDismissEffectDate(){
		return this.dismissEffectDate;
	}

	public void setCreatedByCode(java.lang.String createdByCode){
		this.createdByCode = createdByCode;
	}

	public java.lang.String getCreatedByCode(){
		return this.createdByCode;
	}

	public void setCreatedByName(java.lang.String createdByName){
		this.createdByName = createdByName;
	}

	public java.lang.String getCreatedByName(){
		return this.createdByName;
	}

	public void setCreatedDate(java.util.Date createdDate){
		this.createdDate = createdDate;
	}

	public java.util.Date getCreatedDate(){
		return this.createdDate;
	}

	public void setUpdatedByCode(java.lang.String updatedByCode){
		this.updatedByCode = updatedByCode;
	}

	public java.lang.String getUpdatedByCode(){
		return this.updatedByCode;
	}

	public void setUpdatedByName(java.lang.String updatedByName){
		this.updatedByName = updatedByName;
	}

	public java.lang.String getUpdatedByName(){
		return this.updatedByName;
	}

	public void setUpdatedDate(java.util.Date updatedDate){
		this.updatedDate = updatedDate;
	}

	public java.util.Date getUpdatedDate(){
		return this.updatedDate;
	}

}