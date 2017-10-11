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
		<form action="UpdateAccount_productServletOut" >
		    您要修改的编号为：<input type="text" value="${account.id }" name="id" style="border:0px"><br>
			用户名称：<input type="text" value="${account.loginname }" name="loginname" style="width: 227px;height: 28px;"><br>
			账号密码：<input type="text"  value="${account.password }"  name="password" style="width: 227px;height: 28px;"><br>
			注册时间：<input type="text" value="${account.registertime }" name="registertime" style="width: 227px;height: 28px;"><br>
			最近登录：<input type="text" value="${account.lastlogintime }"   name="lastlogintime" style="width: 227px;height: 28px;"><br>
			IP地址：<input type="text" value="${account.ip }"  name="ip" style="width: 227px;height: 28px;"><br>
		<input type="submit" value="修改" id = "tianjian"><input type="reset" value="重置" id="chongzhi">
		</form>
	</div>
</body>
</html>