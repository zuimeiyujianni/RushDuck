<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>RushDuck小型微博系统注册界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style2.css">
<script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js" type="text/javascript" ></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#username").focus(function(){
	 	$("#text1").css("color","#FF0000"); 
	 	$("#text1").text("必填,必须是字母数字以及中文组合,长度小于20");
	});
	$("#username").blur(verifyUsername);
	 
	 
	  
	$("#password").focus(function(){
		$("#text2").css("color","#FF0000"); 
		$("#text2").text("必填,支持字母和数字,长度不少于6且不高于100");
	});
	$("#password").blur(verifyPassword);
	
	
	
	$("#phonenumber").focus(function(){
		$("#text3").css("color","#FF0000"); 
		$("#text3").text("必填,当前号码不正确或者未填写");
	});
	$("#phonenumber").blur(verifyPhonenumber);
	
	
	
	$("#sex").focus(function(){
	    $("#text4").css("color","#FF0000"); 
	    $("#text4").text("必填,男 or 女");
	});
	$("#sex").blur(verifySex);
	
	
	
	$("#school").focus(function(){
	   $("#text5").text("选填");
	});
	$("#school").blur(verifySchool);
	
	
	
	$("#emotion").focus(function(){
	    $("#text6").text("选填 :单身,求交往,暗恋中,暧昧中,恋爱中,订婚,已婚,分居或不填");
	});
	$("#emotion").blur(verifyEmotion);
	
	
	
	$("#bloodtype").focus(function(){
	   	$("#text7").text("选填  :A, B, AB, O,或不填");
	});
	$("#bloodtype").blur(verifyBloodtype);
	
	
	
	$("#signature").focus(function(){
	    /* $("#text8").css("color","#FF0000");  */
	    $("#text8").text("选填 ,字数控制在100字以内.");
	    $("#text9").text("例如:我樱木花道果然是个天才");
	});
	$("#signature").blur(verifySignature);
	
	
	
	$("#qq").focus(function(){
	    $("#text11").text("选填");
	});
	$("#qq").blur(verifyQq);
	
	
	
	$("#wechat").focus(function(){
	    $("#text10").text("选填");
	});
	$("#wechat").blur(verifyWechat);
	
	
	
	$("#email").focus(function(){
		$("#text12").text("选填");
	});
	$("#email").blur(verifyEmail);
	
	
	
	$("#name").focus(function(){
	    $("#text13").text("选填,支持中文和英文字母");
	});
	$("#name").blur(verifyName);
	
	
	
	$("#birthday").focus(function(){
	    $("#text14").text("选填或不填,正确格式举例：2020-01-01");
	});
	$("#birthday").blur(verifyBirthday);
});
function verifyUsername(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyUsername"),
		type:"post",
		data:{
			username:$("input[name='username']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isUsernameSuccess){
				$("#text1").text("");
			}else{
				$("#text1").text("昵称已经不可用或者内容输入不正确,使用字符数字以及中文组合,长度小于20");
			}
		}
	});
}

function verifyPassword(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyPassword"),
		type:"post",
		data:{
			password:$("input[name='password']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isPasswordSuccess){
				$("#text2").text("");
			}
		}
	});
}

function verifyPhonenumber(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyPhonenumber"),
		type:"post",
		data:{
			phonenumber:$("input[name='phonenumber']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isPhonenumberSuccess){
				$("#text3").text("");
			}
		}
	});
}

function verifySex(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifySex"),
		type:"post",
		data:{
			sex:$("input[name='sex']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isSexSuccess){
				$("#text4").text("");
			}
		}
	});
}

function verifySchool(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifySchool"),
		type:"post",
		data:{
			school:$("input[name='school']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isSchoolSuccess){
				$("#text5").text("");
			}
		}
	});
}

function verifyEmotion(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyEmotion"),
		type:"post",
		data:{
			emotion:$("input[name='emotion']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isEmotionSuccess){
				$("#text6").text("");
			}
		}
	});
}

function verifyBloodtype(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyBloodtype"),
		type:"post",
		data:{
			bloodtype:$("input[name='bloodtype']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isBloodtypeSuccess){
				$("#text7").text("");
			}
		}
	});
}

function verifySignature(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifySignature"),
		type:"post",
		data:{
			signature:$("input[name='signature']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isSignatureSuccess){
				$("#text8").text("");
				$("#text9").text("");
			}
		}
	});
}

function verifyWechat(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyWechat"),
		type:"post",
		data:{
			wechat:$("input[name='wechat']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isWechatSuccess){
				$("#text10").text("");
			}
		}
	});
}

function verifyQq(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyQq"),
		type:"post",
		data:{
			qq:$("input[name='qq']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isQqSuccess){
				$("#text11").text("");
			}
		}
	});
}

function verifyEmail(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyEmail"),
		type:"post",
		data:{
			email:$("input[name='email']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isEmailSuccess){
				$("#text12").text("");
			}
		}
	});
}	

function verifyName(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyName"),
		type:"post",
		data:{
			name:$("input[name='name']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isNameSuccess){
				$("#text13").text("");
			}
		}
	});
}	

function verifyBirthday(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/verifyBirthday"),
		type:"post",
		data:{
			birthday:$("input[name='birthday']").val()
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isBirthdaySuccess){
				$("#text14").text("");
			}
		}
	});
}	
</script>
</head>

<body>
<div >
	<div class="wrapper">
		<div class="container">
			<h1>注册信息</h1>
			<form action="${pageContext.request.contextPath }/Controller/register_do" method="post">
				<input type="text" id="username" name="username" placeholder="昵称"/>
				<p id="text1"></p>
				<input type="password" id="password" name="password" placeholder="密码"/>
				<p id="text2"></p>
				<input type="text" id="phonenumber" name="phonenumber" placeholder="手机号"/>
				<p id="text3"></p>
				<input type="text" id="sex" name="sex" placeholder="性别"/>
				<p id="text4"></p>
				<input type="text" id="school" name="school" placeholder="学校"/>
				<p id="text5"></p>
				<input type="text" id="emotion" name="emotion" placeholder="感情状况"/>
				<p id="text6"></p>
				<input type="text" id="bloodtype" name="bloodtype" placeholder="血型"/>
				<p id="text7"></p>
				<input type="text" id="signature" name="signature" placeholder="签名"/>
				<p id="text8"></p>
				<p id="text9"></p>
				<input type="text" id="wechat" name="wechat" placeholder="微信"/>
				<p id="text10"></p>
				<input type="text" id="qq" name="qq" placeholder="QQ"/>
				<p id="text11"></p>
				<input type="text" id="email" name="email" placeholder="邮箱"/>
				<p id="text12"></p>
				<input type="text" id="name" name="name" placeholder="真实姓名"/>
				<p id="text13"></p>
				<input type="text" id="birthday" name="birthday" placeholder="生日">
				<p id="text14"></p>
				<button type="submit">提交注册信息</button>
				<br></br>
				<a href="${pageContext.request.contextPath }/index.jsp">返回首页</a>
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
		</ul>
	</div>
</div>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000f000">
<div id="msg">
	<h1>
		<c:choose>
			<c:when test="${empty requestScope.msg}">
				RushDuck MicroBlog
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




