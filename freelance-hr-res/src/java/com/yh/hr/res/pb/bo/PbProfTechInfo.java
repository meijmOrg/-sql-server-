/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-08-15
**/
package com.yh.hr.res.pb.bo;

import com.yh.platform.core.bo.BaseBo;

public class PbProfTechInfo extends BaseBo {
	private static final long serialVersionUID = 6449682653187162095L;
	/**
     *主键
     **/
	private java.lang.Long profTechOid;
    /**
     *PersonOid
     **/
	private java.lang.Long personOid;
    /**
     *资格证书编号
     **/
	private java.lang.String certificateNo;
    /**
     *专业技术资格名称
     **/
	private java.lang.String profTechName;
    /**
     *专业技术资格等级YHRS0047
     **/
	private java.lang.String profTechLevel;
    /**
     *专业名称
     **/
	private java.lang.String specialityName;
    /**
     *取得资格日期
     **/
	private java.util.Date procureDate;
    /**
     *资格截止日期
     **/
	private java.util.Date validityDate;
    /**
     *取得资格途径YHRS0048
     **/
	private java.lang.String acquireApproachCode;
    /**
     *其他取得途径
     **/
	private java.lang.String acquireApproachOther;
    /**
     *发证机构名称
     **/
	private java.lang.String issueOrgan;
    /**
     *是否经过本省/市人力资源（人事）部门核准或认定YHRS0003
     **/
	private java.lang.String isApprove;
    /**
     *资格审批机构名称
     **/
	private java.lang.String approveOrganName;
    /**
     *是否当前最高专业技术资格等级YHRS0003
     **/
	private java.lang.String isHighestLevel;
    /**
     *CreatedByCode
     **/
	private java.lang.String createdByCode;
    /**
     *CreatedByName
     **/
	private java.lang.String createdByName;
    /**
     *CreatedDate
     **/
	private java.util.Date createdDate;
    /**
     *UpdatedByCode
     **/
	private java.lang.String updatedByCode;
    /**
     *UpdatedByName
     **/
	private java.lang.String updatedByName;
    /**
     *UpdatedDate
     **/
	private java.util.Date updatedDate;

	public PbProfTechInfo() {
		
	}
/**
* public JhcPbProfTechInfo(java.lang.Long profTechOid) {
*  *       this.profTechOid = profTechOid;
**   }
**/
	public void setProfTechOid(java.lang.Long profTechOid){
		this.profTechOid = profTechOid;
	}

	public java.lang.Long getProfTechOid(){
		return this.profTechOid;
	}

	public void setPersonOid(java.lang.Long personOid){
		this.personOid = personOid;
	}

	public java.lang.Long getPersonOid(){
		return this.personOid;
	}

	public void setCertificateNo(java.lang.String certificateNo){
		this.certificateNo = certificateNo;
	}

	public java.lang.String getCertificateNo(){
		return this.certificateNo;
	}

	public void setProfTechName(java.lang.String profTechName){
		this.profTechName = profTechName;
	}

	public java.lang.String getProfTechName(){
		return this.profTechName;
	}

	public void setProfTechLevel(java.lang.String profTechLevel){
		this.profTechLevel = profTechLevel;
	}

	public java.lang.String getProfTechLevel(){
		return this.profTechLevel;
	}

	public void setSpecialityName(java.lang.String specialityName){
		this.specialityName = specialityName;
	}

	public java.lang.String getSpecialityName(){
		return this.specialityName;
	}

	public void setProcureDate(java.util.Date procureDate){
		this.procureDate = procureDate;
	}

	public java.util.Date getProcureDate(){
		return this.procureDate;
	}

	public void setValidityDate(java.util.Date validityDate){
		this.validityDate = validityDate;
	}

	public java.util.Date getValidityDate(){
		return this.validityDate;
	}

	public void setAcquireApproachCode(java.lang.String acquireApproachCode){
		this.acquireApproachCode = acquireApproachCode;
	}

	public java.lang.String getAcquireApproachCode(){
		return this.acquireApproachCode;
	}

	public void setAcquireApproachOther(java.lang.String acquireApproachOther){
		this.acquireApproachOther = acquireApproachOther;
	}

	public java.lang.String getAcquireApproachOther(){
		return this.acquireApproachOther;
	}

	public void setIssueOrgan(java.lang.String issueOrgan){
		this.issueOrgan = issueOrgan;
	}

	public java.lang.String getIssueOrgan(){
		return this.issueOrgan;
	}

	public void setIsApprove(java.lang.String isApprove){
		this.isApprove = isApprove;
	}

	public java.lang.String getIsApprove(){
		return this.isApprove;
	}

	public void setApproveOrganName(java.lang.String approveOrganName){
		this.approveOrganName = approveOrganName;
	}

	public java.lang.String getApproveOrganName(){
		return this.approveOrganName;
	}

	public void setIsHighestLevel(java.lang.String isHighestLevel){
		this.isHighestLevel = isHighestLevel;
	}

	public java.lang.String getIsHighestLevel(){
		return this.isHighestLevel;
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
