/**
 * This file is generated by  code generation tool version 0.2 ^_^
 * Created at 2016-11-15
**/
package com.yh.hr.res.pt.bo;

import com.yh.platform.core.bo.BaseBo;

import java.util.Date;

public class PtEngageContractRenew extends BaseBo {
	private static final long serialVersionUID = 5267346195685772553L;
	private Long bizEngageContractOid;        //业务主键OID
	private Long bizPersonOid;        //PersonOid
	private Long baseEngageContractOid;//基本表合同信息主键Oid
	private String contractNo;        //合同编号
	private String contractType;        //合同签订方式
	private String changeType;        //合同类型
	private Date contractBegin;        //合同开始时间
	private Date contractEnd;        //合同截止时间
	private Date contractEndActual;        //合同实际结束日期
	private Date signDate;        //合同签订时间
	private Long renewMonths;              //续签月份
	private String remark;                 //续签备注
	private String preContractNo;           //续签前合同编号
	private String preContractType;       //续签前合同签订方式
	private String preChangeType;         //续签前合同类型
	private Date preContractBegin;        //续签前合同开始时间
	private Date preContractEnd;         //续签前合同截止时间
	private String probationFlag;        //是否存在试用期
	private Date probationBegin;        //试用期开始日期
	private Date probationEnd;        //试用期结束日期
	private String createBy;        //创建人ID
	private String createName;        //创建人名称
	private Date createDate;        //创建时间
	private String updateBy;        //修改人ID
	private String updateName;        //修改人名称
	private Date updateDate;        //修改时间
	public PtEngageContractRenew() {

	}

	public Long getBizEngageContractOid() {
		return bizEngageContractOid;
	}

	public void setBizEngageContractOid(Long bizEngageContractOid) {
		this.bizEngageContractOid = bizEngageContractOid;
	}

	public Long getBizPersonOid() {
		return bizPersonOid;
	}

	public void setBizPersonOid(Long bizPersonOid) {
		this.bizPersonOid = bizPersonOid;
	}

	public Long getBaseEngageContractOid() {
		return baseEngageContractOid;
	}

	public void setBaseEngageContractOid(Long baseEngageContractOid) {
		this.baseEngageContractOid = baseEngageContractOid;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public Date getContractBegin() {
		return contractBegin;
	}

	public void setContractBegin(Date contractBegin) {
		this.contractBegin = contractBegin;
	}

	public Date getContractEnd() {
		return contractEnd;
	}

	public void setContractEnd(Date contractEnd) {
		this.contractEnd = contractEnd;
	}

	public Date getContractEndActual() {
		return contractEndActual;
	}

	public void setContractEndActual(Date contractEndActual) {
		this.contractEndActual = contractEndActual;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Long getRenewMonths() {
		return renewMonths;
	}

	public void setRenewMonths(Long renewMonths) {
		this.renewMonths = renewMonths;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPreContractNo() {
		return preContractNo;
	}

	public void setPreContractNo(String preContractNo) {
		this.preContractNo = preContractNo;
	}

	public String getPreContractType() {
		return preContractType;
	}

	public void setPreContractType(String preContractType) {
		this.preContractType = preContractType;
	}

	public String getPreChangeType() {
		return preChangeType;
	}

	public void setPreChangeType(String preChangeType) {
		this.preChangeType = preChangeType;
	}

	public Date getPreContractBegin() {
		return preContractBegin;
	}

	public void setPreContractBegin(Date preContractBegin) {
		this.preContractBegin = preContractBegin;
	}

	public Date getPreContractEnd() {
		return preContractEnd;
	}

	public void setPreContractEnd(Date preContractEnd) {
		this.preContractEnd = preContractEnd;
	}

	public String getProbationFlag() {
		return probationFlag;
	}

	public void setProbationFlag(String probationFlag) {
		this.probationFlag = probationFlag;
	}

	public Date getProbationBegin() {
		return probationBegin;
	}

	public void setProbationBegin(Date probationBegin) {
		this.probationBegin = probationBegin;
	}

	public Date getProbationEnd() {
		return probationEnd;
	}

	public void setProbationEnd(Date probationEnd) {
		this.probationEnd = probationEnd;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
