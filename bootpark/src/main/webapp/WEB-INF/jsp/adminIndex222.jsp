<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
<div align="center">
	<form action="${pageContext.request.contextPath }/saveLogin.action" method="post">

	<h1>管理员页面</h1>
	
			<br><br>
	<input type="submit" value="系统管理">
	<input type="submit" value="空余车位">
	<input type="submit" value="本月收入">
	<input type="submit" value="车流量统计">
	
</form>

</div>

</body>
</html>