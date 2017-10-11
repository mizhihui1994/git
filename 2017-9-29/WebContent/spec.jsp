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
						<input type="submit" value="提交"/><input type="submit" value="删除"/><a href="addspec.jsp">添加</a> 
						<input type="text" placeholder="rule" ><input type="submit" value="搜索"/>
						
					<table border="1" cellspacing="0" cellpadding="0" style="border: 1px solid lightblue; font-size: 14px;">
						<tr>
							<td style="width: 150px"><input type="checkbox" />全选/取消</td>
							<td style="width: 150px">规格编号</td>
							<td style="width: 150px">商品编号</td>
							<td style="width: 150px">尺寸大小</td>
							<td style="width: 150px">操作</td>
						</tr>
						
						<c:forEach items="${specs.datas}" var="smd" varStatus="status">
							<tr>
							<td style="width: 150px"><input type="checkbox"/></td>
							<td style="width: 150px">
							${status.index+1}
							</td>
							<td style="width: 150px">
							${smd.pid}
							</td>
							<td style="width: 150px">
							${smd.size}
							</td>
							<td style="width: 150px">
							<a href="UpdateSpecIn?id=${smd.id }">修改</a> / 
							<a href="DeleteSpec?id=${smd.id}">删除</a>
							</td>
						</tr>
						</c:forEach>
						</table>
	共${specs.totalcount}条记录${specs.pageNo}/${specs.totalPageSize}页 &nbsp;
		
	<c:if test="${specs.pageNo>0}">
	<a href="ReadProductServlet?reqType=2&pageNo=1&pageSize=5">首页</a>&nbsp;
	</c:if>
	
    <a href="ReadProductServlet?reqType=2&pageNo=${specs.pageNo==1?specs.pageNo:products.pageNo-1}&pageSize=5">上一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${specs.pageNo==specs.totalPageSize?specs.pageNo:specs.pageNo+1}&pageSize=5">下一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${specs.totalPageSize}&pageSize=5">尾页</a>
	
	第<select onchange="self.location.href=options[selectedIndex].value">
  		
  		<c:forEach begin="0" end="${specs.totalPageSize-1}" step="1" var="i" >
  		<c:choose>
  		<c:when test="${specs.pageNo==i+1 }">
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