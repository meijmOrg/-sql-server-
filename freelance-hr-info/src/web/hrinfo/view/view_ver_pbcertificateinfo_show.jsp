﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.yh.platform.core.constant.Constant"%>
<%@ page import="com.yh.hr.res.dictionary.DicConstants"%>
<%@ include file="/include/jsp_headers.jsp"%>

<!--
 * @function    JhcPbCertificateInfo信息查看页面
 * @page name   /hrinfo/view/view_ver_jhcPbCertificateInfo_show.jsp
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-14
-->



<!DOCTYPE html>
<html lang="cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>执业注册信息查看页面</title>
<style type="text/css">
dd {
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}
</style>
</head>

<body>
	<form id="pbCertificateInfoForm" action="#" method="post">
		<div id="transaction_modal_box" class="transaction_modal_box">
			<div class="modal-dialog-container">
				<div class="md-title">
					执业注册信息&gt;查看 <a href="#" class="md-close close-popdown"></a>
				</div>
				<div class="md-main-content">
					<div class="md-units md-three-column clearfix">
						<dl class="data-unit-dl">
						<dt title="执业注册证书编号">执业注册证书编号：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="certificateNo" />'><bean:write name="pbCertificateInfoForm" property="certificateNo" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="发证机构">发证机构：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="approveOrganName" />'><bean:write name="pbCertificateInfoForm" property="approveOrganName" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="审批日期">审批日期：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="approvedDateStr" />'><bean:write name="pbCertificateInfoForm" property="approvedDateStr" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="签发日期">签发日期：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="issuedDateStr" />'><bean:write name="pbCertificateInfoForm" property="issuedDateStr" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="执业范围">执业范围：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="scopeCode" />'><bean:write name="pbCertificateInfoForm" property="scopeCode" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="执业地点">执业地点：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="certificateUnit" />'><bean:write name="pbCertificateInfoForm" property="certificateUnit" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="注册日期">注册日期：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="certificateBeginDateStr" />'><bean:write name="pbCertificateInfoForm" property="certificateBeginDateStr" />&nbsp;</label>
						</dd>
					</dl>
					<%-- <dl class="data-unit-dl">
						<dt title="创建人名称">创建人名称：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="createName" />'><bean:write name="pbCertificateInfoForm" property="createName" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="修改人名称">修改人名称：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="updateName" />'><bean:write name="pbCertificateInfoForm" property="updateName" />&nbsp;</label>
						</dd>
					</dl> --%>
					<dl class="data-unit-dl">
						<dt title="注册有效截止日期">注册有效截止日期：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="certificateEndDateStr" />'><bean:write name="pbCertificateInfoForm" property="certificateEndDateStr" />&nbsp;</label>
						</dd>
					</dl>
					<%-- <dl class="data-unit-dl">
						<dt title="创建时间">创建时间：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="createDateStr" />'><bean:write name="pbCertificateInfoForm" property="createDateStr" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="修改时间">修改时间：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="updateDateStr" />'><bean:write name="pbCertificateInfoForm" property="updateDateStr" />&nbsp;</label>
						</dd>
					</dl> --%>
					<dl class="data-unit-dl">
						<dt title="是否注销">是否注销：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="cancelFlag" />'><bean:write name="pbCertificateInfoForm" property="cancelFlag" />&nbsp;</label>
						</dd>
					</dl>
					<%-- <dl class="data-unit-dl">
						<dt title="创建人ID">创建人ID：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="createBy" />'><bean:write name="pbCertificateInfoForm" property="createBy" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl">
						<dt title="修改人ID">修改人ID：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="updateBy" />'><bean:write name="pbCertificateInfoForm" property="updateBy" />&nbsp;</label>
						</dd>
					</dl> --%>
					<dl class="data-unit-dl">
						<dt title="注销日期">注销日期：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="cancelDateStr" />'><bean:write name="pbCertificateInfoForm" property="cancelDateStr" />&nbsp;</label>
						</dd>
					</dl>
					<dl class="data-unit-dl updown-remark">
						<dt title="备注">备注：</dt>
						<dd>
							<label title='<bean:write name="pbCertificateInfoForm" property="remark" />'><bean:write name="pbCertificateInfoForm" property="remark" />&nbsp;</label>
						</dd>
					</dl>
					</div>
				</div>
				<div class="md-btn">
					<button type="button" class="md-btn-cancel close-popdown" data-dismiss="modal" button-click="widget-close">关 闭</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>