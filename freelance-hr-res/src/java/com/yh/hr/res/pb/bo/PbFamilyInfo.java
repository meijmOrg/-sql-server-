/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-09
**/
package com.yh.hr.res.pb.bo;

import com.yh.platform.core.bo.BaseBo;

public class PbFamilyInfo extends BaseBo {
	private static final long serialVersionUID = 2515516587055227706L;

    /**
     *主键
     **/
	private java.lang.Long familyOid;
    /**
     *PersonOid
     **/
	private java.lang.Long personOid;
    /**
     *成员姓名
     **/
	private java.lang.String name;
    /**
     *与本人关系
     **/
	private java.lang.String relationship;
    /**
     *证件类别
     **/
	private java.lang.String idType;
    /**
     *身份证号
     **/
	private java.lang.String idNo;
    /**
     *政治面貌
     **/
	private java.lang.String politicsVisage;
    /**
     *出生日期
     **/
	private java.util.Date birthday;
    /**
     *单位
     **/
	private java.lang.String unit;
    /**
     *职务
     **/
	private java.lang.String duty;
    /**
     *现住址
     **/
	private java.lang.String address;
    /**
     *联系电话
     **/
	private java.lang.String phone;
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

	public PbFamilyInfo() {}

    public PbFamilyInfo(java.lang.Long familyOid) {
        this.familyOid = familyOid;
    }

	public void setFamilyOid(java.lang.Long familyOid){
		this.familyOid = familyOid;
	}

	public java.lang.Long getFamilyOid(){
		return this.familyOid;
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

	public void setRelationship(java.lang.String relationship){
		this.relationship = relationship;
	}

	public java.lang.String getRelationship(){
		return this.relationship;
	}

	public void setIdType(java.lang.String idType){
		this.idType = idType;
	}

	public java.lang.String getIdType(){
		return this.idType;
	}

	public void setIdNo(java.lang.String idNo){
		this.idNo = idNo;
	}

	public java.lang.String getIdNo(){
		return this.idNo;
	}

	public void setPoliticsVisage(java.lang.String politicsVisage){
		this.politicsVisage = politicsVisage;
	}

	public java.lang.String getPoliticsVisage(){
		return this.politicsVisage;
	}

	public void setBirthday(java.util.Date birthday){
		this.birthday = birthday;
	}

	public java.util.Date getBirthday(){
		return this.birthday;
	}

	public void setUnit(java.lang.String unit){
		this.unit = unit;
	}

	public java.lang.String getUnit(){
		return this.unit;
	}

	public void setDuty(java.lang.String duty){
		this.duty = duty;
	}

	public java.lang.String getDuty(){
		return this.duty;
	}

	public void setAddress(java.lang.String address){
		this.address = address;
	}

	public java.lang.String getAddress(){
		return this.address;
	}

	public void setPhone(java.lang.String phone){
		this.phone = phone;
	}

	public java.lang.String getPhone(){
		return this.phone;
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
