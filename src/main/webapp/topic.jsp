<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>帖子</title>
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/cookie_util.js"></script>
<script type="text/javascript" src="script/topic.js"></script>
</head>
<body>
	<%
		String topicId = request.getParameter("topicId");
		Cookie cookie = new Cookie("topicId", topicId);
		response.addCookie(cookie);
	%>
</body>
</html>