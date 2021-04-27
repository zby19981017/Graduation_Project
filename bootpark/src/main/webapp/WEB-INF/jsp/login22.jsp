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

	用户名：<input type="text" name="username" required><br><br>
	密   码：<input type="password" name="password" required><br><br>
	
			<br><br>
	<input type="submit" value="登录">
	
</form>

</div>

</body>
</html>