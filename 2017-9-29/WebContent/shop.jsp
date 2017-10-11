<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shanpin.css"/>
</head>
<body>
			<div id="_left">
				<ul>
					<li onclick="_li1()" >商品列表</li>
					<li onclick="_li2()">分类列表</li>
					<li onclick="_li3()">规格列表</li>
				</ul>
				
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
		function _li2() {
			var str = document.getElementById("iframe");
			str.src="ReadCateServlet";
			
		}
		function _li3() {
			var str = document.getElementById("iframe");
			str.src="ReadSpec";
			
		}
		
		</script>
</body>
</html>