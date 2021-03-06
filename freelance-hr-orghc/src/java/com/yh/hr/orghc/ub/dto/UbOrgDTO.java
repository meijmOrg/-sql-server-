/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-09-02
**/
package com.yh.hr.orghc.ub.dto;

public class UbOrgDTO {

	private java.lang.Long  	orgOid;	//OrgOid
	private java.lang.Long  	unitOid;	//单位OID
	private java.lang.String	orgName;	//OrgName
	private java.lang.Long  	parentOrgOid;	//上级内设机构
	private java.lang.String	orgType;	//内设机构类型YHRS0102
	private java.lang.String	secondNameWork;	//第二名称(合署办公)
	private java.lang.String	secondNameShow;	//第二名称（挂牌）
	private java.lang.String	branchTypeCode;	//内设机构编码（中编办）YHRS0094
	private java.lang.String	levelCode;	//内设机构级别YHRS0093
	private java.util.Date  	establishedDate;	//成立时间
	private java.util.Date  	cancelDate;	//撤销日期
	private java.lang.String	orgFunction;	//机构职能
	private java.lang.String	orgStatus;	//机构状态
	private java.lang.String	orderOfView;	//排序号
	private java.lang.String	orderOfAll;	//全局排序
	private java.lang.String	contacter;	//联系人
	private java.lang.String	mobilePhone;	//手机
	private java.lang.String	email;	//电子邮箱
	private java.lang.String	phone;	//联系电话
	private java.lang.String	fax;	//传真
	private java.lang.String	address;//地址
	private java.lang.String	remark;	//备注
	private java.lang.String	createdByCode;	//CreatedByCode
	private java.lang.String	createdByName;	//CreatedByName
	private java.util.Date  	createdDate;	//CreatedDate
	private java.lang.String	updatedByCode;	//UpdatedByCode
	private java.lang.String	updatedByName;	//UpdatedByName
	private java.util.Date  	updatedDate;	//UpdatedDate
	
	private java.lang.String	hierarchyCode;	//层级编码
	private java.lang.String    orgCategory;//所属科室类型YHRS0102


	public UbOrgDTO() {
		
	}

	public void setOrgOid(java.lang.Long orgOid){
		this.orgOid = orgOid;
	}

	public java.lang.Long getOrgOid(){
		return this.orgOid;
	}

	public void setUnitOid(java.lang.Long unitOid){
		this.unitOid = unitOid;
	}

	public java.lang.Long getUnitOid(){
		return this.unitOid;
	}

	public void setOrgName(java.lang.String orgName){
		this.orgName = orgName;
	}

	public java.lang.String getOrgName(){
		return this.orgName;
	}

	public void setParentOrgOid(java.lang.Long parentOrgOid){
		this.parentOrgOid = parentOrgOid;
	}

	public java.lang.Long getParentOrgOid(){
		return this.parentOrgOid;
	}

	public void setOrgType(java.lang.String orgType){
		this.orgType = orgType;
	}

	public java.lang.String getOrgType(){
		return this.orgType;
	}

	public void setSecondNameWork(java.lang.String secondNameWork){
		this.secondNameWork = secondNameWork;
	}

	public java.lang.String getSecondNameWork(){
		return this.secondNameWork;
	}

	public void setSecondNameShow(java.lang.String secondNameShow){
		this.secondNameShow = secondNameShow;
	}

	public java.lang.String getSecondNameShow(){
		return this.secondNameShow;
	}

	public void setBranchTypeCode(java.lang.String branchTypeCode){
		this.branchTypeCode = branchTypeCode;
	}

	public java.lang.String getBranchTypeCode(){
		return this.branchTypeCode;
	}

	public void setLevelCode(java.lang.String levelCode){
		this.levelCode = levelCode;
	}

	public java.lang.String getLevelCode(){
		return this.levelCode;
	}

	public void setEstablishedDate(java.util.Date establishedDate){
		this.establishedDate = establishedDate;
	}

	public java.util.Date getEstablishedDate(){
		return this.establishedDate;
	}

	public void setCancelDate(java.util.Date cancelDate){
		this.cancelDate = cancelDate;
	}

	public java.util.Date getCancelDate(){
		return this.cancelDate;
	}

	public void setOrgFunction(java.lang.String orgFunction){
		this.orgFunction = orgFunction;
	}

	public java.lang.String getOrgFunction(){
		return this.orgFunction;
	}

	public void setOrgStatus(java.lang.String orgStatus){
		this.orgStatus = orgStatus;
	}

	public java.lang.String getOrgStatus(){
		return this.orgStatus;
	}

	public void setOrderOfView(java.lang.String orderOfView){
		this.orderOfView = orderOfView;
	}

	public java.lang.String getOrderOfView(){
		return this.orderOfView;
	}

	public void setOrderOfAll(java.lang.String orderOfAll){
		this.orderOfAll = orderOfAll;
	}

	public java.lang.String getOrderOfAll(){
		return this.orderOfAll;
	}

	public java.lang.String getContacter() {
		return contacter;
	}

	public void setContacter(java.lang.String contacter) {
		this.contacter = contacter;
	}

	public java.lang.String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(java.lang.String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhone() {
		return phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.String getFax() {
		return fax;
	}

	public void setFax(java.lang.String fax) {
		this.fax = fax;
	}

	public java.lang.String getAddress() {
		return address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}

	public java.lang.String getRemark(){
		return this.remark;
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

	public java.lang.String getHierarchyCode() {
		return hierarchyCode;
	}

	public void setHierarchyCode(java.lang.String hierarchyCode) {
		this.hierarchyCode = hierarchyCode;
	}

	public java.lang.String getOrgCategory() {
		return orgCategory;
	}

	public void setOrgCategory(java.lang.String orgCategory) {
		this.orgCategory = orgCategory;
	}

}
