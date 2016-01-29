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
		$("#dictionary_edit_add_div_id").window({
			closable:false,
			minimizable:false,
			collapsible:false,
			maximizable:false,
			inline:false,
			modal:false
		});
		$('#dictionary_edit_add_div_id').window('close');
	    $("#dictionary_form_id").form('reset');
		$("#dictionary_table_id").datagrid({
			url:'dictionaries',
			columns:[[
					{field:'id',title:'ID',width:100,align:'left',hidden:true},
					{field:'dictName',title:'名称',width:100,align:'left',
						editor:{
			                type:'validatebox',
			                options:{
			                    
			                }
			            }	
					},
					{field:'dictValue',title:'值',width:100,align:'left'},
					{field:'isFixed',title:'是否固定',width:100,align:'left',formatter:function(value,row,index){
						if(value=="0"){
							return "是";
						}else{
							return "否";
						}
					}},
					{field:"actions",title:'操作',width:70,align:'center',
			            formatter:function(value,row,index){
		                    var edit = '<a id="dictionary_row_edit_id" href="#" onclick="">修改</a> ';
		                    var c = '<a href="#" onclick="cancelRow('+index+')">取消</a>';
		                    return edit+c;
			            }
			        }
			          ]],
			toolbar:"#dictionay_toolbar_id",
			fitColumns:true,
			idField:'id',
			pagination:true,
			singleSelect:true,
			rownumbers:true,
			striped:true,
			nowrap:true,
			loadMsg:"数据加载中...",
			onDblClickRow:function(rowIndex, field, value){
				alert(rowIndex);
			}
		});
		
		$("#dictionay_button_serachbox_id").click(function(){
			$("#dictionary_table_id").datagrid('reload',{
				dictName:$("#dictionay_dictName_serachbox_id").val(),
				dictValue:$("#dictionay_dictValue_serachbox_id").val()
			})
		});
		
		//添加按钮
		$("#dictionay_button_add_id").click(function(){
			
			$("#dictionary_edit_add_div_id").window('open');
		})
	</script>
	<form id="dictionary_form_id">
		<table id="dictionary_table_id" class="easyui-datagrid">
		</table>
	</form>
	<div id="dictionay_toolbar_id">
		名称:<input class="easyui-textbox" id="dictionay_dictName_serachbox_id"/>
		值:<input class="easyui-textbox" id="dictionay_dictValue_serachbox_id"/>
		<a class="easyui-linkbutton" id="dictionay_button_serachbox_id">search</a>
		<a class="easyui-linkbutton"  data-options=""id="dictionay_button_add_id">新增</a>
	</div>
	
	<div id="dictionary_edit_add_div_id" class="easyui-window">
		<form id="dictionary_edit_add_form_id">
			<table>
				<tr>
					<td>	
					ID：
					</td>
					<td>
						<input class="easyui-textbox" id="dictionary_edit_add_id_id" name="id" data-options="readonly:true"/>
					</td>
				</tr>
				<tr>
					<td>	
					名称：
					</td>
					<td>
						<input class="easyui-textbox" id="dictionary_edit_add_dictName_id" name="dictName"/>
					</td>
				</tr>
				<tr>
					<td>	
					值：
					</td>
					<td>
						<input class="easyui-textbox" id="dictionary_edit_add_dictValue_id" name="dictValue"/>
					</td>
				</tr>
				<tr>
					<td>	
					是否固定：
					</td>
					<td>
						<input class="easyui-textbox" id="dictionary_edit_add_isFixed_id" name="isFixed"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>