<%@page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>登录</title>
	<script type="text/javascript" src="script/jquery.min.js"></script>
	<script type="text/javascript" src="script/cookie_util.js"></script>
	<script type="text/javascript" src="script/login.js"></script>
	<script type="text/javascript" src="script/jquerySession.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>用户名:</td>
			<td><input type="text" id="username" value="abc" /></td>
			<td><span></span></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><input type="password" id="password" value="123" /></td>
			<td></td>
		</tr>
		<tr>
			<td><input type="button" value="登录" id="login" /></td>
			<td><input type="button" value="注册" id="regist" /></td>
			<td></td>
		</tr>
	</table>
</body>
</html>
