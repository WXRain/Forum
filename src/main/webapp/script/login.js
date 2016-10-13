var SUCCESS = 1;
var ERROR = 0;

$(function() {
	$('#login').click(login);
});

function login() {
	
	var username = $('#username').val();
	var password = $('#password').val();
	var data = {
			'username':username,
			'password':password
	}
	//console.log(data);
	$.ajax({
		url:'account/login.do',
		method:'POST',
		dataType:'JSON',
		data: data,
		success:function(result){
			if(result.state == SUCCESS){
				var user = result.data;
				addCookie('username', user.username);
				addCookie("userId", user.id);
				addCookie("name", user.name);
				alert("欢迎您," + getCookie('name'));
				window.location.href="user.jsp";
			}else{
				alert(result.message);
			}
		}
		
		
	});
}