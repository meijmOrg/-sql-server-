<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/jsp_headers.jsp"%>
<%@ include file="/include/js_css_base_include.jsp"%>
<%@page import="com.yh.hr.res.dictionary.DicConstants"%>
<!--
 * @function    考勤参数设置新增页面
 * @page name   hrcomponent/attendance/set/attendance_create.jsp
 * @author      chenjl
 * @date        2017/03/29
 * @version     1.0
-->
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>考勤参数设置新增页面</title>
<script type="text/javascript" src="hrworktop/flow/selectDept.js"></script>
<script type="text/javascript" src="js/comm/customJs.js"></script>
<script type="text/javascript" src="js/comm/common_validator.js"></script>
<script type="text/javascript" src="hrcomponent/attendance/set/js/check_attendance.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		init(${selectYear},${selectMonth});
		changeYear(${selectYear});
	});

	var picker = new Kalendae.Input('noAttendanceDateStr',{
		months:1,//设置显示几个月份的
		mode:'multiple',//设置日期控件选择模型
		//direction:'future',//设置当前日期之前的是否可以选择
		direction:'',
		multipleDelimiter:',',
		format:'YYYY-MM-DD',
		titleFormat:'YYYY,MM',
		selected:''
	});
</script>
</head>
<body>
	<form id="formAttendanceUpdate" class="form-inline" action="createAttendance.do?method=createAttendance" method="post" onsubmit="return false">
	    <input type="hidden" id="url_id" value="${id}" />
	    <input type="hidden" name="parameterSetOid" value="${attendanceForm.parameterSetOid}"/>
		<div id="transaction_modal_box" class="transaction_modal_box">
			<div class="modal-dialog-container">
				<div class="md-title">
					考勤参数设置管理 &gt;新增<a href="#" class="md-close close-popdown" button-click="widget-close"></a>
				</div>
				<div class="md-error" style="display: none">
          <p>以下信息有误,请重新输入</p>
        </div>
				<div class="md-main-content">
		<div class="infoshow-container multi-info-group clearfix">
		<h2 class="infoshow-title">考勤参数设置表采集信息</h2>
		<div class="md-units-adddata md-units md-three-column clearfix">
			<dl class="updown-dl">
	            <dt>
	              <b class="Required">* </b>年度：
	            </dt>
	            <dd>
	              <label>
	                <select id="attendanceYear" class="modal_iput" name="attendanceYear" onchange="changeYear(this.options[this.options.selectedIndex].value)">
			            	<option value="">--请选择--</option>
							<c:if test="${!empty yearList}">
								<c:forEach var="dto" items="${yearList}">
									<option value="${dto.attendanceYear}">${dto.attendanceYear}</option>
								</c:forEach>
							</c:if>
					</select>
	              </label>
	            </dd>
	          </dl>
	          <dl class="updown-dl">
	            <dt>
	              <b class="Required">* </b>周期：
	            </dt>
	            <dd>
	              <label>
	                <select id="attendancePeriod" class="modal_iput" name="attendancePeriod" onchange="changeMonth()">
			            	<option value="">--请选择--</option>
							<c:if test="${!empty monthList}">
								<c:forEach var="dto" items="${monthList}" >
									<option value="${dto.attendancePeriod}">${dto.attendancePeriod}</option>
								</c:forEach>
							</c:if>
					</select>
	              </label>
	            </dd>
	          </dl>
	          <dl class="updown-dl">
	            <dt>开始时间：</dt>
	            <dd>
	              <label>
	              	  <input id="startDateStr" name="startDateStr" value="${startDateStr}" class="modal_iput" readonly="readonly"/> &nbsp;
	              </label>
	            </dd>
	          </dl>
	          <dl class="updown-dl">
	            <dt>结束时间：</dt>
	            <dd>
	              <label>
	              <input id="endDateStr" name="endDateStr" value="${endDateStr}" class="modal_iput" readonly="readonly"/> &nbsp;
	              </label>
	            </dd>
	          </dl>
	          <dl class="updown-dl">
	            <dt>日历天数：</dt>
	            <dd>
	              <label>
            	         <input id="calendarDays" name="calendarDays" value="${calendarDays}" class="modal_iput" readonly="readonly"/> &nbsp;
	              </label>
	            </dd>
	          </dl>

	          <dl class="updown-dl">
	            <dt>非出勤天数：</dt>
	            <dd>
	              <label>
	                <input id="noAttendanceDays" name="noAttendanceDays"  class="modal_iput" readonly="readonly" value="${attendanceForm.noAttendanceDays }"/> &nbsp;
	              </label>
	            </dd>
	          </dl>
	          <dl class="updown-dl">
	            <dt>应出勤天数：</dt>
	            <dd>
	              <label>
	                <input id="attendanceDays" name="attendanceDays"  class="modal_iput" readonly="readonly"/> &nbsp;
	              </label>
	            </dd>
	          </dl>
	          	          <dl class="updown-remark">
	            <dt>非出勤日期：</dt>
	            <dd>
	              <label>
	              		 <input type="text" id="noAttendanceDateStr" name="noAttendanceDateStr" class="modal_iput" title="" onchange="sumNoAttendanceDays();"/>	
	              		 <a class="md-unit-clear" onclick="clearNoAttendanceDateStr();"></a>
	              </label>
	            </dd>
	          </dl>
	           <dl class="updown-remark">
                           <dt>备注：</dt>
                           <dd><textarea id="remark" name="remark" maxlength="1000">${attendanceForm.remark}</textarea></dd>
                </dl>
          </div>
           </div>
				</div>
			<div class="md-btn">
				<button type="submit" class="md-btn-save close-popdown">保存</button>
                <button class="md-btn-cancel close-popdown" button-click="widget-close">取消</button>
			</div>
			</div>
		</div>
	</form>
</body>
</html>