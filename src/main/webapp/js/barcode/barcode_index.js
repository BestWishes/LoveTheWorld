$(document).ready(function(){
	alert(1);
	var urlStr="";
	
	$("#picForIe").show();
	$("#fileImg").hide();
	$("#imgfile").change(function(){
		var fileObj=$("#imgfile")[0];
		if(window.browser.name=="ie"){
			fileObj.select();
			fileObj.blur();
			document.getElementById("picForIe").style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale',src='"+document.selection.createRange().text+"')";
			$("#picForIe").show();
			$("#fileImg").hide();
			urlStr=$("#picForIe").attr('src');
		}else{
			$("#fileImg").show();
			$("#picForIe").hide();
			$("#fileImg").attr('src',window.URL.createObjectURL(fileObj.files[0]));
			urlStr=$("#fileImg").attr('src');
		}
		
	})

	$("#barcode_button").click(function(){
		document.getElementById("barcodeimg").innerHTML="";
		$("#barcodeimg").append("<div id='qr_container' style='margin:auto; position:relative;'></div>");
        $("#barcodeimg").qrcode({ 
            render: "canvas", // 渲染方式有table方式（IE兼容）和canvas方式
            width: 210, //宽度 
            height:210, //高度 
            text: UTF8_TO_URL($("#content").val()), //内容 
            src:urlStr	
        });	
	})
	
	
})