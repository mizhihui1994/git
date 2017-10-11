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
				<h2 style="    color: cornflowerblue;margin-left: 21px;">添加规格</h2>
				<hr />
				<form action="AddSpecServlet"  method="get" enctype="text/plain" style="margin-left: 50px" >
					商品编号 <input type="text" name="pid" style="height:23px;width: 327px;"   /><br />
					<a id="shangji">尺寸大小</a><input name="size" type="text" placeholder="********" style="position: relative;left: 6px;top: 10px;width: 326px;height: 24px;"/>
					 
				
					<input type="submit" name="queren" id="queren" value="确认" />
					<input type="reset" id="chongzhi" value="重置">
				</form>
		</div>

</body>
</html>