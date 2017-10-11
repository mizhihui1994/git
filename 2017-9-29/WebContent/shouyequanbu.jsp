<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
  <link rel="stylesheet" href="css/qiantai.css" />
</head>
<body>
  <div id="ppp">
  另一个页面
	<c:forEach items="${shouye.datas}" var="smd" varStatus="statu">
	
		<div id="nava">
			<img src="http://localhost:7878/2017-9-29/img/${smd.pic}"style="width: 137px;margin-left: 43px;" ><br />
		    <a>${smd.pname}</a><br />
		    <a>${smd.price}</a><br />
		    <a>数量</a><input type="text"  style="width: 56px;"/><button>购买</button>
		</div>
	</c:forEach>
		共${shouye.totalcount}条记录${shouye.pageNo}/${shouye.totalPageSize}页 &nbsp;
		
	<c:if test="${shouye.pageNo>0}">
	<a href="ReadProductServlet?reqType=2&pageNo=1&pageSize=5">首页</a>&nbsp;
	</c:if>
	
    <a href="ReadProductServlet?reqType=2&pageNo=${shouye.pageNo==1?shouye.pageNo:shouye.pageNo-1}&pageSize=5">上一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${shouye.pageNo==shouye.totalPageSize?shouye.pageNo:shouye.pageNo+1}&pageSize=5">下一页</a>&nbsp;
	
	<a href="ReadProductServlet?reqType=2&pageNo=${shouye.totalPageSize}&pageSize=5">尾页</a>
	
	第<select onchange="self.location.href=options[selectedIndex].value">
  		
  		<c:forEach begin="0" end="${shouye.totalPageSize-1}" step="1" var="i" >
  		<c:choose>
  		<c:when test="${shouye.pageNo==i+1 }">
  			<option value="ReadProductServlet?reqType=2&pageNo=${i+1} }&pageSize=5" selected="selected">${i+1}</option>
  		</c:when>
  		<c:otherwise>
  		<option value="ReadProductServlet?reqType=2&pageNo=${i+1}&pageSize=5" >${i+1}</option>
  		</c:otherwise>	
		</c:choose>
		</c:forEach>
		</select>	
	</div>	
</body>
</html>