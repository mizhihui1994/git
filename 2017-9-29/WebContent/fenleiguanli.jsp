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
								<th style="border-bottom: 44px;border-color: aqua;">类型名</th>
								<th style="border-bottom: 44px;border-color: aqua;">父类id</th>
								<th style="border-bottom: 44px;border-color: aqua;">操作</th>
							</tr>
											
						<c:forEach items="${cates.datas}" var="cmd" varStatus="statu">
							<tr>
							<td name="cid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							<input type="checkbox"/>
							${statu.index+1}
							</td>
							<td name="cname" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.cname}
							</td>
							<td name="pid" style="text-align: center;border-bottom: 44px;border-color: aqua;">
							${cmd.pid}
							</td>
							<td style="text-align: center;border-bottom: 44px;border-color: aqua;"><a href="UpdateCateServlet?cid=${cmd.cid}">修改</a>|
							<a href="DeleteCate?cid=${cmd.cid}">删除</a>|
							<a href="addcate.jsp">添加</a></td>
						</tr>
						</c:forEach>
											</table>
						 <div class="msg_page">
							<div>
							共${cates.totalcount}条记录${cates.pageNo}/${cates.totalPageSize}页 &nbsp;
								
							<c:if test="${cates.pageNo>0}">
							<a href="ReadProductServlet?reqType=2&pageNo=1&pageSize=5">首页</a>&nbsp;
							</c:if>
							
						    <a href="ReadCateServlet?reqType=2&pageNo=${cates.pageNo==1?cates.pageNo:cates.pageNo-1}&pageSize=5">上一页</a>&nbsp;
							
							<a href="ReadCateServlet?reqType=2&pageNo=${cates.pageNo==cates.totalPageSize?cates.pageNo:cates.pageNo+1}&pageSize=5">下一页</a>&nbsp;
							
							<a href="ReadCateServlet?reqType=2&pageNo=${cates.totalPageSize}&pageSize=5">尾页</a>
							
							第<select onchange="self.location.href=options[selectedIndex].value">
						  		
						  		<c:forEach begin="0" end="${cates.totalPageSize-1}" step="1" var="i" >
						  		<c:choose>
						  		<c:when test="${cates.pageNo==i+1 }">
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