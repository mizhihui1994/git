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
	  <form action="UpdateConsumerOutServlet"  method="post">
				
				<table border="1px" cellspacing="0px" cellpadding="0px"  width="683" height="200" style="border: none;">
						<tr><td>您要修改编号是:</td><td><input name="id" type="text" value="${consumer.id }"/></td>
						</tr>
						<tr><td>用户名</td><td><input name="loginname" type="text" value="${consumer.loginname }"/></td>
						</tr>
						<tr><td>密码</td><td><input name="password" type="text" value="${consumer.password }"/></td></tr>
						<tr><td>注册时间</td><td><input type="text"  name="registertime" value="${consumer.registertime }"/></td></tr>
						<tr><td>最后登录时间</td><td><input type="text"  name="lastlogintime" value="${consumer.lastlogintime }"/></td></tr>
						<tr><td>用户IP</td><td><input name = "ip" type="text" value="${consumer.ip }"/></td></tr>
						<tr><td>用户昵称</td><td><input name = "nickname" type="text" value="${consumer.nickname }"/></td></tr>
						<tr><td>订单金额</td><td><input name = "money" type="text"   value="${consumer.money }" /></td></tr>
						<tr><td>最近消费 </td><td><input name = "lasttime" type="text"  value="${consumer.lasttime }" /></td></tr>
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