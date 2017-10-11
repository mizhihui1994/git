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
		<form action="AddAccount_productServlet" >
			用户名称<input type="text" placeholder = "admin" name="loginname" style="width: 227px;height: 28px;"><br>
			账号密码<input type="text" placeholder = "****" name="password" style="width: 227px;height: 28px;"><br>
			注册时间<input type="text" name="registertime" style="width: 227px;height: 28px;"><br>
			最近登录<input type="text"  name="lastlogintime" style="width: 227px;height: 28px;"><br>
			最近登录<input type="text"  name="ip" style="width: 227px;height: 28px;"><br>
		<input type="submit" value="添加" id = "tianjian"><input type="reset" value="重置" id="chongzhi">
		</form>
	</div>
</body>
</html>