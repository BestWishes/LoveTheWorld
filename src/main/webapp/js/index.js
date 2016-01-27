$(document).ready(function() {

	$("#center_div").panel({
		href:'main',
		title:'首页',
		loadingMessage:'页面加载中...请稍后'
	});
	
	$("#register_a").click(function(){
		$("#center_div").panel({
			href:"getRegister",
			title:"注册"
		})
	})
	
	$("#login_a").click(function(){
		$("#center_div").panel({
			href:"login_jsp",
			title:"用户登录",
//			fit:true
		})
	})
	
//	$("#logout_a").click(function(){
//		$("#center_div").panel({
//			href:"logout"
//		})
//	})
	
	
	$('#menu_ul').tree({
		onClick: function(node){
			$("#center_div").panel({
				href:node.attributes.url
			});
			$("#center_div").panel('setTitle',node.text);
		}
	});


})
