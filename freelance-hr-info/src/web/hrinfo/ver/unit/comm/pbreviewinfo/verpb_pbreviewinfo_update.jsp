﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.yh.platform.core.constant.Constant"%>
<%@ page import="com.yh.hr.res.dictionary.DicConstants"%>
<%@ include file="/include/jsp_headers.jsp"%>

<!--
 * @function    PbReviewInfo修改页面
 * @page name   /hrinfo/ver/unit/comm/pbReviewInfo/verpb_pbReviewInfo_update.jsp
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-14
-->




<!DOCTYPE html>
<html lang="cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>年度考核信息修改页面</title>
<script type="text/javascript" src="hrworktop/flow/selectDept.js"></script>
<script type="text/javascript"
	src="hrinfo/ver/unit/comm/pbreviewinfo/js/check_review_info.js"></script>
<script type="text/javascript" src="js/comm/customJs.js"></script>
<!-- 选择内设机构组件 -->
<script type="text/javascript"
	src="hrcomponent/orgselectjs/selectOrgWorktop.js"></script>
</head>

<body>

	<form id="reviewInfoForm" class="form-inline"
		action="updatePbReviewInfo.do?method=update" method="post"
		onsubmit="return false">
		<div id="transaction_modal_box" class="transaction_modal_box">
			<div class="modal-dialog-container">
				<div class="md-title">
					年度考核信息&gt;修改 <a href="#" class="md-close close-popdown"></a>
				</div>
				<div class="md-error" style="display: none">
          <p>以下信息有误,请重新输入</p>
        </div>
				<div class="md-main-content">

					<input type="hidden" id="reviewOid" name="reviewOid"
						value="${pbReviewInfoForm.reviewOid}" /> <input type="hidden"
						id="personOid" name="personOid"
						value="${pbReviewInfoForm.personOid}" /> <input type="hidden"
						id="unitOid" name="unitOid" value="${pbReviewInfoForm.unitOid}" />
					<input type="hidden" id="url_id" value="${urlId}" />
					<div class="md-units md-three-column clearfix">

						<dl class="updown-dl">
							<dt>
								<b class="Required">* </b>考核类别：
							</dt>
							<dd>
								<label><dictionary:dicItemSelect id="reviewTypeCode"
										name="reviewTypeCode" styleClass="modal_select"
										emptyText="<%=Constant.EMPTY_SELECT %>"
										selected="${pbReviewInfoForm.reviewTypeCode}"
										dicTypeCode="<%=DicConstants.YHRS0069%>" />
								</label>
							</dd>
						</dl>
						<dl class="updown-dl">
							<dt>
								<b class="Required">* </b>考核年度：
							</dt>
							<dd>
								<label><input type="text" id="reviewYearStr"
									name="reviewYearStr" class="modal_iput"
									value="${pbReviewInfoForm.reviewYearStr}" readonly="true"
									onfocus="WdatePicker({dateFmt:'yyyy'});" />
								</label>
							</dd>
						</dl>
						<dl class="updown-dl">
							<dt>
								<b class="Required">* </b>考核时所在科室：
							</dt>
							<dd>
								<label> 
									<input type="text" class="modal_iput" name="reviewUnitName" id="reviewUnitOid" readonly="readonly" onclick="min_selOrg.min_selectOrg(this,$('#unitOid').val(),null,null,['bottom','left'],'true')" value="${pbReviewInfoForm.reviewUnitName}" /> 
									<input type="hidden" id="hiddenReviewUnitOid" name="reviewUnitOid" value="${pbReviewInfoForm.reviewUnitOid}" /> 
									<a class="md-unit-clear" onclick="$(this).siblings('input').val('')"></a>
								</label>
							</dd>
						</dl>
						<dl class="updown-dl">
							<dt>
								<b class="Required">* </b>考核结论类别：
							</dt>
							<dd>
								<label><dictionary:dicItemSelect id="reviewResultCode"
										name="reviewResultCode" styleClass="modal_select"
										emptyText="<%=Constant.EMPTY_SELECT %>"
										selected="${pbReviewInfoForm.reviewResultCode}"
										dicTypeCode="<%=DicConstants.YHRS0070%>" />
								</label>
							</dd>
						</dl>
						<dl class="updown-dl">
							<dt>考核日期：</dt>
							<dd>
								<label><input type="text" id="reviewDateStr"
									name="reviewDateStr" class="modal_iput"
									value="${pbReviewInfoForm.reviewDateStr}" readonly="true"
									onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'});" />
								</label>
							</dd>
						</dl>

						<dl class="updown-remark">
							<dt>备注：</dt>
							<dd>
								<label><textarea id="remark" name="remark" maxlength="100">${pbReviewInfoForm.remark}</textarea>
								</label>
							</dd>
						</dl>
					</div>
				</div>
			</div>
			<div class="modal-footer">
            <button id="saveReview" type="button" class="btn btn-primary">保
              存</button>
            <button type="button" class="btn btn-default close-popdown"
              data-dismiss="modal">取 消</button>
          </div>
		</div>

	</form>
</body>
</html>