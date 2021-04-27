<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	function change(){
		var image=document.getElementById("image");
		image.src="/webProject/VerifyCodeServlet?a="+new Date().getTime();
		
	}
	


</script>

<div align="center">
	<form action="/webProject/RegisterServlet" method="post">

	用户名：<input type="text" name="username" required><br><br>
	密   码：<input type="password" name="password" required><br><br>
	性   别:<input type="radio" name="sex" value="man">男
			<input type="radio" name="sex" value="woman">女<br><br>
	邮箱：<input type="email" name="email"><br><br>
	手机号：<input type="text" name="phone"><br><br>
	<!--  
	验证码：<input type="text" name="code">
			<img src="/webProject/VerifyCodeServlet" id="image">
			<a href="javascript:change()">点击更换图片</a>
			-->
			<br><br>
	<input type="submit" value="注册">
	<%if(null!=request.getAttribute("message")) {%>
	<p style="color:red"><%=request.getAttribute("message") %></p>
	<%} %>
</form>

</div>




	

</body>
</html>