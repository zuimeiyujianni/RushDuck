<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<link rel="shortcut icon" href="${pageContext.request.contextPath }/${ubm.portraiturl }"/>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>RushDuck密码修改界面</title>
<script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js" type="text/javascript" ></script>
</head>
<body>	
<div id="msg">
	<h1>
		<c:choose>
			<c:when test="${empty requestScope.msg}">
				密码修改界面
			</c:when>
			<c:otherwise>
				${requestScope.msg } 
			</c:otherwise>
		</c:choose>
	</h1>
</div>	
<form action="${pageContext.request.contextPath }/Controller/changePwd" method="post">
	<input type="password" name="oldPwd" placeholder="旧密码"><br/>
	<input type="password" name="newPwd1" placeholder="新密码"><br/>
	<input type="password" name="newPwd2" placeholder="请再次输入新密码"><br/>
	<input type="hidden" name="userid" value="${ user.userid}">
	<button type="submit" id="pwd-submit">确认修改</button>
</form>
<form>	
	<a href="${pageContext.request.contextPath }/index.jsp">返回登录界面</a>
</form>
</body>
</html>
