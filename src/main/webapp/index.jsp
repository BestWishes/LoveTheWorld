<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/comm/common.jsp" %>
<%@page import="com.love.util.Constants" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Love The World</title>
</head>

<body class="easyui-layout">   
    <div data-options="region:'north'" style="height:50px;width: 100%">
			<%@include file="/WEB-INF/views/comm/platform/head.jsp" %>
	</div>  
    <div data-options="region:'south'" style="height:160px;">
			<%@include file="/WEB-INF/views/comm/platform/root.jsp" %>
	</div>  
    <div data-options="region:'west'"
			style="width: 10%; background-color: green">
			<ul id="menu_ul" class="easyui-tree" data-options="url:'menu'">
			</ul>
		</div>  
    <div id="center_div" data-options="region:'center'" style="background:#eee;"></div>   
</body> 

</html>