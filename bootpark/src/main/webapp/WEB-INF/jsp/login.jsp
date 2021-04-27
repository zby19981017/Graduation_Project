<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="shortcut icon" href="img/favicon.png">

    <title>登录/注册</title>

    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

  <body class="login-img3-body">

    <div class="container">

             
        <div class="login-wrap" id="login">
        <form class="login-form" action="${pageContext.request.contextPath }/loginCheck.action" method="post"> 
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" placeholder="昵称" autofocus name="username">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control" placeholder="密码" name="password">
            </div>
            <label class="checkbox">
                <!--<input type="checkbox" value="remember-me"> 记住我  -->
                <span>${message }</span>
                <span class="pull-right"> <a href="#" onclick="toregister()"> 去注册</a></span>
            
            </label>
            <input type="submit" class="btn btn-primary btn-lg btn-block" value="登录" >
            </form>
        </div>
        



    
         <div class="login-wrap" id="register"  style="display: none">
         <form class="login-form" action="${pageContext.request.contextPath }/saveregister.action" method="post"> 
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" placeholder="昵称" autofocus name="userName">
            </div>
             <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" placeholder="手机号" autofocus name="userPhone">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control" placeholder="设置密码" name="userPwd">
            </div>
            <label class="checkbox">
                <span class="pull-right"> <a href="#" onclick="login()"> 去登录</a></span>
            </label>
            <input type="submit" class="btn btn-info btn-lg btn-block" value="注册" >
              </form>
        </div>
    

    </div>
<script type="text/javascript">
function toregister(){
    document.getElementById("login").style.display="none";
    document.getElementById("register").style.display="";

}
function login(){
      document.getElementById("register").style.display="none";
     document.getElementById("login").style.display="";
}
</script>

  </body>
</html>
