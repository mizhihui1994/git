<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品</title>
<link rel="stylesheet" type="text/css" href="css/shanpin.css"/>
</head>
<body>
           <div id="tianjiafeilie">
				<h2 style="    color: cornflowerblue;margin-left: 21px;">添加规格</h2>
				<hr />
				<form action="UpdateSpecServlet"   method="get" enctype="text/plain" style="margin-left: 50px" >
				<br>	<a id="shangji">当前编号</a><input name="id" readonly="readonly" type="text" value="${spec.id }" style="position: relative;left: 6px;top: 10px;width: 326px;height: 24px;"/><br />
					商品编号 <input type="text" name="pid" value="${spec.pid }" style="height:23px;width: 327px;"   /><br />
					<a id="shangji">尺寸大小</a><input name="size" type="text" value="${spec.size }" style="position: relative;left: 6px;top: 10px;width: 326px;height: 24px;"/>
					 
				
					<input type="submit" name="queren" id="queren" value="确认" />
					<input type="reset" id="chongzhi" value="重置">
				</form>
		</div>

</body>
</html>
</body>
</html>