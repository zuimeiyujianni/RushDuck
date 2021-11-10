<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>RushDuck小型微博系统首页</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
<script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js" type="text/javascript" ></script>
</head>
<body>
<div>
	<div class="wrapper">
		<div class="container">
			<h1>欢迎</h1>
			<form action="userController/login">	
					<button>登陆</button>
			</form>
			<form action="userController/register">	
					<button>注册</button>
			</form>
		</div>
		
		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
</div>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000000">
<div id="msg">
	<h1>
		<c:choose>
			<c:when test="${empty requestScope.msg}">
				RushDuck小型微博系统首页
			</c:when>
			<c:otherwise>
				${requestScope.msg } 
			</c:otherwise>
		</c:choose>
	</h1>
</div>
</div>
</body>
</html>






