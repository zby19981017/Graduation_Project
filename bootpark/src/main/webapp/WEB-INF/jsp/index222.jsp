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
	<h1>欢迎来到xxx停车场</h1>

	

	<form action="${pageContext.request.contextPath }/park.action" method="post">

	请输入车牌：<input type="text" name="username" required><br><br>

			<br><br>
	<input type="submit" value="进入">
	<%if(null!=request.getAttribute("message")) {%>
	<p style="color:red"><%=request.getAttribute("message") %></p>
	<%} %>
</form>

</div>




	

</body>
</html>