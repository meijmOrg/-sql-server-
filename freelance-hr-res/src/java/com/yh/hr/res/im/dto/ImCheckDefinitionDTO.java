/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2017-07-11
**/
package com.yh.hr.res.im.dto;

public class ImCheckDefinitionDTO {

	private java.lang.Long  	checkDifinitionOid;	//主键OID
	private java.lang.String	databaseColumnCode;	//数据库字段代码
	private java.lang.String	templateCollName;	//模板采集项名称
	private java.lang.String	checkType;	//检查类型	4：字典项检查	5：关联性检查	6：完整性检查
	private java.lang.String	effectiveFlag;	//生效标识	1：生效	0：失效
	private java.lang.String	remark;	//备注

	public ImCheckDefinitionDTO() {
		
	}

	public void setCheckDifinitionOid(java.lang.Long checkDifinitionOid){
		this.checkDifinitionOid = checkDifinitionOid;
	}

	public java.lang.Long getCheckDifinitionOid(){
		return this.checkDifinitionOid;
	}

	public void setDatabaseColumnCode(java.lang.String databaseColumnCode){
		this.databaseColumnCode = databaseColumnCode;
	}

	public java.lang.String getDatabaseColumnCode(){
		return this.databaseColumnCode;
	}

	public void setTemplateCollName(java.lang.String templateCollName){
		this.templateCollName = templateCollName;
	}

	public java.lang.String getTemplateCollName(){
		return this.templateCollName;
	}

	public void setCheckType(java.lang.String checkType){
		this.checkType = checkType;
	}

	public java.lang.String getCheckType(){
		return this.checkType;
	}

	public void setEffectiveFlag(java.lang.String effectiveFlag){
		this.effectiveFlag = effectiveFlag;
	}

	public java.lang.String getEffectiveFlag(){
		return this.effectiveFlag;
	}

	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}

	public java.lang.String getRemark(){
		return this.remark;
	}

}
