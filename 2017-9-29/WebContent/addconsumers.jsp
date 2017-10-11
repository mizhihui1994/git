<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	 <div id="addshangpin" >
	  <form action="AddConsumerServlet"  method="post">
				
				<table border="1px" cellspacing="0px" cellpadding="0px"  width="683" height="200" style="border: none;">
						<tr><td>用户名</td><td><input name="loginname" type="text" placeholder="张三"/></td>
						</tr>
						<tr><td>密码</td><td><input name="password" type="text" placeholder="*******"/></td></tr>
						<tr><td>注册时间</td><td><input type="text"  name="registertime"/></td></tr>
						<tr><td>最后登录时间</td><td><input type="text"  name="lastlogintime"/></td></tr>
						<tr><td>用户IP</td><td><input name = "price" type="ip" /></td></tr>
					</table>
					<input type="submit" value="添加"/>
					<input type="reset" value="重置"/>
				</form>
					
				
			</div>
			<style>
			input{
			border:0px
			}
			</style>
</body>
</html>