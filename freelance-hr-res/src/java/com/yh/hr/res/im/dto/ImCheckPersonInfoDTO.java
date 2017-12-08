/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2017-07-15
**/
package com.yh.hr.res.im.dto;

public class ImCheckPersonInfoDTO {

	private java.lang.Long  	checkPersonInfoOid;	//主键OID
	private java.lang.Long  	importBatchOid;	//导入批次OID
	private java.lang.String	name;	//姓名
	private java.lang.Long  	hireDeptOid;	//所在科室OID
	private java.lang.String	hireDeptName;	//所在科室名称
	private java.lang.String	sexCode;	//性别
	private java.lang.String	sexCodeDesc;	//性别
	private java.lang.String	idNo;	//身份证号
	private java.util.Date  	birthday;	//出生日期
	private java.lang.String	personCode;	//工号
	private java.lang.String	personStatus;	//人员状态
	private java.lang.String	personStatusDesc;	//人员状态
	private java.lang.String	personType;	//人员类别
	private java.lang.String	personTypeDesc;	//人员类别
	private java.lang.String	peopleCode;	//民族
	private java.lang.String	peopleCodeDesc;	//民族
	private java.util.Date  	startWorkDate;	//参加工作时间
	private java.lang.String	marriageStatusCode;	//婚姻状况
	private java.lang.String	marriageStatusCodeDesc;	//婚姻状况
	private java.lang.String	isSz;	//是否本地户口
	private java.lang.String	isSzDesc;	//是否本地户口
	private java.lang.String	mobilePhone;	//手机号码
	private java.lang.String	officePhone;	//办公电话
	private java.lang.String	email;	//个人Email地址
	private java.lang.String	address;	//家庭住址
	private java.lang.String	hisPositionType;	//岗位类别
	private java.lang.String	hisPositionTypeDesc;	//岗位类别
	private java.lang.String	hisPositionName;	//岗位名称
	private java.lang.String	contractNo;	//合同编号
	private java.lang.String	contractType;	//合同签订方式
	private java.lang.String	contractTypeDesc;	//合同签订方式
	private java.lang.String	changeType;	//合同类型
	private java.lang.String	changeTypeDesc;	//合同类型
	private java.util.Date  	contractBegin;	//合同开始时间
	private java.util.Date  	contractEnd;	//合同截止时间
	private java.lang.String	schoolName;	//学校名称
	private java.lang.String	majorCode;	//所学专业
	private java.lang.String	studyTypeCode;	//学习形式
	private java.lang.String	studyTypeCodeDesc;	//学习形式
	private java.lang.String	eduType;	//教育类别
	private java.lang.String	eduTypeDesc;	//教育类别
	private java.lang.String	educationCode;	//学历
	private java.lang.String	educationCodeDesc;	//学历
	private java.lang.String	degreeCode;	//学位
	private java.lang.String	degreeCodeDesc;	//学位
	private java.lang.String	profTechCode;	//专业技术资格名称
	private java.lang.String	profTechCodeDesc;	//专业技术资格名称
	private java.lang.String	profTechLevel;	//专业技术资格等级
	private java.lang.String	profTechLevelDesc;	//专业技术资格等级
	private java.util.Date  	profTechDate;	//取得专业技术资格日期
	private java.lang.String	qualificationsCode;	//职业资格名称
	private java.lang.String	qualificationsCodeDesc;	//职业资格名称
	private java.lang.String	qualificationsType;	//职业资格类型
	private java.lang.String	qualificationsTypeDesc;	//职业资格类型
	private java.lang.String	qualificationsLevelCode;	//职业资格等级
	private java.lang.String	qualificationsLevelCodeDesc;	//职业资格等级
	private java.util.Date  	qualificationsDate;	//取得职业资格日期
	private java.lang.String	certificateNo;	//执业注册证书编号
	private java.lang.String	approveOrganName;	//执业注册发证机构
	private java.util.Date  	issuedDate;	//执业注册签发日期
	private java.util.Date  	certificateBeginDate;	//执业注册日期
	private java.util.Date  	certificateEndDate;	//注册有效截止日期
	private java.lang.String	politicStatusCode;	//政治面貌
	private java.lang.String	politicStatusCodeDesc;	//政治面貌
	private java.util.Date  	joinPoliticDate;	//参加党派时间
	private java.util.Date  	entryCurrentUnitDate;	//进入本单位时间
	private java.util.Date  	outDate;	//离开本单位时间
	private java.util.Date  	retrieDate;	//离退休时间
	private java.util.Date  	deathDate;	//自然减员时间
	private java.lang.String	checkStatus;	//检查状态	1：通过	0：未通过

	public ImCheckPersonInfoDTO() {
		
	}

	public void setCheckPersonInfoOid(java.lang.Long checkPersonInfoOid){
		this.checkPersonInfoOid = checkPersonInfoOid;
	}

	public java.lang.Long getCheckPersonInfoOid(){
		return this.checkPersonInfoOid;
	}

	public void setImportBatchOid(java.lang.Long importBatchOid){
		this.importBatchOid = importBatchOid;
	}

	public java.lang.Long getImportBatchOid(){
		return this.importBatchOid;
	}

	public void setName(java.lang.String name){
		this.name = name;
	}

	public java.lang.String getName(){
		return this.name;
	}

	public void setHireDeptOid(java.lang.Long hireDeptOid){
		this.hireDeptOid = hireDeptOid;
	}

	public java.lang.Long getHireDeptOid(){
		return this.hireDeptOid;
	}

	public void setHireDeptName(java.lang.String hireDeptName){
		this.hireDeptName = hireDeptName;
	}

	public java.lang.String getHireDeptName(){
		return this.hireDeptName;
	}

	public void setSexCode(java.lang.String sexCode){
		this.sexCode = sexCode;
	}

	public java.lang.String getSexCode(){
		return this.sexCode;
	}

	public void setSexCodeDesc(java.lang.String sexCodeDesc){
		this.sexCodeDesc = sexCodeDesc;
	}

	public java.lang.String getSexCodeDesc(){
		return this.sexCodeDesc;
	}

	public void setIdNo(java.lang.String idNo){
		this.idNo = idNo;
	}

	public java.lang.String getIdNo(){
		return this.idNo;
	}

	public void setBirthday(java.util.Date birthday){
		this.birthday = birthday;
	}

	public java.util.Date getBirthday(){
		return this.birthday;
	}

	public void setPersonCode(java.lang.String personCode){
		this.personCode = personCode;
	}

	public java.lang.String getPersonCode(){
		return this.personCode;
	}

	public void setPersonStatus(java.lang.String personStatus){
		this.personStatus = personStatus;
	}

	public java.lang.String getPersonStatus(){
		return this.personStatus;
	}

	public void setPersonStatusDesc(java.lang.String personStatusDesc){
		this.personStatusDesc = personStatusDesc;
	}

	public java.lang.String getPersonStatusDesc(){
		return this.personStatusDesc;
	}

	public void setPersonType(java.lang.String personType){
		this.personType = personType;
	}

	public java.lang.String getPersonType(){
		return this.personType;
	}

	public void setPersonTypeDesc(java.lang.String personTypeDesc){
		this.personTypeDesc = personTypeDesc;
	}

	public java.lang.String getPersonTypeDesc(){
		return this.personTypeDesc;
	}

	public void setPeopleCode(java.lang.String peopleCode){
		this.peopleCode = peopleCode;
	}

	public java.lang.String getPeopleCode(){
		return this.peopleCode;
	}

	public void setPeopleCodeDesc(java.lang.String peopleCodeDesc){
		this.peopleCodeDesc = peopleCodeDesc;
	}

	public java.lang.String getPeopleCodeDesc(){
		return this.peopleCodeDesc;
	}

	public void setStartWorkDate(java.util.Date startWorkDate){
		this.startWorkDate = startWorkDate;
	}

	public java.util.Date getStartWorkDate(){
		return this.startWorkDate;
	}

	public void setMarriageStatusCode(java.lang.String marriageStatusCode){
		this.marriageStatusCode = marriageStatusCode;
	}

	public java.lang.String getMarriageStatusCode(){
		return this.marriageStatusCode;
	}

	public void setMarriageStatusCodeDesc(java.lang.String marriageStatusCodeDesc){
		this.marriageStatusCodeDesc = marriageStatusCodeDesc;
	}

	public java.lang.String getMarriageStatusCodeDesc(){
		return this.marriageStatusCodeDesc;
	}

	public void setIsSz(java.lang.String isSz){
		this.isSz = isSz;
	}

	public java.lang.String getIsSz(){
		return this.isSz;
	}

	public void setIsSzDesc(java.lang.String isSzDesc){
		this.isSzDesc = isSzDesc;
	}

	public java.lang.String getIsSzDesc(){
		return this.isSzDesc;
	}

	public void setMobilePhone(java.lang.String mobilePhone){
		this.mobilePhone = mobilePhone;
	}

	public java.lang.String getMobilePhone(){
		return this.mobilePhone;
	}

	public void setOfficePhone(java.lang.String officePhone){
		this.officePhone = officePhone;
	}

	public java.lang.String getOfficePhone(){
		return this.officePhone;
	}

	public void setEmail(java.lang.String email){
		this.email = email;
	}

	public java.lang.String getEmail(){
		return this.email;
	}

	public void setAddress(java.lang.String address){
		this.address = address;
	}

	public java.lang.String getAddress(){
		return this.address;
	}

	public void setHisPositionType(java.lang.String hisPositionType){
		this.hisPositionType = hisPositionType;
	}

	public java.lang.String getHisPositionType(){
		return this.hisPositionType;
	}

	public void setHisPositionTypeDesc(java.lang.String hisPositionTypeDesc){
		this.hisPositionTypeDesc = hisPositionTypeDesc;
	}

	public java.lang.String getHisPositionTypeDesc(){
		return this.hisPositionTypeDesc;
	}

	public void setHisPositionName(java.lang.String hisPositionName){
		this.hisPositionName = hisPositionName;
	}

	public java.lang.String getHisPositionName(){
		return this.hisPositionName;
	}

	public void setContractNo(java.lang.String contractNo){
		this.contractNo = contractNo;
	}

	public java.lang.String getContractNo(){
		return this.contractNo;
	}

	public void setContractType(java.lang.String contractType){
		this.contractType = contractType;
	}

	public java.lang.String getContractType(){
		return this.contractType;
	}

	public void setContractTypeDesc(java.lang.String contractTypeDesc){
		this.contractTypeDesc = contractTypeDesc;
	}

	public java.lang.String getContractTypeDesc(){
		return this.contractTypeDesc;
	}

	public void setChangeType(java.lang.String changeType){
		this.changeType = changeType;
	}

	public java.lang.String getChangeType(){
		return this.changeType;
	}

	public void setChangeTypeDesc(java.lang.String changeTypeDesc){
		this.changeTypeDesc = changeTypeDesc;
	}

	public java.lang.String getChangeTypeDesc(){
		return this.changeTypeDesc;
	}

	public void setContractBegin(java.util.Date contractBegin){
		this.contractBegin = contractBegin;
	}

	public java.util.Date getContractBegin(){
		return this.contractBegin;
	}

	public void setContractEnd(java.util.Date contractEnd){
		this.contractEnd = contractEnd;
	}

	public java.util.Date getContractEnd(){
		return this.contractEnd;
	}

	public void setSchoolName(java.lang.String schoolName){
		this.schoolName = schoolName;
	}

	public java.lang.String getSchoolName(){
		return this.schoolName;
	}

	public void setMajorCode(java.lang.String majorCode){
		this.majorCode = majorCode;
	}

	public java.lang.String getMajorCode(){
		return this.majorCode;
	}

	public void setStudyTypeCode(java.lang.String studyTypeCode){
		this.studyTypeCode = studyTypeCode;
	}

	public java.lang.String getStudyTypeCode(){
		return this.studyTypeCode;
	}

	public void setStudyTypeCodeDesc(java.lang.String studyTypeCodeDesc){
		this.studyTypeCodeDesc = studyTypeCodeDesc;
	}

	public java.lang.String getStudyTypeCodeDesc(){
		return this.studyTypeCodeDesc;
	}

	public void setEduType(java.lang.String eduType){
		this.eduType = eduType;
	}

	public java.lang.String getEduType(){
		return this.eduType;
	}

	public void setEduTypeDesc(java.lang.String eduTypeDesc){
		this.eduTypeDesc = eduTypeDesc;
	}

	public java.lang.String getEduTypeDesc(){
		return this.eduTypeDesc;
	}

	public void setEducationCode(java.lang.String educationCode){
		this.educationCode = educationCode;
	}

	public java.lang.String getEducationCode(){
		return this.educationCode;
	}

	public void setEducationCodeDesc(java.lang.String educationCodeDesc){
		this.educationCodeDesc = educationCodeDesc;
	}

	public java.lang.String getEducationCodeDesc(){
		return this.educationCodeDesc;
	}

	public void setDegreeCode(java.lang.String degreeCode){
		this.degreeCode = degreeCode;
	}

	public java.lang.String getDegreeCode(){
		return this.degreeCode;
	}

	public void setDegreeCodeDesc(java.lang.String degreeCodeDesc){
		this.degreeCodeDesc = degreeCodeDesc;
	}

	public java.lang.String getDegreeCodeDesc(){
		return this.degreeCodeDesc;
	}

	public void setProfTechCode(java.lang.String profTechCode){
		this.profTechCode = profTechCode;
	}

	public java.lang.String getProfTechCode(){
		return this.profTechCode;
	}

	public void setProfTechCodeDesc(java.lang.String profTechCodeDesc){
		this.profTechCodeDesc = profTechCodeDesc;
	}

	public java.lang.String getProfTechCodeDesc(){
		return this.profTechCodeDesc;
	}

	public void setProfTechLevel(java.lang.String profTechLevel){
		this.profTechLevel = profTechLevel;
	}

	public java.lang.String getProfTechLevel(){
		return this.profTechLevel;
	}

	public void setProfTechLevelDesc(java.lang.String profTechLevelDesc){
		this.profTechLevelDesc = profTechLevelDesc;
	}

	public java.lang.String getProfTechLevelDesc(){
		return this.profTechLevelDesc;
	}

	public void setProfTechDate(java.util.Date profTechDate){
		this.profTechDate = profTechDate;
	}

	public java.util.Date getProfTechDate(){
		return this.profTechDate;
	}

	public void setQualificationsCode(java.lang.String qualificationsCode){
		this.qualificationsCode = qualificationsCode;
	}

	public java.lang.String getQualificationsCode(){
		return this.qualificationsCode;
	}

	public void setQualificationsCodeDesc(java.lang.String qualificationsCodeDesc){
		this.qualificationsCodeDesc = qualificationsCodeDesc;
	}

	public java.lang.String getQualificationsCodeDesc(){
		return this.qualificationsCodeDesc;
	}

	public void setQualificationsType(java.lang.String qualificationsType){
		this.qualificationsType = qualificationsType;
	}

	public java.lang.String getQualificationsType(){
		return this.qualificationsType;
	}

	public void setQualificationsTypeDesc(java.lang.String qualificationsTypeDesc){
		this.qualificationsTypeDesc = qualificationsTypeDesc;
	}

	public java.lang.String getQualificationsTypeDesc(){
		return this.qualificationsTypeDesc;
	}

	public void setQualificationsLevelCode(java.lang.String qualificationsLevelCode){
		this.qualificationsLevelCode = qualificationsLevelCode;
	}

	public java.lang.String getQualificationsLevelCode(){
		return this.qualificationsLevelCode;
	}

	public void setQualificationsLevelCodeDesc(java.lang.String qualificationsLevelCodeDesc){
		this.qualificationsLevelCodeDesc = qualificationsLevelCodeDesc;
	}

	public java.lang.String getQualificationsLevelCodeDesc(){
		return this.qualificationsLevelCodeDesc;
	}

	public void setQualificationsDate(java.util.Date qualificationsDate){
		this.qualificationsDate = qualificationsDate;
	}

	public java.util.Date getQualificationsDate(){
		return this.qualificationsDate;
	}

	public void setCertificateNo(java.lang.String certificateNo){
		this.certificateNo = certificateNo;
	}

	public java.lang.String getCertificateNo(){
		return this.certificateNo;
	}

	public void setApproveOrganName(java.lang.String approveOrganName){
		this.approveOrganName = approveOrganName;
	}

	public java.lang.String getApproveOrganName(){
		return this.approveOrganName;
	}

	public void setIssuedDate(java.util.Date issuedDate){
		this.issuedDate = issuedDate;
	}

	public java.util.Date getIssuedDate(){
		return this.issuedDate;
	}

	public void setCertificateBeginDate(java.util.Date certificateBeginDate){
		this.certificateBeginDate = certificateBeginDate;
	}

	public java.util.Date getCertificateBeginDate(){
		return this.certificateBeginDate;
	}

	public void setCertificateEndDate(java.util.Date certificateEndDate){
		this.certificateEndDate = certificateEndDate;
	}

	public java.util.Date getCertificateEndDate(){
		return this.certificateEndDate;
	}

	public void setPoliticStatusCode(java.lang.String politicStatusCode){
		this.politicStatusCode = politicStatusCode;
	}

	public java.lang.String getPoliticStatusCode(){
		return this.politicStatusCode;
	}

	public void setPoliticStatusCodeDesc(java.lang.String politicStatusCodeDesc){
		this.politicStatusCodeDesc = politicStatusCodeDesc;
	}

	public java.lang.String getPoliticStatusCodeDesc(){
		return this.politicStatusCodeDesc;
	}

	public void setJoinPoliticDate(java.util.Date joinPoliticDate){
		this.joinPoliticDate = joinPoliticDate;
	}

	public java.util.Date getJoinPoliticDate(){
		return this.joinPoliticDate;
	}

	public void setEntryCurrentUnitDate(java.util.Date entryCurrentUnitDate){
		this.entryCurrentUnitDate = entryCurrentUnitDate;
	}

	public java.util.Date getEntryCurrentUnitDate(){
		return this.entryCurrentUnitDate;
	}

	public void setOutDate(java.util.Date outDate){
		this.outDate = outDate;
	}

	public java.util.Date getOutDate(){
		return this.outDate;
	}

	public void setRetrieDate(java.util.Date retrieDate){
		this.retrieDate = retrieDate;
	}

	public java.util.Date getRetrieDate(){
		return this.retrieDate;
	}

	public void setDeathDate(java.util.Date deathDate){
		this.deathDate = deathDate;
	}

	public java.util.Date getDeathDate(){
		return this.deathDate;
	}

	public void setCheckStatus(java.lang.String checkStatus){
		this.checkStatus = checkStatus;
	}

	public java.lang.String getCheckStatus(){
		return this.checkStatus;
	}

}
