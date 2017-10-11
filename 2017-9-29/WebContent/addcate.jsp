<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shangpin.css"/>
<link rel="stylesheet" type="text/css" href="css/shanpin.css"/>
</head>
<body>
           <div id="tianjiafeilie">
				<h2 style="    color: cornflowerblue;margin-left: 21px;">添加分类</h2>
				<hr />
				<form action="CateServlet"  method="get" enctype="text/plain" style="margin-left: 50px" >
					分类名称 <inpu t type="text" name="cname" style="height:23px;width: 327px;"   /><br />
					<a id="shangji">上级分类</a>
					 <select name="pid" id="shangji">
						 <option value="1">1</option>
						 <option value="3">3</option>
						 <option value="1">2</option>
				       	 <option value="1">3</option>
					</select>
				
					<input type="submit" name="queren" id="queren" value="确认" />
					<input type="reset" id="chongzhi" value="重置">
				</form>
		</div>

</body>
</html>