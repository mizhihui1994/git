<%@page import="com.neusoft.entity.PageModel"%>
<%@page import="com.neusoft.entity.Cate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/cate.css"/>
</head>
<body>

	<form action="ReadCateServlet"  method="post">
					<div id="shuru">
						<input type="submit" value="提交"/><input type="submit" value="删除"/>
						<input type="text" placeholder="耳钉" ><input type="submit" value="搜索"/>
							<table border="1" cellspacing="0" cellpadding="0" style="border: 1px solid lightblue; font-size: 14px;">
							<tr>
								<th style="border-bottom: 44px;border-color: aqua;">编号</th>
								<th style="border-bottom: 44px;border-color: aqua;">用户名</th>
								<th style="border-bottom: 44px;border-color: aqua;">密码</th>
								<th style="border-bottom: 44px;border-color: aqua;">注册时间</th>
								<th style="border-bottom: 44px;border-color: aqua;">最后登录时间</th>
								<th style="border-bottom: 44px;border-color: aqua;">用户IP</th>
								<th style="border-bottom: 44px;border-color: aqua;">用户昵称</th>
								<th style="border-bottom: 44px;border-color: aqua;">订单金额</th>
								<th style="border-bottom: 44px;border-color: aqua;">最近消费</th>
								<th style="border-bottom: 44px;border-color: aqua;">操作</th>
							</tr>
											
						<c:forEach items="${consumers.datas}" var="cmd" varStatus="statu">
							<tr>
							<td name="cid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							
							${status.index+1}
							</td>
							<td name="cname" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.loginname}
							</td>
							<td name="pid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.password}
							</td>
							<td name="cid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.registertime}
							</td>
							<td name="cid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							<input type="checkbox"/>
							${cmd.lastlogintime}
							</td>
							<td name="cname" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.ip}
							</td>
							<td name="pid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.nickname}
							</td>
							<td name="cid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.money}
							</td>
							<td name="cname" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.lasttime }
							</td>
							<td style="text-align: center;border-bottom: 44px;border-color: aqua;"><a href="UpdateConsumerInServlet?id=${cmd.id}">修改</a>|
							<a href="DeleteCate?cid=${cmd.id}">删除</a>|
							<a href="addconsumers.jsp">添加</a></td>
						</tr>
						</c:forEach>
											</table>
						 <div class="msg_page">
							<div>
							共${consumers.totalcount}条记录${consumers.pageNo}/${consumers.totalPageSize}页 &nbsp;
								
							<c:if test="${consumers.pageNo>0}">
							<a href="ReadProductServlet?reqType=2&pageNo=1&pageSize=5">首页</a>&nbsp;
							</c:if>
							
						    <a href="ReadCateServlet?reqType=2&pageNo=${consumers.pageNo==1?consumers.pageNo:consumers.pageNo-1}&pageSize=5">上一页</a>&nbsp;
							
							<a href="ReadCateServlet?reqType=2&pageNo=${consumers.pageNo==consumers.totalPageSize?consumers.pageNo:consumers.pageNo+1}&pageSize=5">下一页</a>&nbsp;
							
							<a href="ReadCateServlet?reqType=2&pageNo=${consumers.totalPageSize}&pageSize=5">尾页</a>
							
							第<select onchange="self.location.href=options[selectedIndex].value">
						  		
						  		<c:forEach begin="0" end="${consumers.totalPageSize-1}" step="1" var="i" >
						  		<c:choose>
						  		<c:when test="${consumers.pageNo==i+1 }">
						  			<option value="ReadCateServlet?reqType=2&pageNo=${i+1} }&pageSize=5" selected="selected">${i+1}</option>
						  		</c:when>
						  		<c:otherwise>
						  		<option value="ReadCateServlet?reqType=2&pageNo=${i+1}&pageSize=5" >${i+1}</option>
						  		</c:otherwise>	
								</c:choose>
								</c:forEach>
								</select>	
								</div>
								</div>
		 </div>
	 </form>
</body>
</html>