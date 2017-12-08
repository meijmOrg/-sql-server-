/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-08-24
**/
package com.yh.hr.res.pb.bo;

import com.yh.platform.core.bo.BaseBo;

import java.util.Date;

public class PbPostInfo extends BaseBo {
	private static final long serialVersionUID = 2515516587055227706L;

	private Long	postOid;	//主键
	private Long	personOid;	//PersonOid
	private Long	dutyUnitOid;	//聘任单位OID
	private String	dutyUnitName;	//聘任单位名称
	private Long	deptOid;	//内设机构OID
	private String	deptName;	//内设机构名称
	private String	positionStatus;	//岗位聘任状态YHRS0026
	private String	positionType;	//岗位类别YHRS0022
	private String	positionLevel;	//岗位级别YHRS0023
	private String	positionName;	//岗位名称
	private java.util.Date	beginDate;	//岗位聘任开始时间
	private java.util.Date	endDate;	//岗位聘任拟截止时间
	private java.util.Date	endDateActual;	//岗位聘任实际截止时间
	private String	specialPositionType;	//特殊岗位类别 YHRS0111 如：教师、护士
	private String	isMPosition;	//是否主岗位 YHRS0003
	private String	remark;	//备注
	private Long	positioningOid;	//任职聘任信息OID，外键关联任职聘任信息表
	private String	dutyRecordType;	//职务类型YHRS0036
	private String	createdByCode;	//CreatedByCode
	private String	createdByName;	//CreatedByName
	private java.util.Date	createdDate;	//CreatedDate
	private String	updatedByCode;	//UpdatedByCode
	private String	updatedByName;	//UpdatedByName
	private java.util.Date	updatedDate;	//UpdatedDate

	public Long getPostOid() {
		return postOid;
	}

	public void setPostOid(Long postOid) {
		this.postOid = postOid;
	}

	public Long getPersonOid() {
		return personOid;
	}

	public void setPersonOid(Long personOid) {
		this.personOid = personOid;
	}

	public Long getDutyUnitOid() {
		return dutyUnitOid;
	}

	public void setDutyUnitOid(Long dutyUnitOid) {
		this.dutyUnitOid = dutyUnitOid;
	}

	public String getDutyUnitName() {
		return dutyUnitName;
	}

	public void setDutyUnitName(String dutyUnitName) {
		this.dutyUnitName = dutyUnitName;
	}

	public Long getDeptOid() {
		return deptOid;
	}

	public void setDeptOid(Long deptOid) {
		this.deptOid = deptOid;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getPositionStatus() {
		return positionStatus;
	}

	public void setPositionStatus(String positionStatus) {
		this.positionStatus = positionStatus;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getPositionLevel() {
		return positionLevel;
	}

	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDateActual() {
		return endDateActual;
	}

	public void setEndDateActual(Date endDateActual) {
		this.endDateActual = endDateActual;
	}

	public String getSpecialPositionType() {
		return specialPositionType;
	}

	public void setSpecialPositionType(String specialPositionType) {
		this.specialPositionType = specialPositionType;
	}

	public String getIsMPosition() {
		return isMPosition;
	}

	public void setIsMPosition(String isMPosition) {
		this.isMPosition = isMPosition;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getPositioningOid() {
		return positioningOid;
	}

	public void setPositioningOid(Long positioningOid) {
		this.positioningOid = positioningOid;
	}

	public String getDutyRecordType() {
		return dutyRecordType;
	}

	public void setDutyRecordType(String dutyRecordType) {
		this.dutyRecordType = dutyRecordType;
	}

	public String getCreatedByCode() {
		return createdByCode;
	}

	public void setCreatedByCode(String createdByCode) {
		this.createdByCode = createdByCode;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedByCode() {
		return updatedByCode;
	}

	public void setUpdatedByCode(String updatedByCode) {
		this.updatedByCode = updatedByCode;
	}

	public String getUpdatedByName() {
		return updatedByName;
	}

	public void setUpdatedByName(String updatedByName) {
		this.updatedByName = updatedByName;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
