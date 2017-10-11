<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
  <link rel="stylesheet" href="css/qiantai.css" />
</head>
<body >
<div id="main">
	<div id="topnav" >
			<img id="_img" src="img/18.jpg" />
	        <ul class="nav navbar-nav" id="navcon">
                 <li class="current">
                      <a href="" onclick="shouye()">  首页
                      </a> 
                 </li >
                 <li class="current"	>
                      <a href="" target="_blank"> &nbsp;&nbsp;&nbsp;登录
                      </a> 
                 </li>
                  <li class="current">
                      <a href="" target="_blank"> &nbsp;&nbsp;&nbsp;注册
                      </a>
                 </li>
                 <li class="current">
                      <a href="/prolist/index/43" target="_blank"> &nbsp;&nbsp;&nbsp;购物车
                      </a>
                 </li>

                 <li class="current">
                      <a href="" target="_blank"> &nbsp;&nbsp;&nbsp; 联系我们
                      </a>
                 </li>
     		</ul>
		</div>
	</div>
		<div id="_right">
			<iframe id="iframe" src="" style="width: 1139px;height: 505px;border:0px;"></iframe>
		</div>
			
		<script type="text/javascript">
		function _li1() {
			var str = document.getElementById("iframe");
			str.src="ReadProductServlet";
			var str1 = document.getElementById("s1");
			str1.style="background-color: darkmagenta;"
		}	
		</script>
	
</body>
</html>