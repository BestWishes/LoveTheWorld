<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/comm/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Love The World</title>
</head>
<body>
	<form action="login" method="post">
		<table>
			<tbody>
				<tr>
					<td>
						账号：
					</td>
					<td>
						<input id="uId" name="uId" type="text"/>
					</td>
				</tr>
				<tr>
					<td>
						密码：
					</td>
					<td>
						<input id="password" name="password" type="password"/>
					</td>
				</tr>
			</tbody>
			
		</table>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>