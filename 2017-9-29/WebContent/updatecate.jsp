<%@page import="com.neusoft.entity.Cate"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/cate.css"/>
<script type="text/javascript">
	function catecheck(id,count) {
		var reg;
		if(count==="*"){
			reg = new RegRxp("^[0-9]"+count+"$");
		}else{
			reg=new RegRxp("^[0-9]{"+count+"}$")
		}
		var cid = document.getElementById(id).value;
		var boo=reg.test(empno);
		if(!boo){
			document.getElementById(id).value="";
		}
	}
</script>
</head>
<body>
	<% Cate cate = (Cate)request.getAttribute("cid"); 
	%>
	<dir id="thead"><h3 >修改商品类别</h3></dir>
	<form action="UpdateCateyujuServlet" method="post" id="_fo"><br>
		编号：<input readonly="readonly" value="<%=cate.getCid() %>" type="text" name="cid" onblur="catecheck('cid','3'); "><br><br><br>
		名称：<input value="<%=cate.getCname() %>"  type="text" name="cname"><br><br><br>
		父类id：<select>
		<option name="pid">1</option></br>
		</select><br><br><br>
		<input id="_tijiao_" type="submit" value="提交"> 
	</form>

</body>
</html>