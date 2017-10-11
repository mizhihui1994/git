<%@page import="com.neusoft.entity.Product"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改商品</title>
 <link rel="stylesheet" type="text/css" href="css/shangpin.css"/>
   <script type="text/javascript" src="ckeditor/ckeditor.js"></script>
</head>
<body>
   <div id="addshangpin" >
   <%  Product product=(Product) request.getAttribute("product");
   %>
	  <form action="UpdateProductout"  method="post">
				
				<table border="1px" cellspacing="0px" cellpadding="0px"  width="1000" height="100" style="border: none;">
						<tr>
							<td>商品编号</td><td><input name="id" readonly="readonly" type="text" value="<%=product.getId()%>"/></td>
						</tr>
						<tr>
							<td>商品名称</td><td><input name="pname" type="text" value="<%=product.getPname()%>"/></td>
						</tr>
						<tr>
							<td>所属类别</td>
							<td>
								<select  name="leibie"  >
									<option value= "1" >1</option>
									<option value= "2" >2</option>
									<option value= "3" >4</option>
									<option value= "4" >2</option>
								</select>`
								<!--<select name="type2">
									<option >宝石色</option>
									<option >玛瑙色</option>
									<option >珍珠色</option>
									<option >其它</option>  -->
								</select>
							</td>
							
						</tr>
						<tr><td>货号</td><td><input type="text"  name="huohao" value="<%=product.getPno()%>"/></td></tr>
						<tr>
							<td>上传图片</td>
							<td>  <input type="file" name="pic" value="<%=product.getPic()%>" accept="image/*">
  									<input type="submit"></td>
						</tr>
						<tr>
							<td>商品价格</td><td><input name = "price" type="text" value="<%=product.getPrice()%>"/></td>
						</tr>
						<tr>
							<td>点击数</td><td><input name= "point" type="text" value="<%=product.getPoint()%>"/></td>
						</tr>
						<tr>
							<td>是否推荐</td><td><input name="tuijian"  type="checkbox" />
						</tr>
						<tr>
							<td>是否上线</td><td><input name="shangxian" type="checkbox" />
						</tr>
						<tr>
							<td>是否特价</td><td><input name="tejia" type="checkbox"/>
						</tr>
						<tr>
							<td>商品详情</td><td>
						
							<!-- <img src="img/13.jpg" /> -->
							
							<textarea rows="" cols="" id="ed" name="ed">
								
							</textarea>
							
							 </td>
						</tr>
					</table>
					<input type="submit" value="添加"/>
				</form>
				<script>
					CKEDITOR.replace("ed");
				</script>	
					
				
			</div>
</body>
</html>