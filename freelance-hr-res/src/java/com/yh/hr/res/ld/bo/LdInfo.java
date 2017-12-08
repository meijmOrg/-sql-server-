/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-08-22
**/
package com.yh.hr.res.ld.bo;

import com.yh.platform.core.bo.BaseBo;

public class LdInfo extends BaseBo {
	private static final long serialVersionUID = 2515516587055227706L;

    /**
     *主键
     **/
	private java.lang.Long infoOid;
    /**
     *1、冻结解冻；2、锁定解锁；3、占用释放
     **/
	private java.lang.String infoType;
    /**
     *单位OID
     **/
	private java.lang.Long unitOid;
    /**
     *单位名称
     **/
	private java.lang.String unitName;
    /**
     *使用类型：1、业务人员；2、其他
     **/
	private java.lang.String refType;
    /**
     *来源OID
     **/
	private java.lang.Long refOid;
    /**
     *来源描述
     **/
	private java.lang.String refDesc;
    /**
     *职务属性代码
     **/
	private java.lang.String dutyAttribute;
    /**
     *职务属性名称
     **/
	private java.lang.String dutyAttributeName;
    /**
     *职务层次代码
     **/
	private java.lang.String dutyLevel;
    /**
     *职务层次名称
     **/
	private java.lang.String dutyLevelName;
    /**
     *数量
     **/
	private java.lang.Long count;
    /**
     *开始日期
     **/
	private java.util.Date beginDate;
    /**
     *截止日期
     **/
	private java.util.Date endDate;
    /**
     *状态：4、冻结；5、解冻
     **/
	private java.lang.String status;
    /**
     *创建人Code
     **/
	private java.lang.String createdByCode;
    /**
     *创建人名称
     **/
	private java.lang.String createdByName;
    /**
     *创建日期
     **/
	private java.util.Date createdDate;
    /**
     *修改人Code
     **/
	private java.lang.String updatedByCode;
    /**
     *修改人名称
     **/
	private java.lang.String updatedByName;
    /**
     *修改日期
     **/
	private java.util.Date updatedDate;

	public LdInfo() {}

    public LdInfo(java.lang.Long infoOid) {
        this.infoOid = infoOid;
    }

	public void setInfoOid(java.lang.Long infoOid){
		this.infoOid = infoOid;
	}

	public java.lang.Long getInfoOid(){
		return this.infoOid;
	}

	public void setInfoType(java.lang.String infoType){
		this.infoType = infoType;
	}

	public java.lang.String getInfoType(){
		return this.infoType;
	}

	public void setUnitOid(java.lang.Long unitOid){
		this.unitOid = unitOid;
	}

	public java.lang.Long getUnitOid(){
		return this.unitOid;
	}

	public void setUnitName(java.lang.String unitName){
		this.unitName = unitName;
	}

	public java.lang.String getUnitName(){
		return this.unitName;
	}

	public void setRefType(java.lang.String refType){
		this.refType = refType;
	}

	public java.lang.String getRefType(){
		return this.refType;
	}

	public void setRefOid(java.lang.Long refOid){
		this.refOid = refOid;
	}

	public java.lang.Long getRefOid(){
		return this.refOid;
	}

	public void setRefDesc(java.lang.String refDesc){
		this.refDesc = refDesc;
	}

	public java.lang.String getRefDesc(){
		return this.refDesc;
	}

	public void setDutyAttribute(java.lang.String dutyAttribute){
		this.dutyAttribute = dutyAttribute;
	}

	public java.lang.String getDutyAttribute(){
		return this.dutyAttribute;
	}

	public void setDutyAttributeName(java.lang.String dutyAttributeName){
		this.dutyAttributeName = dutyAttributeName;
	}

	public java.lang.String getDutyAttributeName(){
		return this.dutyAttributeName;
	}

	public void setDutyLevel(java.lang.String dutyLevel){
		this.dutyLevel = dutyLevel;
	}

	public java.lang.String getDutyLevel(){
		return this.dutyLevel;
	}

	public void setDutyLevelName(java.lang.String dutyLevelName){
		this.dutyLevelName = dutyLevelName;
	}

	public java.lang.String getDutyLevelName(){
		return this.dutyLevelName;
	}

	public void setCount(java.lang.Long count){
		this.count = count;
	}

	public java.lang.Long getCount(){
		return this.count;
	}

	public void setBeginDate(java.util.Date beginDate){
		this.beginDate = beginDate;
	}

	public java.util.Date getBeginDate(){
		return this.beginDate;
	}

	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}

	public java.util.Date getEndDate(){
		return this.endDate;
	}

	public void setStatus(java.lang.String status){
		this.status = status;
	}

	public java.lang.String getStatus(){
		return this.status;
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
