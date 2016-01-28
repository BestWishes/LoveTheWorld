<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
<script type="text/javascript">
	$("#register_submit").click(function(){
		$("#register_form").form('submit',{
			url:'register',
			method:'post',
			onSubmit:function(){
				if(!$("#register_form").form('validate')){
					return false;
				};
			},
			success:function(data){
				$.messager.show({
					title:'恭喜',
					msg:data,
					timeout:2000,
				})
// 				setTimeout(function(){window.location.href="http://localhost:8282/LoveTheWorld/"},2000);
				window.location.href="http://localhost:8282/LoveTheWorld/";
			}
		});
	});
</script>
	<form id="register_form" >
		<table>
			<tr>
				<td>账号:</td>
				<td>
					<input id="uid" name="uid" class="easyui-validatebox" data-options="required:true,missingMessage:'请输入登录账号'">
				</td>
			</tr>
			<tr>
				<td>昵称:</td>
				<td>
					<input id="name" name="name" class="easyui-validatebox" data-options="required:true,missingMessage:'请输入用户昵称'">
				</td>
			</tr>
			<tr>
				<td>密码:</td>
				<td>
					<input id="password" name="password" class="easyui-validatebox">
				</td>
			</tr>
			<tr>
				<td>重复密码:</td>
				<td>
					<input id="re_password" class="easyui-validatebox">
				</td>
			</tr>
			<tr>
				<td>电话:</td>
				<td>
					<input id="tell" name="tell" class="easyui-validatebox">
				</td>
			</tr>
			<tr>
				<td>邮箱:</td>
				<td>
					<input id="email" name="email" class="easyui-validatebox">
				</td>
			</tr>
			<tr>
				<td>头像:</td>
				<td>
					<input id="userImg" name="userImg" class="easyui-validatebox">
				</td>
			</tr>
		</table>
		<input id="register_submit" type="button" class="esayui-linkbutton" value="submit">
	</form>
</body>
</html>