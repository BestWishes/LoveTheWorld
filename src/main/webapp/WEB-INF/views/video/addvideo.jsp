<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<%@page import="com.love.util.Constants"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>

<body>
	<script type="text/javascript">
	$("#addvideoform").form({
		url:'addvideo',
		method:'post',
		novalidate:true,
		ajax:true,
		
		onSubmit:function(){
			if(!$("#addvideoform").form('validate')){
				$.messager.alert("提示","请选择文件");
				return false;
			}
		},
		success:function(data){
			$.messager.show({
				title: '提示',
				msg: data,
				timeout:2000,
				showType:'show'
			});		
			$("#name").filebox("setValue","");
			return false;
		}
	
	});
		$("#addvideoform_submit_id").click(function() {
			var name=$("#name").filebox('getValue');
			$("#addvideoform").form('submit',{
				queryParams:{'name':name}
			});
		});

	</script>
	<form id="addvideoform" name="addvideoform" method="post">
		<table>
			<tbody>
				<tr>
					<td>观看权限</td>
					<td><input id="video_level_select" class="easyui-combobox"
						name="level"
						data-options="valueField:'dictDataValue',
					        textField:'dictDataName',
					        url:'dictDataList',
					        queryParams:{'dictValue':'<%=Constants.DICTIONAYDATA_VIDEOLEVEL%>'},
					        required:true,editable:false,panelHeight:'auto',
					        onLoadSuccess:function(){
					        	var temp = $(this).combobox('getData');
					        	if(temp.length>0){
					        	 $(this).combobox('select', temp[0].dictDataValue);
					        	}
					        }
					        "/>
        			</td>
				</tr>
				<tr>
					<td>影片类型</td>
					<td><input id="video_type_select" class="easyui-combobox"
						name="type"
						data-options="valueField:'dictDataValue',
					        textField:'dictDataName',
					        url:'dictDataList',
					        queryParams:{'dictValue':'<%=Constants.DICTIONAYDATA_VIDEOTYPE%>'},
					        required:true,
					        editable:false,
					        panelHeight:'auto',
					        onLoadSuccess:function(){
					        	var temp = $(this).combobox('getData');
					        	if(temp.length>0){
					        	 $(this).combobox('select', temp[0].dictDataValue);
					        	}
					        }
					        "/>
					</td>
				</tr>
				<tr>
					<td>影片路径</td>
					<td><input class="easyui-filebox" id="name" data-options="required:true,multiple:'ture',buttonText:'选择文件',buttonAlign:'left',width:200"
						multiple="multiple" />
						</td>
				</tr>
			</tbody>
		</table>
		<input id="addvideoform_submit_id" type="button" value="submit"
			class="easyui-linkbutton" />
	</form>
</body>
</html>