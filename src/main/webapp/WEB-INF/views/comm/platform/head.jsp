<%@page import="com.love.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/comm/esayui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/comm/esayui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/comm/esayui/demo.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/esayui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/esayui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/platform/head.js"></script>

<div  style="width: 100%;height: 100%;background-color: gray;">
	<img alt="我的头像" src="${pageContext.request.contextPath }/image/main/user/user.jpg"  style="width: 50px;height: 100%;" align="left">
	<a href="javascript:void(0)" id="userInfo_a" >我的空间</a>   
	<div id="userInfo_div" style="width:150px">
		<div><a href="userInfo">个人资料修改</a></div>
	    <div><a href="userWatch">我关注的人</a></div>
	    <div><a href="userFollow">我的收藏夹</a></div>    
	</div>
	<a href="javascript:{window.location.href='http://localhost:8282/LoveTheWorld/'}" id="index_a">首页</a>
	<%if(session.getAttribute(Constants.SESSION_USER_ID)==null){ %>
		<a href="javascript:void(0)" id="login_a">登录</a>
	<% }else{%>
		<a href="logout" id="logout_a">退出</a>
	<%} %>
	<a href="javascript:void(0)" id="register_a">注册</a>
</div>