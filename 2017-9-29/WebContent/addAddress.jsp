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
		<form action="AddAddressServlet" >
			省份<input type="text" placeholder = "例如北京市" name="province" style="width: 227px;height: 28px;"><br><br><br>
			城市<input type="text" placeholder = "例如北京市" name="city" style="width: 227px;height: 28px;"><br><br><br>
			城市<input type="text" placeholder = "中关村" name="area" style="width: 227px;height: 28px;"><br><br><br>
		<input type="submit" value="添加" id = "tianjian"><input type="reset" value="重置" id="chongzhi">
		</form>
	</div>
</body>
</html>