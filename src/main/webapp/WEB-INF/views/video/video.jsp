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
	$("#video_list_ul").tree({
		onClick:function(node){
			if(node.attributes!=undefined){
				$.messager.show({
					title:"提示",
					msg:"将在2秒钟后开始播放"+node.text,
					timeout:2000
				})
				$("#videoSrc").attr('src','videoplay?path='+node.attributes.path+'');
				
				setTimeout(document.getElementById('videoSrc').play(),2000);
				}
			}
		
	});
</script>
	<div id="video_div">
		<div id="video_west_div" align="left"
			style="width: 10%; background-color: green; height: 100% ;float: left;">
			<ul id="video_list_ul" class="easyui-tree" data-options="url:'videolist'">
			</ul>
		</div> 
		<div id="video_center_div" align="center"
			style="background: #eee; float: right: ;">
			<video id="videoSrc" controls="controls" style="height: 100%" >
				<source type="video/mp4">
			</video>
		</div>
	</div>
</body>
</html>