<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品</title>
<link rel="stylesheet" type="text/css" href="css/shanpin.css"/>
</head>
<body>
		<div id="login">
			<div id="login-zi">
			    <a id="_a" href="#"><strong>电商系统</strong></a>	
				<a id="_a" onclick="shop()"><img src="img/2.png" width="13px" height="17px"  />商品管理</a>
				<a id="_a" href="#" onclick="order()"><img src="img/2.png" width="17px" height="17px" />订单查询</a>
				<a id="_a" href="#" onclick="consumer()"><img src="img/2.png" width="17px" height="17px" />会员管理</a>
				<a id="_a" href="#" onclick="address()"><img src="img/1.png" width="17px" height="17px" />地址信息</a>
				<a id="_a" href="#"><img src="img/设置.png" width="17px" height="17px" />系统设置</a>
				<a id="_a" href="#"><img src="img/5.png" width="17px" height="17px" />消息</a>
			</div>
			<div id="img">
				<img src="img/人物.png" width="20px" height="20px"/>
			</div>
			<div id="login_admin">
				<select id="login_admin_zi">
					
					<option value="volvo">admin</option>
					<option value="saab">admin0</option>
					<option value="opel">admin1</option>
					<option value="audi">admin2</option>
				</select>
			</div>
		</div>
		<div id="xiabian">
		<iframe id="iframes" src="" style="margin-right: -165px;height: 597px;width: 17000px;" >
		
		</iframe>
		
		</div>
		<script type="text/javascript">
		function shop() {
			var str =document.getElementById("iframes");
			str.src="shop.jsp";
		}
		function address() {
			var str =document.getElementById("iframes");
			str.src="ReadAddressServlet";
		}
		function consumer() {
			var str =document.getElementById("iframes");
			str.src="consumer.jsp";
		}
		function order() {
			var str =document.getElementById("iframes");
			str.src="orderinfo.jsp";
		}
		</script>
		
</body>
</html>