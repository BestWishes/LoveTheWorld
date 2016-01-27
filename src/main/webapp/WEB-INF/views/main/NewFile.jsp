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
	<form id="user_form" action="save" method="post">
		<table>
			<tbody>
				<tr>
					<td>账号:</td>
					<td>
						<input type="text" id="uId" name="uId" />
					</td>
				</tr>
				<tr>
					<td>密码:</td>
					<td>
						<input type="text" id="password" name="password" />
					</td>
				</tr>
				<tr>
					<td>电话:</td>
					<td>
						<input type="text" id="tell" name="tell" />
					</td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td>
						<input type="text" id="email" name="email" />
					</td>
				</tr>
				<tr>
					<td>昵称:</td>
					<td>
						<input type="text" id="name" name="name" />
					</td>
				</tr>
			</tbody>
			<tr>
				<td>
					<input type="submit" value="submit"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>