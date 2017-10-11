<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/address.css"/>
</head>
<body>
	<div id="_div">
		<form action="UpdateaddressServlets" >
			您要修改的编号是：<input readonly="readonly" type="text" value="${address.id }" name="id" style="background-color: burlywood;"><br><br><br>
			省份<input type="text" value="${address.province }" name="province" style="width: 227px;height: 28px;"><br><br><br>
			城市<input type="text" value="${address.city }" name="city" style="width: 227px;height: 28px;"><br><br><br>
			城市<input type="text" value="${address.area }" name="area" style="width: 227px;height: 28px;"><br><br><br>
		<input type="submit" value="修改" id = "tianjian"><input type="reset" value="重置" id="chongzhi">
		</form>
	</div>
</body>
</html>