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

			<div id="_left" style="position: relative;top: -429px;left: 0px;">
				<ul>
					<li onclick="_1li1()" >买家列表</li>
					<li onclick="_2li2()">卖家列表</li>
				</ul>
			</div>
			<div id="_right">
			        	<iframe id="iframe" src="" style="width: 1139px;height: 505px;border:0px;"></iframe>
			</div>
			<script type="text/javascript">
			function _1li1() {
				var str = document.getElementById("iframe");
				str.src="ReadConsumerServlet";
			}
			function _2li2() {
				var str = document.getElementById("iframe");
				str.src="ReadAccount_productServlet";
			}
			
			</script>
</body>
</html>