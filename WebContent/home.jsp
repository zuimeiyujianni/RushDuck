<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta charset="utf-8">
<meta http-equiv="Pragma" content="no-cache">
<!-- 是用于设定禁止浏览器从本地机的缓存中调阅页面内容，设定后一旦离开网页就无法从Cache中再调出  -->
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<link rel="shortcut icon" href="${pageContext.request.contextPath }/${ubm.portraiturl }"/>
<title>${user.username }个人空间 - RushDuck</title>
<link rel='stylesheet' id='style-css'  href='${pageContext.request.contextPath }/css/style.css' type='text/css' media='all' />
<link rel='stylesheet' id='lmlblog-css'  href='${pageContext.request.contextPath }/css/lmlblog.css' type='text/css' media='all' />
<link rel='stylesheet' id='all-css'  href='${pageContext.request.contextPath }/css/all.css' type='text/css' media='all' />
<script type='text/javascript' src='${pageContext.request.contextPath }/js/jquery.min.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath }/js/ueditor.all.min.js'></script>
<style type="text/css">
		.box{
			border: 6px solid white;
			margin: 0px auto;
			width: 678px;
			height:170px;
			padding: 10px;
		}
		.box1
		{
			float: left;
			margin-left:255px;
			width: 150px;
			height: 24px;
			font-size: 14px;
			color: #888;
		}
		.box span{
			font-size: 16px;
			font-weight: bold;
		}
		#text{
			width:  678px;
			height: 100px;
			border: 1px solid #888;
			margin-top: 6px;
		}
		#bt{
			float: right;
			width: 50px;
			height: 30px;
			border: none;
			background: red;
			color: #fff;
			border-radius: 5px;
		}
</style>
<script type="text/javascript">
window.onload = function(){
		var text,number,m,bt;
		text  = document.getElementById('text');
		number = document.getElementById('number');
		bt = document.getElementById('bt');
		text.onkeyup = function(){
			m = 140-text.value.length;
			if(m<0){
				number.style.color="red";
			}else{
				number.style.color="#888";
			}
			number.innerHTML=m;
		}
		bt.onclick = function(){
			if(m==140){
				alert('输入为空');
				text.focus();
			}else if(m<0){
				alert('字数超出限制');
				text.focus();
			}else{
				addMessageAjax();
			}
		}
};
function addMessageAjax(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/addMessage"),
		type:"post",
		data:{
			userid:"${user.userid}",
			messageinfo:$("textarea[name='text']").val(),
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isAddMessageSuccess){
				$("textarea[name='text']").text="";
				alert('发布成功');
				window.location.replace("${pageContext.request.contextPath }/Controller/getPage/${user.userid}/1");
			}else{
				alert('发布失败');
			}
		}
	});
}
function useFollowMethod(){
	if($("#follow").html().trim() == "已关注"){
		removeFollowAjax();
	}else if($("#follow").html().trim() == "+ 关注"){
		addFollowAjax();
	}
}
function addFollowAjax(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/addFollow"),
		type:"post",
		data:{
			befolloweduserid : "${ubm.userid}",
			followeruserid : "${user.userid}",
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isAddFollowSuccess){
				$("#follow").text("已关注");
				alert('关注成功');
				window.location.replace("${pageContext.request.contextPath }/Controller/getPage/${ubm.userid}/1");
			}else{
				alert('关注失败');
			}
		}
	});
}
function removeFollowAjax(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/removeFollow"),
		type:"post",
		data:{
			befolloweduserid: "${ubm.userid}" ,
			followeruserid: "${user.userid}" ,
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isRemoveFollowSuccess){
				$("#follow").text("+ 关注");
				alert('取消关注成功');
				window.location.replace("${pageContext.request.contextPath }/Controller/getPage/${ubm.userid}/1");
			}else{
				alert('取消关注失败');
			}
		}
	});
}
function handleCollection(){
	alert($("#collection").html().trim());
	if($("#collection").html().trim() == "我要收藏")
		addCollectionAjax();
	else if($("#collection").html().trim() == "取消收藏")
		removeCollectionAjax();
}

function addCollectionAjax(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/addCollection"),
		type:"post",
		data:{
			messageid: "${pm[0].message.messageid}" ,
			userid: "${user.userid}" ,
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isAddCollectionSuccess){
				$("#collection").text("取消收藏");
				alert('收藏成功');
				window.location.replace("${pageContext.request.contextPath }/Controller/getPage/${ubm.userid}/1");
			}else{
				alert('收藏失败');
			}
		}
	});
}

function removeCollectionAjax(){
	$.ajax({
		url:encodeURI("${pageContext.request.contextPath }/Controller/removeCollection"),
		type:"post",
		data:{
			messageid: "${pm[0].message.messageid}" ,
			userid: "${user.userid}" ,
		},
		dataType:"json",
		cache:false,
		success:function(msg){
			if(msg.isRemoveCollectionSuccess){
				$("#collection").text("我要收藏");
				alert('取消收藏成功');
				window.location.replace("${pageContext.request.contextPath }/Controller/getPage/${ubm.userid}/1");
			}else{
				alert('取消收藏失败');
			}
		}
	});
}

</script>
</head>

<body>
<!-- 菜单,需要处理的内容上界 -->
<div class="menu-bar">
	<div class="head_content">
		<!-- 去掉图标 -->
		<!-- <h1 class="m-logo"><a href="#" ></a></h1> -->
		<div id="nav" class="menu-menu-1-container">
			<ul id="menu-menu-1" class="menu">
				<!-- 点击可以回到自己的空间，以及显示自己的朋友 -->
				<li class="menu-item menu-item-has-children"><i class="fa fa-home"></i><a>我的账号设置</a>
					<ul class="sub-menu">
						<li class="menu-item"><a href="${pageContext.request.contextPath }/setting.jsp">基本信息设置</a></li>
						<li class="menu-item"><a href="#">私聊信息</a></li>
						<li class="menu-item"><a href="${pageContext.request.contextPath }/Controller/pwd">密码修改</a></li>
						<li class="menu-item"><a href="#">大V认证</a></li>
						<li class="menu-item"><a href="#">会员认证</a></li>
						<li class="menu-item"><a href="${pageContext.request.contextPath }/Controller/quit">退出冲鸭</a></li>
					</ul>
				</li>
				<%-- <li class="menu-item menu-item-type-custom"><a href="${pageContext.request.contextPath }/Controller/setting"><i class="fa fa-home"></i>我的账号设置</a></li> --%>
				<!-- <li class="menu-item menu-item-type-taxonomy menu-item-object-category"><a href="#1"><i class="fa fa-comments-o"></i> 说说</a></li> -->
				<li class="menu-item" draggable="true"><a href="${pageContext.request.contextPath }/Controller/getPage/${user.userid }/1">我的微博</a></li>
				<li class="menu-item"><a href="${pageContext.request.contextPath }/Controller/getPage/${user.userid }/4">朋友圈动态</a></li>
				<li class="menu-item"><a >热门动态</a></li>
			</ul>
		</div> 
		<div class="head_user_info">
	 		<ul>
			   <li id="head_search"><i class="fa fa-search"></i></li> 
			   <li id="head_login"><a href="${pageContext.request.contextPath }/Controller/quit">下线</a></li>
	   		</ul>
		</div>
		<div style="clear: both;"></div>
	</div>
</div>
<!-- menu-bar -->
<!-- 菜单,需要处理的内容下界 -->
<div style="clear: both;"></div>
<div class="lmlblog-member-main">
	<div class="lmlblog-member-bg">
		<div class="lmlblog-member-content">
			<div class="lmlblog-member-header">
				<div class="lmlblog-member-avatar other">
					<img src="${pageContext.request.contextPath }/${ubm.portraiturl }" class="avatar"/>
					<i class="lmlblog-verify lmlblog-verify-a"></i>
				</div>
				<div class="lmlblog-member-username">
					<!-- 这里需要根据昵称，登记，是否是会员，签名等基本信息 -->
					<h1>${ubm.username }</h1>
					<c:choose>
						<c:when test="${ubm.sex eq '男' }">
							<span class="lmlblog-mark lmlblog-boy"><i class="fa fa-venus"></i></span>
						</c:when>
						<c:otherwise>
							<span class="lmlblog-mark lmlblog-girl"><i class="fa fa-mars"></i></span>
						</c:otherwise>
					</c:choose>
					<span class="lmlblog-mark lmlblog-lv">Lv.${ubm.level }</span>
					<c:choose>
						<c:when test="${ubm.vip!=0 }">
							<span class="lmlblog-mark lmlblog-vip">VIP ${ubm.vip }</span>
						</c:when>
					</c:choose>
				</div>
				<div class="lmlblog-member-desc">${ubm.signature }</div>
				<div class="lmlblog-member-follow-info">
					<c:if test="${user.userid ne ubm.userid }">
						<a  onclick="useFollowMethod()">
							<span class="follow no opacity">
								<c:set var="flag" value="false"></c:set>
								<c:forEach items="${befollowids }" var="befollowid">
									<c:if test="${befollowid==ubm.userid }">
										<c:set var="flag" value="true"></c:set>
									</c:if>
								</c:forEach>
								<label name="follow" id="follow">
									<c:choose>
										<c:when test="${flag==false }">
											+ 关注
										</c:when>
										<c:otherwise>
											已关注
										</c:otherwise>
									</c:choose>
								</label>
							</span>
						</a>
						<a>
						<span class="opacity"><i class="lmlblog-icon">&#xe612;</i> 私聊</span>
						</a>
					</c:if>
				</div>
</div>
<!-- 需要处理内容上界 -->
<!-- 用来跳转到用户的不同的页面 -->
<div class="lmlblog-member-menu clear">
	<ul>
		<li>
			<a href="${pageContext.request.contextPath }/Controller/getPage/${ubm.userid }/1">
				<c:choose>
					<c:when test="${user.userid eq ubm.userid }">
						我的动态
					</c:when>
					<c:otherwise>
						ta的动态
					</c:otherwise>
				</c:choose>
			</a></li>
   	 	<li>
   	 		<a href="${pageContext.request.contextPath }/Controller/getPage/${ubm.userid }/2">
   	 			<c:choose>
					<c:when test="${user.userid eq ubm.userid }">
						我的喜欢
					</c:when>
					<c:otherwise>
						ta的喜欢
					</c:otherwise>
				</c:choose>
   	 		</a>
   	 	</li>
   	 	<li>
   	 		<a href="${pageContext.request.contextPath }/Controller/getPage/${ubm.userid }/3">
   	 			<c:choose>
					<c:when test="${user.userid eq ubm.userid }">
						我的收藏
					</c:when>
					<c:otherwise>
						ta的收藏
					</c:otherwise>
				</c:choose>
   	 		</a>
   	 	</li>
	</ul>
</div>
<!-- 需要处理内容下界 -->
<div class="lmlblog-member-content-list clear">
	<!-- 需要处理的多个部分 -->
	<div class="lmlblog-member-left">
		<!-- 添加某个人的关注的一些基本信息 -->
		<div class="lmlblog-member-left-follow clear">
			<ul>
				<li><strong>${num1 }</strong><span>关注</span></li>
			    <li><strong>${num2 }</strong><span>粉丝</span></li>
			   	<!-- 展示收藏微博的数量该用户的微博数量 -->
			    <li><strong>${num3 }</strong><span>收藏</span></li>
			    <li><strong>${num4 }</strong><span>微博</span></li>
			</ul>   
		</div>
		
		<div class="lmlblog-member-left-bg-music clear">
			<h3>背景音乐</h3>
			<div class="aplayer"></div>
			<img src="${pageContext.request.contextPath }/${ubm.portraiturl }">
			<audio src="${ubm.musicurl }" autoplay controls></audio>
		</div>
		
		<!-- 个人资料上界 -->
		<div class="lmlblog-member-left-profile">
			<h3>资料简介</h3>
				<ul>
					<li><i class="fa fa-address-book-o"></i> I D：<span>${ubm.userid } </span></li>
					<li><i class="fa fa-transgender"></i> 性别：<span>${ubm.sex }</span></li>
					<c:choose>
						<c:when test="${empty ubm.birthday }">
							<li><i class="fa fa-clock-o"></i> 生日：<span>暂无</span></li>
						</c:when>
						<c:otherwise>
							<li><i class="fa fa-clock-o"></i> 生日：<span>${ubm.birthday.getMonth()+1 }月${ubm.birthday.getDate() }日</span></li>
						</c:otherwise>
					</c:choose>
					<li><i class="fa fa-smile-o"></i> 签名：<span>${ubm.signature }</span></li>
				</ul>	
			<div class="lmlblog-member-left-profile-hide">
				<ul>
					<li><i class="fa fa-qq"></i> Q Q：<span>${ubm.qq }</span></li>	
					<li><i class="fa fa-wechat"></i> 微信：<span>${ubm.wechat }</span></li>	
					<li> 学校：<span>${ubm.school }</span></li>
					<c:choose>
						<c:when test="${empty ubm.bloodtype }">
							<li> 血型：<span>无</span></li>
						</c:when>
						<c:otherwise>
							<li> 血型：<span>${ubm.bloodtype }型</span></li>
						</c:otherwise>
					</c:choose>	
				</ul>
			</div>
			<div class="lmlblog-member-left-profile-more">查看更多 <i class="fa fa-angle-right"></i></div>
		</div>
		<!-- 个人资料下界 -->
		
		<div class="lmlblog-member-left-visitor clear">
			<h3>最近访客</h3>
				<ul>
					<!-- 获取是否是会员的信息，ID信息，昵称信息 -->
					<c:forEach items="${visiters }" var="visiter">
						<c:choose>
							<c:when test="${visiter.vip>=1 }">
								<li><a href="${pageContext.request.contextPath }/Controller/getPage/${visiter.userid }/1"><span class="lmlblog-vip-icon"></span><img src="${pageContext.request.contextPath }/${visiter.portraiturl }" class="avatar" /><p>${visiter.username }</p></a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${pageContext.request.contextPath }/Controller/getPage/${visiter.userid }/1"><img src="${pageContext.request.contextPath }/${visiter.portraiturl }" class="avatar" /><p>${visiter.username }</p></a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</ul>
		</div>
		
		<div class="lmlblog-member-left-visitor clear">
			<h3>好友列表</h3>
				<ul>
					<!-- 获取是否是会员的信息，ID信息，昵称信息 -->
					<c:forEach items="${friends }" var="friend">
						<c:choose>
							<c:when test="${friend.vip>=1 }">
								<li><a href="${pageContext.request.contextPath }/Controller/getPage/${friend.userid }/1"><span class="lmlblog-vip-icon"></span><img src="${pageContext.request.contextPath }/${friend.portraiturl }" class="avatar" /><p>${friend.username }</p></a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${pageContext.request.contextPath }/Controller/getPage/${friend.userid }/1"><img src="${pageContext.request.contextPath }/${friend.portraiturl }" class="avatar" /><p>${friend.username }</p></a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</ul>
		</div>
</div>

<div class="lmlblog-member-right">
	<!-- ta发布的微博列表，一共是十个 -->
	<div class="lmlblog-post-list">
		<!-- 显示一个美化的图标 -->
		<!-- <div class="lmlblog-posts-list words" style="background-image:url(images/058.png);"> -->
		<c:if test="${pagenumber eq 1 }">
			<c:if test="${user.userid eq ubm.userid }">
				<div class="box">
					<div class="box1">还可以输入<span id='number'></span>字</div>
					<textarea id="text" name="text"> </textarea>
					<input type="button" value="发布" id='bt'>
				</div>
				<div class="lmlblog-post-footer-bar"></div>
			</c:if>
		</c:if>
		
		<!-- 一个微博的上界 -->
		<c:forEach items="${pms }" var="pm">
			<div class="lmlblog-posts-list words">
			<!-- 动态内容部分，包括列表 -->
			    <div class="lmlblog-post-user-info">
			        <div class="lmlblog-post-user-info-avatar">
			            <a href="${pageContext.request.contextPath }/Controller/getPage/${pm.ubm.userid }/1" style="display: inline-block;">
			            	<c:if test="${pm.ubm.vip!=0 }">
			            		<span class="lmlblog-vip-icon"></span>
			            	</c:if>
			                <img src="${pageContext.request.contextPath }/${pm.ubm.portraiturl }" class="avatar">
			            </a>
			    	</div>
			    	<div class="lmlblog-post-user-info-name">
			    	<!-- 用于跳转到某一个用户的界面 -->
			        <a href="">
			            <font style="color:#333;font-weight:600">${pm.ubm.username }</font>
			        </a>
			        <span class="lmlblog-mark lmlblog-lv">Lv.${pm.ubm.level }</span>
			        <c:if test="${pm.ubm.vip>=1 }">
			        	<span class="lmlblog-mark lmlblog-vip">VIP ${pm.ubm.vip }</span>
			        </c:if>
			    	</div>
			    	<!-- <div class="lmlblog-post-user-info-time">4-19 05:25</div> -->
			    	<div class="lmlblog-post-user-info-time"><fmt:formatDate value="${pm.message.messagetime}" type="both"/></div>
				</div>
				<div class="lmlblog-post-content ">
			    <p>${pm.message.messageinfo }</p>   
				</div>
				
				<!-- 根据给出的图片列表，给出图片的基本信息 -->
				<c:if test="${!empty pm.pictures}">
					<div class="lmlblog-post-images-list clear">
						<c:forEach items="${pm.pictures }" var="picture">
							<a href="${pageContext.request.contextPath }/${picture.pictureurl  }" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
				    		<img src="${pageContext.request.contextPath }/${picture.pictureurl  }"></a>
						</c:forEach>
					</div>
				</c:if>
				
				<div class="lmlblog-post-bar">
				    <ul>
				    	<li class="lmlblog-no-like"><i class="lmlblog-icon"></i>喜欢<span>${pm.likesubms.size() }</span></li>
					    <li><i class="lmlblog-icon"></i>评论<span>${pm.cbms.size() }</span></li>
					    <li><i class="lmlblog-icon"></i>转发 <span>${pm.forwardTimes}</span></li>
					    <li><i class="lmlblog-icon"></i>阅读<span>${pm.message.messagereadingtimes }</span></li>
					    <li><i class="lmlblog-icon"></i><a onclick="handleCollection(${pm})"><label name="collection" id="collection" >我要收藏</label></a></li>
				    </ul>
				</div>
				<div class="lmlblog-post-like-list">
					<c:forEach items="${pm.likesubms }" var="likesubm">
						<c:choose>
							<c:when test="${likesubm.authenticated }">
								<a href="${pageContext.request.contextPath }/Controller/getPage/${likesubm.userid }/1" id=""><img src="${pageContext.request.contextPath }/${likesubm.portraiturl }" class="avatar"><i class="lmlblog-verify lmlblog-verify-a"></i></a>
							</c:when>
							<c:otherwise>
								<a href="${pageContext.request.contextPath }/Controller/getPage/${likesubm.userid }/1" id=""><img src="${pageContext.request.contextPath }/${likesubm.portraiturl }" class="avatar"></a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</div>
				<div class="lmlblog-post-footer-bar"></div>
			</div>
		<!-- 一条微博的下界 -->
		</c:forEach>

		<div class="lmlblog-pager">
			<a class="lmlblog-pager-left"></a>
			<div class="lmlblog-pager-center layui-form"> 没有微博啦</div>
			<a class="lmlblog-pager-right"></a>
		</div>	
 	</div>
	</div>
</div>
</div>
</div>	
</div>

<!-- 底部 -->
<div style="clear:both"></div>
<div class="footer">
<div class="footer_b_foot">
<div class="footer_b_top">
</div>
<div class="footer_b_bottom">已经到达了底部，这是底线哦.</div>
  </div>  
</div>
<!-- 返回顶部 -->
<a href="javascript:returnTop();" class="cd-top"></a>
<!-- 返回顶部 -->
<a href="javascript:returnTop();" class="cd-top"></a>
<script type="text/javascript">
var sdelay=0;
function returnTop() {
 window.scrollBy(0,-100);//Only for y vertical-axis
 if(document.body.scrollTop>0) { 
  sdelay= setTimeout('returnTop()',50);
 }
}
</script>
</body>
<script type='text/javascript' src='${pageContext.request.contextPath }/js/base.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath }/js/all.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath }/js/plupload.full.min.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath }/js/layui.js'></script>
<script>
jQuery(document).ready(function($){
	$.fn.smartFloat = function() {
		var position = function(element) {
			var top = element.position().top, pos = element.css("position");
			$(window).scroll(function() {
				var scrolls = $(this).scrollTop();
				if (scrolls > top) {
					if (window.XMLHttpRequest) {
						element.css({ position: "fixed", top: 0 });
					} else {
						element.css({top: scrolls});
					}
				}else {
					element.css({position: "absolute",top: top});
				}
			});
		};
return $(this).each(function() {
	position($(this));
	});
}
</script>
</html>