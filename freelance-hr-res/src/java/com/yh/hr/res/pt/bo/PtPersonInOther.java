/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-10-26
**/
package com.yh.hr.res.pt.bo;

import com.yh.platform.core.bo.BaseBo;

public class PtPersonInOther extends BaseBo {
	private static final long serialVersionUID = 761164128082160815L;

	private java.lang.Long  	ptPersonInOtherOid;	//PtPersonInOtherOid
	private java.lang.Long  	bizPersonOid;	//BizPersonOid
	private java.lang.String	preExamineeType;	//PreExamineeType
	private java.lang.String    transferType;//调动类型
	private java.lang.String	transferReason;	//调动理由
	private java.lang.String    determinePostType;//定岗原因YHRS0115
	private java.lang.Long  	gradePointAverage;	//硕士期间平均成绩
	private java.lang.String  	postCode;	//岗位代码
	private java.lang.String	inChannel;//	求职（引进）渠道
	private java.lang.String    inReason;  //引进理由
	private java.lang.String  	postName;	//拟岗位名称
	private java.lang.String	hasProfTechInfo;//	是否有专业技术职称
	private java.lang.String    hasProfessionalInfo;  //是否有执业职格职称
	private java.lang.String    isGraduate;  //是否普通高校应届生
	private java.lang.String	cultureMode;//培养方式	
	private java.lang.String    examineeSource;  //生源YHRS0006
	private java.lang.String	createdBy;	//创建人
	private java.util.Date  	createdDate;	//创建时间
	private java.lang.String	updatedBy;	//修改人
	private java.util.Date  	updatedDate;	//修改时间
	

	public PtPersonInOther() {
		
	}

	public void setPtPersonInOtherOid(java.lang.Long ptPersonInOtherOid){
		this.ptPersonInOtherOid = ptPersonInOtherOid;
	}

	public java.lang.Long getPtPersonInOtherOid(){
		return this.ptPersonInOtherOid;
	}

	public void setBizPersonOid(java.lang.Long bizPersonOid){
		this.bizPersonOid = bizPersonOid;
	}

	public java.lang.Long getBizPersonOid(){
		return this.bizPersonOid;
	}

	public void setPreExamineeType(java.lang.String preExamineeType){
		this.preExamineeType = preExamineeType;
	}

	public java.lang.String getPreExamineeType(){
		return this.preExamineeType;
	}

	public void setTransferReason(java.lang.String transferReason){
		this.transferReason = transferReason;
	}

	public java.lang.String getTransferReason(){
		return this.transferReason;
	}

	public void setCreatedBy(java.lang.String createdBy){
		this.createdBy = createdBy;
	}

	public java.lang.String getCreatedBy(){
		return this.createdBy;
	}

	public void setCreatedDate(java.util.Date createdDate){
		this.createdDate = createdDate;
	}

	public java.util.Date getCreatedDate(){
		return this.createdDate;
	}

	public void setUpdatedBy(java.lang.String updatedBy){
		this.updatedBy = updatedBy;
	}

	public java.lang.String getUpdatedBy(){
		return this.updatedBy;
	}

	public void setUpdatedDate(java.util.Date updatedDate){
		this.updatedDate = updatedDate;
	}

	public java.util.Date getUpdatedDate(){
		return this.updatedDate;
	}

	public java.lang.String getTransferType() {
		return transferType;
	}

	public void setTransferType(java.lang.String transferType) {
		this.transferType = transferType;
	}

	public java.lang.String getDeterminePostType() {
		return determinePostType;
	}

	public void setDeterminePostType(java.lang.String determinePostType) {
		this.determinePostType = determinePostType;
	}

	public java.lang.Long getGradePointAverage() {
		return gradePointAverage;
	}

	public java.lang.String getInChannel() {
		return inChannel;
	}

	public java.lang.String getInReason() {
		return inReason;
	}

	public void setGradePointAverage(java.lang.Long gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}

	public void setInChannel(java.lang.String inChannel) {
		this.inChannel = inChannel;
	}

	public void setInReason(java.lang.String inReason) {
		this.inReason = inReason;
	}

	public java.lang.String getPostCode() {
		return postCode;
	}

	public void setPostCode(java.lang.String postCode) {
		this.postCode = postCode;
	}

	public java.lang.String getPostName() {
		return postName;
	}

	public java.lang.String getHasProfTechInfo() {
		return hasProfTechInfo;
	}

	public java.lang.String getHasProfessionalInfo() {
		return hasProfessionalInfo;
	}

	public void setPostName(java.lang.String postName) {
		this.postName = postName;
	}

	public void setHasProfTechInfo(java.lang.String hasProfTechInfo) {
		this.hasProfTechInfo = hasProfTechInfo;
	}

	public void setHasProfessionalInfo(java.lang.String hasProfessionalInfo) {
		this.hasProfessionalInfo = hasProfessionalInfo;
	}

	public java.lang.String getIsGraduate() {
		return isGraduate;
	}

	public void setIsGraduate(java.lang.String isGraduate) {
		this.isGraduate = isGraduate;
	}

	public java.lang.String getCultureMode() {
		return cultureMode;
	}

	public java.lang.String getExamineeSource() {
		return examineeSource;
	}

	public void setCultureMode(java.lang.String cultureMode) {
		this.cultureMode = cultureMode;
	}

	public void setExamineeSource(java.lang.String examineeSource) {
		this.examineeSource = examineeSource;
	}
}
