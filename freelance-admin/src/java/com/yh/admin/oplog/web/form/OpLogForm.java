package com.yh.admin.oplog.web.form;

import org.apache.struts.validator.ValidatorForm;

public class OpLogForm  extends ValidatorForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8653489902828429851L;
	private java.lang.Long		logOid;	
	private java.lang.String	userId;		
	private java.lang.String	userName;	
	private java.util.Date	 	logDate;	//操作时间
	private java.lang.String 	ipAddress;
	private java.lang.String 	systemName;
	private java.lang.String	systemCode;	
	private java.lang.String	functionCode;//操作功能代码
	private java.lang.String	functionName;//操作功能名称
	
	
	public java.lang.Long getLogOid() {
		return logOid;
	}
	public void setLogOid(java.lang.Long logOid) {
		this.logOid = logOid;
	}
	public java.lang.String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(java.lang.String systemCode) {
		this.systemCode = systemCode;
	}
	public java.lang.String getUserId() {
		return userId;
	}
	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}
	public java.lang.String getUserName() {
		return userName;
	}
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
	public java.util.Date getLogDate() {
		return logDate;
	}
	public void setLogDate(java.util.Date logDate) {
		this.logDate = logDate;
	}
	public java.lang.String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(java.lang.String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public java.lang.String getSystemName() {
		return systemName;
	}
	public void setSystemName(java.lang.String systemName) {
		this.systemName = systemName;
	}
	public java.lang.String getFunctionCode() {
		return functionCode;
	}
	public void setFunctionCode(java.lang.String functionCode) {
		this.functionCode = functionCode;
	}
	public java.lang.String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(java.lang.String functionName) {
		this.functionName = functionName;
	}

}
