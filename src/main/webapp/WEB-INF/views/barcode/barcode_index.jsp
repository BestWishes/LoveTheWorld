<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/comm/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/main/encoding_util.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/comm/main/browser_type_util.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/barcode/jquery-1.8.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/barcode/barcode_index.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/barcode/excanvas.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/barcode/qrcode.js"></script>

<title>Love The World</title>
</head>

<body>
	<div align="center">
		<form action="barcode" method="post" id="barcode_form" enctype="multipart/form-data">
			<table>
				<tr>
					<td> 
						<h1 style="color: red;">二维码表示信息:</h1> 
					</td>
					<td colspan="2">
						<input id="content" name="content" style="width: 600px;height: 100px ;" >
					</td>
				</tr>
				<tr>
					<td> 
						<h1 style="color: red;">logo 图 片:</h1> 
					</td>
					<td>
						<input class="newFileClass" id="imgfile" name="imgfile" type="file" style="width:400px;"> 
					</td>
					<td>
						<div id="picForIe" style="border: 5px solid #eee; width:150px; height:150px; margin: 3px; "></div>
						<img id="fileImg" alt="图片预览" src="" width="150" height="150" style="border: 5px solid #eee; margin: 3px;">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div align="center">
			<button id="barcode_button" class="easyui-linkbutton">生成二维码</button><br><br><br>
			<div id="barcodeimg" align="center" >
				<div id="qr_container" style="margin:auto; position:relative;"></div>
			</div>
	</div>
</body>
</html>