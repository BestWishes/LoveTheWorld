<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>
<body>
	<script type="text/javascript">
	    $("#dictionary_form_id").form('reset');
		$("#dictionary_table_id").datagrid({
			url:'dictionaries',
			columns:[[
					{field:'id',title:'ID',width:100,align:'left'},
					{field:'dictName',title:'名称',width:100,align:'left'},
					{field:'dictValue',title:'值',width:100,align:'left'},
					{field:'isFixed',title:'是否固定',width:100,align:'left',formatter:function(value,row,index){
						if(value=="0"){
							return "是";
						}else{
							return "否";
						}
					}},
			          ]]
		
		})
	</script>
	<form id="dictionary_form_id">
		<table id="dictionary_table_id" class="easyui-datagrid">
		</table>
	</form>
</body>
</html>