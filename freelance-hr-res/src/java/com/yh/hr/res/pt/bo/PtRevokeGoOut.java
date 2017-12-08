package com.yh.hr.res.pt.bo;

import java.util.Date;

import com.yh.platform.core.bo.BaseBo;
/**
 * @description 普通外出销假业务表BO
 * @author wangx
 * @date 2017-05-20
 * @version 1.0
 *
 */
public class PtRevokeGoOut extends BaseBo {

	private static final long serialVersionUID = -5496893191416998669L;
	
	/**
	 * 主键ID
	 */
	private Long ptRevokeGoOutOid;
	/**
	 * 普通外出业务OID
	 */
	private Long ptGoOutOid;
	/**
	 * 基础ID
	 */
	private Long pbRevokeGoOutOid;
	/**
	 * 销假开始日期
	 */
	private Date revokeStartDate;
	/**
	 * 销假结束日期
	 */
	private Date revokeEndDate;
	/**
	 * 开始当天假长
	 */
	private Double startDateDays;
	/**
	 * 结束当天假长
	 */
	private Double endDateDays;
	/**
	 * 销假天数
	 */
	private Float revokeVacationDays;
	/**
	 * 含节假日天数
	 */
	private Double statutoryHolidayDays;
	/**
     *备注
     **/
	private String remark;
    /**
     *创建人ID
     **/
	private String createBy;
    /**
     *创建人名称
     **/
	private String createName;
    /**
     *创建时间
     **/
	private Date createDate;
    /**
     *修改人ID
     **/
	private String updateBy;
    /**
     *修改人名称
     **/
	private String updateName;
    /**
     *修改时间
     **/
	private Date updateDate;
	
	public Long getPtRevokeGoOutOid() {
		return ptRevokeGoOutOid;
	}
	public void setPtRevokeGoOutOid(Long ptRevokeGoOutOid) {
		this.ptRevokeGoOutOid = ptRevokeGoOutOid;
	}
	public Long getPtGoOutOid() {
		return ptGoOutOid;
	}
	public void setPtGoOutOid(Long ptGoOutOid) {
		this.ptGoOutOid = ptGoOutOid;
	}
	public Long getPbRevokeGoOutOid() {
		return pbRevokeGoOutOid;
	}
	public void setPbRevokeGoOutOid(Long pbRevokeGoOutOid) {
		this.pbRevokeGoOutOid = pbRevokeGoOutOid;
	}
	public Date getRevokeStartDate() {
		return revokeStartDate;
	}
	public void setRevokeStartDate(Date revokeStartDate) {
		this.revokeStartDate = revokeStartDate;
	}
	public Date getRevokeEndDate() {
		return revokeEndDate;
	}
	public void setRevokeEndDate(Date revokeEndDate) {
		this.revokeEndDate = revokeEndDate;
	}
	public Double getStartDateDays() {
		return startDateDays;
	}
	public void setStartDateDays(Double startDateDays) {
		this.startDateDays = startDateDays;
	}
	public Double getEndDateDays() {
		return endDateDays;
	}
	public void setEndDateDays(Double endDateDays) {
		this.endDateDays = endDateDays;
	}
	public Float getRevokeVacationDays() {
		return revokeVacationDays;
	}
	public void setRevokeVacationDays(Float revokeVacationDays) {
		this.revokeVacationDays = revokeVacationDays;
	}
	public Double getStatutoryHolidayDays() {
		return statutoryHolidayDays;
	}
	public void setStatutoryHolidayDays(Double statutoryHolidayDays) {
		this.statutoryHolidayDays = statutoryHolidayDays;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
