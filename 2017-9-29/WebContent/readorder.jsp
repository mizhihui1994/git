<%@page import="com.neusoft.entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div id= "splb" >
				<form action="ReadProductServlet"  method="post">
					<div id="shuru">
						<input type="submit" value="提交"/><input type="submit" value="删除"/>
						<input type="text" placeholder="admin" ><input type="submit" value="搜索"/>
					<table border="1" cellspacing="0" cellpadding="0" style="border: 1px solid lightblue; font-size: 14px;">
						<tr>
							<td style="width: 150px"><input type="checkbox" />全选/取消</td>
							<td style="width: 150px">dada编号</td>
							<td style="width: 150px">用户名</td>
							<td style="width: 150px">密码</td>
							<td style="width: 150px">注册时间</td>
							<td style="width: 150px">最后登录时间</td>
							<td style="width: 150px">IP地址</td>
							<td style="width: 150px">操作</td>
						</tr>
						
						<c:forEach items="${accounts.datas}" var="pmd" varStatus="status">
							<tr>
							<td style="width: 150px"><input type="checkbox"/></td>
							<td style="width: 150px">
							${status.index+1}
							</td>
							<td style="width: 150px">
							${pmd.loginname}
							</td>
							<td style="width: 150px">
							${pmd.password}
							</td>
							<td style="width: 150px">
							${pmd.registertime}
							</td>
							<td style="width: 150px">
							${pmd.lastlogintime}
							</td>
							<td style="width: 150px">
							${pmd.ip}
							</td>
							<td style="width: 150px">
							<a href="UpdateAccount_productIn?id=${pmd.id }">修改</a> / 
							<a href="DeleteAccount_productServlet?id=${pmd.id}">删除</a>/
							<a href="addAccount_product.jsp">添加</a> 
							</td>
						</tr>
						</c:forEach>
						</table>
	共${accounts.totalcount}条记录${accounts.pageNo}/${accounts.totalPageSize}页 &nbsp;
		
	<c:if test="${accounts.pageNo>0}">
	<a href="ReadProductServlet?reqType=2&pageNo=1&pageSize=5">首页</a>&nbsp;
	</c:if>
	
    <a href="ReadProductServlet?reqType=2&pageNo=${accounts.pageNo==1?accounts.pageNo:accounts.pageNo-1}&pageSize=5">上一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${accounts.pageNo==accounts.totalPageSize?accounts.pageNo:account.pageNo+1}&pageSize=5">下一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${accounts.totalPageSize}&pageSize=5">尾页</a>
	
	第<select onchange="self.location.href=options[selectedIndex].value">
  		
  		<c:forEach begin="0" end="${accounts.totalPageSize-1}" step="1" var="i" >
  		<c:choose>
  		<c:when test="${accounts.pageNo==i+1 }">
  			<option value="ReadProductServlet?reqType=2&pageNo=${i+1} }&pageSize=5" selected="selected">${i+1}</option>
  		</c:when>
  		<c:otherwise>
  		<option value="ReadProductServlet?reqType=2&pageNo=${i+1}&pageSize=5" >${i+1}</option>
  		</c:otherwise>	
		</c:choose>
		</c:forEach>
		</select>				
					</div>
				</form>
			</div>
</body>
</html>