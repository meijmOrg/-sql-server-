﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/jsp_headers.jsp"%>

<%@page import="com.yh.hr.res.dictionary.DicConstants"%>
<!DOCTYPE html>
<html>
<head lang="en">
<title>科室查看页面</title>
<script src="hrinfo/ver/unit/person/js/VerPbPersonOperate.js"></script>
<link href="hspszhphtml/css/components/handle_btn.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="infoshow-container padding-lrb">
		<div class="st-title-box">
			<h3 class="st-title-text">
				科室信息
			</h3>
			<c:if test="${orgForm.orgStatus eq '2' && orgForm.orgType eq '2'}">
			<div class="st-title-icon">
					<i><a href="goUpdateOrg.do?method=goUpdateOrg&orgOid=${orgOid}&flag='view'" class="popdown st-handle-modify  btn"></a></i>
			</div></c:if>
			<div class="data-units">
				<dl class="data-unit-dl">
				<dt>科室名称：</dt>
				<dd>
					<label title='<bean:write name="orgForm" property="orgName" />'><bean:write name="orgForm" property="orgName" />&nbsp;</label>
				</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>科室类型：</dt>
					<dd>
						<label title='<dictionary:viewDicItemName dicTypeCode="<%=DicConstants.YHRS0102%>" dicItemCode="${orgForm.orgCategory}"/>'><dictionary:viewDicItemName dicTypeCode="<%=DicConstants.YHRS0102%>" dicItemCode="${orgForm.orgCategory}"/>&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>上级科室：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="parentOrgName" />'><bean:write name="orgForm" property="parentOrgName" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>排序号：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="orderOfView" />'><bean:write name="orgForm" property="orderOfView" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>状态：</dt>
					<dd>
						<label title='<dictionary:viewDicItemName dicTypeCode="<%=DicConstants.YHRS0101%>" dicItemCode="${orgForm.orgStatus}"/>'><dictionary:viewDicItemName dicTypeCode="<%=DicConstants.YHRS0101%>" dicItemCode="${orgForm.orgStatus}"/>&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>成立时间：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="establishedDateStr" />'><bean:write name="orgForm" property="establishedDateStr" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>联系人：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="contacter" />'><bean:write name="orgForm" property="contacter" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>手机：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="mobilePhone" />'><bean:write name="orgForm" property="mobilePhone" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>联系电话：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="phone" />'><bean:write name="orgForm" property="phone" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>电子邮箱：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="email" />'><bean:write name="orgForm" property="email" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>传真：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="fax" />'><bean:write name="orgForm" property="fax" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl">
					<dt>科室地址：</dt>
					<dd>
						<label title='<bean:write name="orgForm" property="address" />'><bean:write name="orgForm" property="address" />&nbsp;</label>
					</dd>
				</dl>
				<dl class="data-unit-dl remark-unit">
				<dt>备注：</dt>
				<dd>
					<textarea readonly="readonly"  title='<bean:write name="orgForm" property="remark" />'><bean:write name="orgForm" property="remark" />&nbsp;</textarea>
				</dd>
				</dl>
			</div>
		</div>
	</div>
</body>
<script>
	$(document).ready(function() {

		$('.popdown').popdown({
			width : 1400
		});
	})
</script>
</html>