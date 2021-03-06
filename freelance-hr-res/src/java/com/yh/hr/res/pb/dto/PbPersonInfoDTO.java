/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-10 
 */
package com.yh.hr.res.pb.dto;


public class PbPersonInfoDTO {

	private java.lang.Long personOid;        //人员oid
	private java.lang.String name;        //姓名
	private java.lang.String idCode;        //有效证件类别
	private java.lang.String idNo;        //证件号码
	private java.lang.String englishName;        //外文姓名
	private java.lang.String alternativeName;        //曾用名
	private java.lang.String sexCode;        //性别
	private java.util.Date birthday;        //出生日期
	private java.lang.String peopleCode;        //民族
	private java.lang.String nationalityCode;        //国籍
	private java.lang.String ancestorPlaceCode;        //籍贯
	private java.lang.String birthplaceCode;        //出生地
	private java.lang.String hukouPlace;        //户口所在地
	private java.lang.String isSz;        //是否本地户口
	private java.lang.String healthStatusCode;        //健康状况
	private java.lang.String marriageStatusCode;        //婚姻状况
	private java.lang.String address;        //家庭住址
	private java.lang.String email;        //个人Email地址
	private java.lang.String mobilePhone;        //手机号码
	private java.lang.String officePhone;        //办公电话
	private java.lang.Long unitOid;        //工作单位
	private java.lang.Long deptOid;        //工作部门
	private java.lang.Long hireDeptOid;        //HireDeptOid
	private java.lang.String personStatus;        //人员状态
	private java.lang.String personType;        //人员类别
	private java.lang.String flagOfHkmctwChineseCode;        //港澳台侨属标识
	private java.lang.String protTechFlag;        //是否专业技术人员标识
	private java.lang.String exportFlag;        //是否专家标志
	private java.lang.String doctorFlag;        //是否博士后研究人员
	private java.lang.String isAbordExpert;        //是否海外专家
	private java.lang.String isStudyAbordExpert;        //是否留学回国专家
	private java.lang.String isComesChinaExpert;        //是否来华定居专家
	private java.lang.String isVeteran;        //是否退役军人标识
	private java.lang.String isAllocation;        //是否军转安置干部
	private java.lang.String isCadre;        //是否干部身份
	private java.lang.String dPositionType;        //编制类型
	private java.lang.String bankpoll;        //经费形式
	private java.lang.Long personOrderView;        //人员排序号
	private java.lang.String emergContact;        //紧急联系人
	private java.lang.String emergPhone;        //紧急联系人手机号码
	private java.lang.String dispatchingUnitCode;        //所属劳务派遣公司
	private java.lang.String personCode;        //人员编号(工号)
	private java.lang.Long personIntOid;        //人员内码ID
	private java.lang.String createBy;        //创建人ID
	private java.lang.String createName;        //创建人名称
	private java.util.Date createDate;        //创建时间
	private java.lang.String updateBy;        //修改人ID
	private java.lang.String updateName;        //修改人名称
	private java.util.Date updateDate;        //修改时间
	/**
     *护士层级
     **/
	private java.lang.String levelCode;
	/** 参加工作时间 **/
	private java.util.Date startWorkDate;
	
    public java.lang.String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(java.lang.String levelCode) {
		this.levelCode = levelCode;
	}
	public void setPersonOid(java.lang.Long personOid){
		this.personOid = personOid;
	}

	public java.lang.Long getPersonOid(){
		return this.personOid;
	}
	public void setName(java.lang.String name){
		this.name = name;
	}

	public java.lang.String getName(){
		return this.name;
	}
	public void setIdCode(java.lang.String idCode){
		this.idCode = idCode;
	}

	public java.lang.String getIdCode(){
		return this.idCode;
	}
	public void setIdNo(java.lang.String idNo){
		this.idNo = idNo;
	}

	public java.lang.String getIdNo(){
		return this.idNo;
	}
	public void setEnglishName(java.lang.String englishName){
		this.englishName = englishName;
	}

	public java.lang.String getEnglishName(){
		return this.englishName;
	}
	public void setAlternativeName(java.lang.String alternativeName){
		this.alternativeName = alternativeName;
	}

	public java.lang.String getAlternativeName(){
		return this.alternativeName;
	}
	public void setSexCode(java.lang.String sexCode){
		this.sexCode = sexCode;
	}

	public java.lang.String getSexCode(){
		return this.sexCode;
	}
	public void setBirthday(java.util.Date birthday){
		this.birthday = birthday;
	}

	public java.util.Date getBirthday(){
		return this.birthday;
	}
	public void setPeopleCode(java.lang.String peopleCode){
		this.peopleCode = peopleCode;
	}

	public java.lang.String getPeopleCode(){
		return this.peopleCode;
	}
	public void setNationalityCode(java.lang.String nationalityCode){
		this.nationalityCode = nationalityCode;
	}

	public java.lang.String getNationalityCode(){
		return this.nationalityCode;
	}
	public void setAncestorPlaceCode(java.lang.String ancestorPlaceCode){
		this.ancestorPlaceCode = ancestorPlaceCode;
	}

	public java.lang.String getAncestorPlaceCode(){
		return this.ancestorPlaceCode;
	}
	public void setBirthplaceCode(java.lang.String birthplaceCode){
		this.birthplaceCode = birthplaceCode;
	}

	public java.lang.String getBirthplaceCode(){
		return this.birthplaceCode;
	}
	public void setHukouPlace(java.lang.String hukouPlace){
		this.hukouPlace = hukouPlace;
	}

	public java.lang.String getHukouPlace(){
		return this.hukouPlace;
	}
	public void setIsSz(java.lang.String isSz){
		this.isSz = isSz;
	}

	public java.lang.String getIsSz(){
		return this.isSz;
	}
	public void setHealthStatusCode(java.lang.String healthStatusCode){
		this.healthStatusCode = healthStatusCode;
	}

	public java.lang.String getHealthStatusCode(){
		return this.healthStatusCode;
	}
	public void setMarriageStatusCode(java.lang.String marriageStatusCode){
		this.marriageStatusCode = marriageStatusCode;
	}

	public java.lang.String getMarriageStatusCode(){
		return this.marriageStatusCode;
	}
	public void setAddress(java.lang.String address){
		this.address = address;
	}

	public java.lang.String getAddress(){
		return this.address;
	}
	public void setEmail(java.lang.String email){
		this.email = email;
	}

	public java.lang.String getEmail(){
		return this.email;
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
	public void setUnitOid(java.lang.Long unitOid){
		this.unitOid = unitOid;
	}

	public java.lang.Long getUnitOid(){
		return this.unitOid;
	}
	public void setDeptOid(java.lang.Long deptOid){
		this.deptOid = deptOid;
	}

	public java.lang.Long getDeptOid(){
		return this.deptOid;
	}
	public void setHireDeptOid(java.lang.Long hireDeptOid){
		this.hireDeptOid = hireDeptOid;
	}

	public java.lang.Long getHireDeptOid(){
		return this.hireDeptOid;
	}
	public void setPersonStatus(java.lang.String personStatus){
		this.personStatus = personStatus;
	}

	public java.lang.String getPersonStatus(){
		return this.personStatus;
	}
	public void setPersonType(java.lang.String personType){
		this.personType = personType;
	}

	public java.lang.String getPersonType(){
		return this.personType;
	}
	public void setFlagOfHkmctwChineseCode(java.lang.String flagOfHkmctwChineseCode){
		this.flagOfHkmctwChineseCode = flagOfHkmctwChineseCode;
	}

	public java.lang.String getFlagOfHkmctwChineseCode(){
		return this.flagOfHkmctwChineseCode;
	}
	public void setProtTechFlag(java.lang.String protTechFlag){
		this.protTechFlag = protTechFlag;
	}

	public java.lang.String getProtTechFlag(){
		return this.protTechFlag;
	}
	public void setExportFlag(java.lang.String exportFlag){
		this.exportFlag = exportFlag;
	}

	public java.lang.String getExportFlag(){
		return this.exportFlag;
	}
	public void setDoctorFlag(java.lang.String doctorFlag){
		this.doctorFlag = doctorFlag;
	}

	public java.lang.String getDoctorFlag(){
		return this.doctorFlag;
	}
	public void setIsAbordExpert(java.lang.String isAbordExpert){
		this.isAbordExpert = isAbordExpert;
	}

	public java.lang.String getIsAbordExpert(){
		return this.isAbordExpert;
	}
	public void setIsStudyAbordExpert(java.lang.String isStudyAbordExpert){
		this.isStudyAbordExpert = isStudyAbordExpert;
	}

	public java.lang.String getIsStudyAbordExpert(){
		return this.isStudyAbordExpert;
	}
	public void setIsComesChinaExpert(java.lang.String isComesChinaExpert){
		this.isComesChinaExpert = isComesChinaExpert;
	}

	public java.lang.String getIsComesChinaExpert(){
		return this.isComesChinaExpert;
	}
	public void setIsVeteran(java.lang.String isVeteran){
		this.isVeteran = isVeteran;
	}

	public java.lang.String getIsVeteran(){
		return this.isVeteran;
	}
	public void setIsAllocation(java.lang.String isAllocation){
		this.isAllocation = isAllocation;
	}

	public java.lang.String getIsAllocation(){
		return this.isAllocation;
	}
	public void setIsCadre(java.lang.String isCadre){
		this.isCadre = isCadre;
	}

	public java.lang.String getIsCadre(){
		return this.isCadre;
	}
	public java.lang.String getdPositionType() {
		return dPositionType;
	}
	public void setdPositionType(java.lang.String dPositionType) {
		this.dPositionType = dPositionType;
	}
	public void setBankpoll(java.lang.String bankpoll){
		this.bankpoll = bankpoll;
	}

	public java.lang.String getBankpoll(){
		return this.bankpoll;
	}
	public void setPersonOrderView(java.lang.Long personOrderView){
		this.personOrderView = personOrderView;
	}

	public java.lang.Long getPersonOrderView(){
		return this.personOrderView;
	}
	public void setEmergContact(java.lang.String emergContact){
		this.emergContact = emergContact;
	}

	public java.lang.String getEmergContact(){
		return this.emergContact;
	}
	public void setEmergPhone(java.lang.String emergPhone){
		this.emergPhone = emergPhone;
	}

	public java.lang.String getEmergPhone(){
		return this.emergPhone;
	}
	public void setDispatchingUnitCode(java.lang.String dispatchingUnitCode){
		this.dispatchingUnitCode = dispatchingUnitCode;
	}

	public java.lang.String getDispatchingUnitCode(){
		return this.dispatchingUnitCode;
	}
	public void setPersonCode(java.lang.String personCode){
		this.personCode = personCode;
	}

	public java.lang.String getPersonCode(){
		return this.personCode;
	}
	public void setPersonIntOid(java.lang.Long personIntOid){
		this.personIntOid = personIntOid;
	}

	public java.lang.Long getPersonIntOid(){
		return this.personIntOid;
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

	public void setStartWorkDate(java.util.Date startWorkDate) {
		this.startWorkDate = startWorkDate;
	}

	public java.util.Date getStartWorkDate() {
		return startWorkDate;
	}
}