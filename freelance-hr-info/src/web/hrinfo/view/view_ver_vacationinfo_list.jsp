<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/jsp_headers.jsp"%>

<!--
 * @function    请休假信息查看列表页面
 * @page name   /hrinfo/view/view_ver_vacationinfo_list.jsp
 * @author      renp
 * @created     2017/04/07
 * @version     1.0
-->
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=1.0"/>
	<title>人员请休假列表页</title>
	<script type="text/javascript" src="hrinfo/ver/unit/comm/js/personinfocommeffect.js"></script>
</head>
<logic:messagesPresent>
		<bean:message key="errors.header" />
			<ul>
				<html:messages id="error">
					<li>
						<bean:write name="error" />
					</li>
				</html:messages>
			</ul>
</logic:messagesPresent>
<body>
 <div class="infoshow-container padding-lrb">
        <div class="st-title-box"><h3 class="st-title-text">请休假信息</h3>
        </div>
        <div class="st-main-table">
            <table class="sr-table">
             <thead class="sr-table-thead">
                <tr>
                	<th class="md-th"></th>
                	<th class="md-th"><input type="checkbox"></th>
                	<th>请假类型</th>
                	<th>开始时间</th>
                	<th>结束时间</th>
                	<th>请假天数</th>
                    <th>操作</th>
                </tr>
             </thead>
             <tbody class="sr-table-tbody">
              <c:forEach var ="dto" items="${list}" varStatus="status">
                <tr>
                    <td class="md-th">${status.count}</td>
                    <td class="md-th"><input type="checkbox"/></td>
                    <td title="${dto.vacationType}">${dto.vacationType}</td>
                	<td title="${dto.startDateStr}">${dto.startDateStr}</td>
                	<td title="${dto.endDateStr}">${dto.endDateStr}</td>
                	<td title="${dto.vacationDays}">${dto.vacationDays}</td>
                    <td>
                   <a href="showVacationInfo.do?method=show&vacationOid=${dto.vacationOid}" class="popdown btn">查看</a>
                    </td>
                </tr>
                </c:forEach>
             </tbody>
            </table>
        </div>
 </div>
</body>

<script type="text/javascript">

$(document).ready(function(){
    $('.popdown').popdown({width:1180, top: 50});
})

</script>
</html>