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
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrap-theme.min.css.map"/>
<script type="text/javascript" src = "js/bootstrap.min.js"></script>
</head>
<body>
<div id= "splb" >
				<form action="ReadProductServlet"  method="post">
					<div id="shuru">
						<input type="submit" value="提交"/><input type="submit" value="删除"/>
						<input type="text" placeholder="耳钉" ><input type="submit" value="搜索"/>
					<table border="1" cellspacing="0" cellpadding="0" style="border: 1px solid lightblue; font-size: 14px;">
						<tr>
							<td style="width: 150px"><input type="checkbox" />全选/取消</td>
							<td style="width: 150px">编号</td>
							<td style="width: 150px">类别名称</td>
							<td style="width: 150px">类别</td>
							<td style="width: 150px">商品图片</td>
							<td style="width: 150px">商品价格</td>
							<td style="width: 150px">操作</td>
						</tr>
						
						<c:forEach items="${products.datas}" var="pmd" varStatus="status">
							<tr>
							<td style="width: 150px"><input type="checkbox"/></td>
							<td style="width: 150px">
							${status.index+1}
							</td>
							<td style="width: 150px">
							${pmd.pname}
							</td>
							<td style="width: 150px">
							${pmd.cid}
							</td>
								<td><img src="http://localhost:7878/2017-9-29/img/${pmd.pic}"style="width:50px;height:50px;" ></td> 
								
							<td style="width: 150px">
							${pmd.price}
							</td>
							<td style="width: 150px">
							<a href="UpdateProductIn?id=${pmd.id }">修改</a> / 
							<a href="DeleteProductServlet?id=${pmd.id}">删除</a>/
							<a href="addproduct.jsp">添加</a> 
							</td>
						</tr>
						</c:forEach>
						</table>
	共${products.totalcount}条记录${products.pageNo}/${products.totalPageSize}页 &nbsp;
		
	<c:if test="${products.pageNo>0}">
	<a href="ReadProductServlet?reqType=2&pageNo=1&pageSize=5">首页</a>&nbsp;
	</c:if>
	
    <a href="ReadProductServlet?reqType=2&pageNo=${products.pageNo==1?products.pageNo:products.pageNo-1}&pageSize=5">上一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${products.pageNo==products.totalPageSize?products.pageNo:products.pageNo+1}&pageSize=5">下一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${products.totalPageSize}&pageSize=5">尾页</a>
	
	第<select onchange="self.location.href=options[selectedIndex].value">
  		
  		<c:forEach begin="0" end="${products.totalPageSize-1}" step="1" var="i" >
  		<c:choose>
  		<c:when test="${products.pageNo==i+1 }">
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