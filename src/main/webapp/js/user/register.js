$(document).ready(function(){
	$("#register_form").form({
		url:'register',
		success:function(data){
			alert(data);
		},
		onSubmit:function(){
			alert("2");
		}
	})
	$("#submit").click(function(){
		alert(1);
		$("#register_form").submit();
	})
})