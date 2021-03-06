
package com.yh.hr.info.ver.unit.person.web.form;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.yh.platform.core.util.DateUtil;

public class VerPbPersonInfoForm extends ValidatorForm {
	private static final long serialVersionUID = 110119120L;

	private java.lang.Long personOid;        //人员oid
	private java.lang.String name;        //姓名
	private java.lang.String idCode;        //有效证件类别
	private java.lang.String idNo;        //证件号码
	private java.lang.String englishName;        //外文姓名
	private java.lang.String alternativeName;        //曾用名
	private java.lang.String sexCode;        //性别
	private java.util.Date birthday;        //出生日期
	private java.lang.String birthdayStr;        //出生日期
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
	private java.lang.String unitName;        //工作单位
	private java.lang.Long deptOid;        //工作部门
	private java.lang.String deptName;        //工作部门
	private java.lang.Long hireDeptOid;        //所在部门
	private java.lang.String hireDeptName;        //所在部门
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
	
	private FormFile image;//照片
    private java.lang.String levelCode;//护士层级

	private java.util.Date startWorkDate; //参加工作时间
	private java.lang.String startWorkDateStr;
	
    public VerPbPersonInfoForm() {}
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
	
    public java.lang.String getdPositionType() {
		return dPositionType;
	}

	public void setdPositionType(java.lang.String dPositionType) {
		this.dPositionType = dPositionType;
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
		if(null != birthday){
			this.birthdayStr = DateUtil.formatDate(birthday);
         }
	}

	public java.util.Date getBirthday(){
		return this.birthday;
	}
    public void setBirthdayStr(String birthdayStr){
        this.birthdayStr = birthdayStr;
        if(StringUtils.isNotEmpty(birthdayStr)){
               this.birthday = DateUtil.parseDate(birthdayStr);
        }
    }

    public String getBirthdayStr(){
        return this.birthdayStr;
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

	public java.lang.String getUnitName() {
		return unitName;
	}

	public void setUnitName(java.lang.String unitName) {
		this.unitName = unitName;
	}

	public void setDeptOid(java.lang.Long deptOid){
		this.deptOid = deptOid;
	}

	public java.lang.Long getDeptOid(){
		return this.deptOid;
	}
   
	public java.lang.String getDeptName() {
		return deptName;
	}

	public void setDeptName(java.lang.String deptName) {
		this.deptName = deptName;
	}

	public java.lang.String getHireDeptName() {
		return hireDeptName;
	}

	public void setHireDeptName(java.lang.String hireDeptName) {
		this.hireDeptName = hireDeptName;
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

	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}
    public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}

	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUpdateBy(java.lang.String updateBy) {
		this.updateBy = updateBy;
	}

	public FormFile getImage() {
		return image;
	}

	public void setImage(FormFile image) {
		this.image = image;
	}
	//人员附属表信息
	 /**
    *是否双肩挑
    **/
	private java.lang.String isTwoDuty;
   /**
    *主岗位名称
    **/
	private java.lang.String mPositionName;
   /**
    *现聘岗位类别（主）YHRS0022
    **/
	private java.lang.String mPositionType;
   /**
    *现聘岗位级别（主）YHRS0023
    **/
	private java.lang.String mPositionLevel;
   /**
    *现聘岗位级别起始时间（主）
    **/
	private java.util.Date mPositionLevelDate;
	private java.lang.String mPositionLevelDateStr;
   /**
    *辅岗位名称
    **/
	private java.lang.String sPositionName;
   /**
    *现聘岗位类别（副）YHRS0022
    **/
	private java.lang.String sPositionType;
   /**
    *现聘岗位级别（副）YHRS0023
    **/
	private java.lang.String sPositionLevel;
   /**
    *现聘岗位级别起始时间（副）
    **/
	private java.util.Date sPositionLevelDate;
	private java.lang.String sPositionLevelDateStr;
   /**
    *全日制最高学校名称
    **/
	private java.lang.String ftSchoolName;
   /**
    *全日制最高专业名称
    **/
	private java.lang.String ftMajorName;
   /**
    *全日制最高学历代码YHRS0039
    **/
	private java.lang.String ftEducationLevelCode;
   /**
    *全日制最高学位代码YHRS0040
    **/
	private java.lang.String ftDegreeCode;
   /**
    *在职最高学校名称
    **/
	private java.lang.String ojSchoolName;
   /**
    *在职最高专业名称
    **/
	private java.lang.String ojMajorName;
   /**
    *在职最高学历代码YHRS0039
    **/
	private java.lang.String ojEducationLevelCode;
   /**
    *在职最高学位代码YHRS0040
    **/
	private java.lang.String ojDegreeCode;
   /**
    *专业技术资格证书编号
    **/
	private java.lang.String profCertificateNo;
   /**
    *专业技术资格名称
    **/
	private java.lang.String profTechName;
   /**
    *专业技术资格等级
    **/
	private java.lang.String profTechLevel;
   /**
    *职务级别起始时间
    **/
	private java.lang.String specialityName;
   /**
    *专业技术资格取得日期
    **/
	private java.util.Date profProcureDate;
	private java.lang.String profProcureDateStr;
   /**
    *职业资格证书编号
    **/
	private java.lang.String certificateNo;
   /**
    *职业资格名称
    **/
	private java.lang.String qualificationsName;
   /**
    *职（执）业资格等级
    **/
	private java.lang.String qualificationsLevelCode;
   /**
    *职业（工种）名称
    **/
	private java.lang.String skillWorkCode;
   /**
    *职业资格取得日期
    **/
	private java.util.Date procureDate;
	private java.lang.String procureDateStr;
   /**
    *政治面貌
    **/
	private java.lang.String politicStatusCode;
   /**
    *岗位类别
    **/
	private java.lang.String hisPositionType;
   /**
    *岗位级别
    **/
	private java.lang.String hisPositionLevel;
   /**
    *岗位名称
    **/
	private java.lang.String hisPositionName;
   /**
    *岗位聘任开始时间
    **/
	private java.util.Date hisBeginDate;
	private java.lang.String hisBeginDateStr;
	/**
	 * 执业资格类型
	 */
	private java.lang.String qualificationsType;
	
	/**
     * 现任职务
     **/
	private java.lang.String dutyName;
	/**
     * 现任职务开始时间
     **/
	private java.util.Date startDate;
	private java.lang.String startDateStr;
	/**
     * 现任职务所在部门
     **/
	private java.lang.Long dutyDeptOid;
	private java.lang.String dutyDeptName;
	
	public java.lang.String getQualificationsType() {
		return qualificationsType;
	}
	public void setQualificationsType(java.lang.String qualificationsType) {
		this.qualificationsType = qualificationsType;
	}
	public java.lang.String getIsTwoDuty() {
		return isTwoDuty;
	}
	public void setIsTwoDuty(java.lang.String isTwoDuty) {
		this.isTwoDuty = isTwoDuty;
	}
	public java.lang.String getmPositionName() {
		return mPositionName;
	}
	public void setmPositionName(java.lang.String mPositionName) {
		this.mPositionName = mPositionName;
	}
	public java.lang.String getmPositionType() {
		return mPositionType;
	}
	public void setmPositionType(java.lang.String mPositionType) {
		this.mPositionType = mPositionType;
	}
	public java.lang.String getmPositionLevel() {
		return mPositionLevel;
	}
	public void setmPositionLevel(java.lang.String mPositionLevel) {
		this.mPositionLevel = mPositionLevel;
	}
	public java.util.Date getmPositionLevelDate() {
		return mPositionLevelDate;
	}
	public void setmPositionLevelDate(java.util.Date mPositionLevelDate) {
		this.mPositionLevelDate = mPositionLevelDate;
		if(null != mPositionLevelDate){
			this.mPositionLevelDateStr = DateUtil.formatDate(mPositionLevelDate);
         }
	}
	public java.lang.String getmPositionLevelDateStr() {
		return mPositionLevelDateStr;
	}
	public void setmPositionLevelDateStr(java.lang.String mPositionLevelDateStr) {
		this.mPositionLevelDateStr = mPositionLevelDateStr;
		if(StringUtils.isNotEmpty(mPositionLevelDateStr)){
            this.mPositionLevelDate = DateUtil.parseDate(mPositionLevelDateStr);
     }
	}
	public java.lang.String getsPositionName() {
		return sPositionName;
	}
	public void setsPositionName(java.lang.String sPositionName) {
		this.sPositionName = sPositionName;
	}
	public java.lang.String getsPositionType() {
		return sPositionType;
	}
	public void setsPositionType(java.lang.String sPositionType) {
		this.sPositionType = sPositionType;
	}
	public java.lang.String getsPositionLevel() {
		return sPositionLevel;
	}
	public void setsPositionLevel(java.lang.String sPositionLevel) {
		this.sPositionLevel = sPositionLevel;
	}
	public java.util.Date getsPositionLevelDate() {
		return sPositionLevelDate;
	}
	public void setsPositionLevelDate(java.util.Date sPositionLevelDate) {
		this.sPositionLevelDate = sPositionLevelDate;
		if(null != sPositionLevelDate){
			this.sPositionLevelDateStr = DateUtil.formatDate(sPositionLevelDate);
         }
	}
	public java.lang.String getsPositionLevelDateStr() {
		return sPositionLevelDateStr;
	}
	public void setsPositionLevelDateStr(java.lang.String sPositionLevelDateStr) {
		this.sPositionLevelDateStr = sPositionLevelDateStr;
		if(StringUtils.isNotEmpty(sPositionLevelDateStr)){
            this.sPositionLevelDate = DateUtil.parseDate(sPositionLevelDateStr);
     }
	}
	public java.lang.String getFtSchoolName() {
		return ftSchoolName;
	}
	public void setFtSchoolName(java.lang.String ftSchoolName) {
		this.ftSchoolName = ftSchoolName;
	}
	public java.lang.String getFtMajorName() {
		return ftMajorName;
	}
	public void setFtMajorName(java.lang.String ftMajorName) {
		this.ftMajorName = ftMajorName;
	}
	public java.lang.String getFtEducationLevelCode() {
		return ftEducationLevelCode;
	}
	public void setFtEducationLevelCode(java.lang.String ftEducationLevelCode) {
		this.ftEducationLevelCode = ftEducationLevelCode;
	}
	public java.lang.String getFtDegreeCode() {
		return ftDegreeCode;
	}
	public void setFtDegreeCode(java.lang.String ftDegreeCode) {
		this.ftDegreeCode = ftDegreeCode;
	}
	public java.lang.String getOjSchoolName() {
		return ojSchoolName;
	}
	public void setOjSchoolName(java.lang.String ojSchoolName) {
		this.ojSchoolName = ojSchoolName;
	}
	public java.lang.String getOjMajorName() {
		return ojMajorName;
	}
	public void setOjMajorName(java.lang.String ojMajorName) {
		this.ojMajorName = ojMajorName;
	}
	public java.lang.String getOjEducationLevelCode() {
		return ojEducationLevelCode;
	}
	public void setOjEducationLevelCode(java.lang.String ojEducationLevelCode) {
		this.ojEducationLevelCode = ojEducationLevelCode;
	}
	public java.lang.String getOjDegreeCode() {
		return ojDegreeCode;
	}
	public void setOjDegreeCode(java.lang.String ojDegreeCode) {
		this.ojDegreeCode = ojDegreeCode;
	}
	public java.lang.String getProfCertificateNo() {
		return profCertificateNo;
	}
	public void setProfCertificateNo(java.lang.String profCertificateNo) {
		this.profCertificateNo = profCertificateNo;
	}
	public java.lang.String getProfTechName() {
		return profTechName;
	}
	public void setProfTechName(java.lang.String profTechName) {
		this.profTechName = profTechName;
	}
	public java.lang.String getProfTechLevel() {
		return profTechLevel;
	}
	public void setProfTechLevel(java.lang.String profTechLevel) {
		this.profTechLevel = profTechLevel;
	}
	public java.lang.String getSpecialityName() {
		return specialityName;
	}
	public void setSpecialityName(java.lang.String specialityName) {
		this.specialityName = specialityName;
	}
	public java.util.Date getProfProcureDate() {
		return profProcureDate;
	}
	public void setProfProcureDate(java.util.Date profProcureDate) {
		this.profProcureDate = profProcureDate;
		if(null != profProcureDate){
			this.profProcureDateStr = DateUtil.formatDate(profProcureDate);
         }
	}
	public java.lang.String getProfProcureDateStr() {
		return profProcureDateStr;
	}
	public void setProfProcureDateStr(java.lang.String profProcureDateStr) {
		this.profProcureDateStr = profProcureDateStr;
		if(StringUtils.isNotEmpty(profProcureDateStr)){
            this.profProcureDate = DateUtil.parseDate(profProcureDateStr);
     }
	}
	public java.lang.String getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(java.lang.String certificateNo) {
		this.certificateNo = certificateNo;
	}
	public java.lang.String getQualificationsName() {
		return qualificationsName;
	}
	public void setQualificationsName(java.lang.String qualificationsName) {
		this.qualificationsName = qualificationsName;
	}
	public java.lang.String getQualificationsLevelCode() {
		return qualificationsLevelCode;
	}
	public void setQualificationsLevelCode(java.lang.String qualificationsLevelCode) {
		this.qualificationsLevelCode = qualificationsLevelCode;
	}
	public java.lang.String getSkillWorkCode() {
		return skillWorkCode;
	}
	public void setSkillWorkCode(java.lang.String skillWorkCode) {
		this.skillWorkCode = skillWorkCode;
	}
	public java.util.Date getProcureDate() {
		return procureDate;
	}
	public void setProcureDate(java.util.Date procureDate) {
		this.procureDate = procureDate;
		if(null != procureDate){
			this.procureDateStr = DateUtil.formatDate(procureDate);
         }
	}
	public java.lang.String getProcureDateStr() {
		return procureDateStr;
	}
	public void setProcureDateStr(java.lang.String procureDateStr) {
		this.procureDateStr = procureDateStr;
		if(StringUtils.isNotEmpty(procureDateStr)){
            this.procureDate = DateUtil.parseDate(procureDateStr);
     }
	}
	public java.lang.String getPoliticStatusCode() {
		return politicStatusCode;
	}
	public void setPoliticStatusCode(java.lang.String politicStatusCode) {
		this.politicStatusCode = politicStatusCode;
	}
	public java.lang.String getHisPositionType() {
		return hisPositionType;
	}
	public void setHisPositionType(java.lang.String hisPositionType) {
		this.hisPositionType = hisPositionType;
	}
	public java.lang.String getHisPositionLevel() {
		return hisPositionLevel;
	}
	public void setHisPositionLevel(java.lang.String hisPositionLevel) {
		this.hisPositionLevel = hisPositionLevel;
	}
	public java.lang.String getHisPositionName() {
		return hisPositionName;
	}
	public void setHisPositionName(java.lang.String hisPositionName) {
		this.hisPositionName = hisPositionName;
	}
	public java.util.Date getHisBeginDate() {
		return hisBeginDate;
	}
	public void setHisBeginDate(java.util.Date hisBeginDate) {
		this.hisBeginDate = hisBeginDate;
		if(null != hisBeginDate){
			this.hisBeginDateStr = DateUtil.formatDate(hisBeginDate);
         }
	}
	public java.lang.String getHisBeginDateStr() {
		return hisBeginDateStr;
	}
	public void setHisBeginDateStr(java.lang.String hisBeginDateStr) {
		this.hisBeginDateStr = hisBeginDateStr;
		if(StringUtils.isNotEmpty(hisBeginDateStr)){
            this.hisBeginDate = DateUtil.parseDate(hisBeginDateStr);
     }
	}
	public java.lang.String getDutyName() {
		return dutyName;
	}
	public void setDutyName(java.lang.String dutyName) {
		this.dutyName = dutyName;
	}
	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
		if(null != startDate){
			this.startDateStr = DateUtil.formatDate(startDate);
         }
	}
	public java.lang.Long getDutyDeptOid() {
		return dutyDeptOid;
	}
	public void setDutyDeptOid(java.lang.Long dutyDeptOid) {
		this.dutyDeptOid = dutyDeptOid;
	}
	public void setDutyDeptName(java.lang.String dutyDeptName) {
		this.dutyDeptName = dutyDeptName;
	}
	public java.lang.String getDutyDeptName() {
		return dutyDeptName;
	}
	public void setStartDateStr(java.lang.String startDateStr) {
		this.startDateStr = startDateStr;
		if(StringUtils.isNotEmpty(startDateStr)){
            this.startDate = DateUtil.parseDate(startDateStr);
		}
	}
	public java.lang.String getStartDateStr() {
		return startDateStr;
	}
	public void setStartWorkDate(java.util.Date startWorkDate) {
		this.startWorkDate = startWorkDate;
		if(null != startWorkDate){
			this.startWorkDateStr = DateUtil.formatDate(startWorkDate);
         }
	}
	public java.util.Date getStartWorkDate() {
		return startWorkDate;
	}
	public void setStartWorkDateStr(java.lang.String startWorkDateStr) {
		this.startWorkDateStr = startWorkDateStr;
		if(StringUtils.isNotEmpty(startWorkDateStr)){
            this.startWorkDate = DateUtil.parseDate(startWorkDateStr);
     }
	}
	public java.lang.String getStartWorkDateStr() {
		return startWorkDateStr;
	}
}
