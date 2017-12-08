<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ include file="/include/jsp_headers.jsp"%>
<%@ include file="/include/js_css_base_include.jsp"%>
<%@page import="com.yh.hr.res.dictionary.DicConstants"%>
<!DOCTYPE html>
<html>
<head >
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>人员导入页面</title>

<script type="text/javascript">
</script>
</head>
<body>
<div class="current-position">
    当前位置：
    <span>基础信息管理 &gt; </span>
    <span>机构管理 &gt; </span>
    <span>人员信息导入 </span>
</div>
<div class="main-container file-import-wrap">
    <div class="person-info-import">
        <div class="file-import-process">
            <ol class="progress progress-6 clearfix">
                <li class="active">
                    <div class="process-line"></div>
                    <div class="process-cont">
                        <div class="process-cont-number">1</div>
                        <div class="process-cont-text">导入</div>
                    </div>
                </li>
                <li class="active">
                    <div class="process-line"></div>
                    <div class="process-cont">
                        <div class="process-cont-number">2</div>
                        <div class="process-cont-text">采集项映射</div>
                    </div>
                </li>
                <li>
                    <div class="process-line"></div>
                    <div class="process-cont">
                        <div class="process-cont-number">3</div>
                        <div class="process-cont-text">数据检查</div>
                    </div>
                </li>
                <li>
                    <div class="process-line"></div>
                    <div class="process-cont">
                        <div class="process-cont-number">4</div>
                        <div class="process-cont-text">数据校核</div>
                    </div>
                </li>
                <li>
                    <div class="process-line"></div>
                    <div class="process-cont">
                        <div class="process-cont-number">5</div>
                        <div class="process-cont-text">人员入库</div>
                    </div>
                </li>
                <li>
                    <div class="process-cont">
                        <div class="process-cont-number">6</div>
                        <div class="process-cont-text">完成</div>
                    </div>
                </li>
            </ol>
        </div>
    </div>
    <input type="hidden" name="formFile"  id="formFile" value="${formFile}"/>
    <div class="person-info-loading">
        <div class="person-check-cont">
            <h2>计划导入人员总数<span id ='rowNum'>${rowNum }</span>人</h2>
            <h2 class="present-check-num">当前已检查<span id ='nowCheckDataNum' >${rowNum }</span>人，已导入<span id ='nowImportPersonNum' >${nowImportPersonNum }</span>人</h2>
            <ul class="person-info-check">
                <li class="person-check-item first-level">
                    <div class="person-check-result">未通过</div>
                    <div class="person-check-num" id='checkDataMust'>${checkDataMust }人</div>
                    <div class="person-check-name">必填项</div>
                </li>
                <li class="person-check-item second-level">
                    <div class="person-check-result">未通过</div>
                    <div class="person-check-num" id='checkDataFormat'>${checkDataFormat }人</div>
                    <div class="person-check-name">数据格式</div>
                </li>
                <li class="person-check-item thrid-level">
                    <div class="person-check-result">未通过</div>
                    <div class="person-check-num" id='checjDataLength'>${checkDataLength }人</div>
                    <div class="person-check-name">数据长度</div>
                </li>
            </ul>
            <div class="person-check-btns">
             	<button class="btn-search btn-default" button-click="uploadErrorImportDate">采集信息表下载</button>
                <button class="btn-search btn-default" button-click="reUploadPersonList">重新导入</button>
               
            </div>
        </div>
    </div>
</div>
</body>
<script>
$(document).ready(function(){
	$(window).resize(
            function(){
            	eachAreaHeight()
            }
        );
	eachAreaHeight()
    // 页面加载后主内容区域的高度设置
    function eachAreaHeight() {
        var windowHeight = $(window).height();
        //主内容区高度
        $('.main-container').height(windowHeight - $('.current-position').outerHeight(true));
    }
    
		var formFile = $("#formFile").val();
		 //重新导入文件
		 $('[button-click=reUploadPersonList]').click(function() {
			 location.href = "goToUploadPersonListPage.do?method=goToUploadPersonListPage&isNewImport=1";
		 });
		
		 //采集信息表下载
		 $('[button-click=uploadErrorImportDate]').click(function() {
			var formFile = $("#formFile").val();
			document.location.href ='downImportPersonExcel.do?method=downImportPersonExcel&fileName='+formFile;
		 });
})
</script>
</html>