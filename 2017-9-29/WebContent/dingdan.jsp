<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.neusoft.dao.*" %>
    <%@ page import="com.neusoft.dao.impl.*" %>
    <%@ page import="com.neusoft.entity.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>商品</title>
     <link rel="stylesheet" type="text/css" href="css/shangpin.css"/>
     <script type="text/javascript" src="js/shangpin.js" ></script>
     <script type="text/javascript" ></script>   
     <script type="text/javascript" src="ckeditor/ckeditor.js"></script>
	
</head>
<body>

	<body  onload="shangpinliebiao()">
		
		<div id="login">
			<div id="login-zi">
			    <a href="#">电商系统</a>	
				<a href="#"><img src="img/2.png" width="13px" height="17px" />商品</a>
				<a href="shangpin.jsp"><img src="img/2.png" width="17px" height="17px" />订单</a>
				<a href="huiyuan.jsp"><img src="img/2.png" width="17px" height="17px" />会员</a>
				<a href="#"><img src="img/2.png" width="17px" height="17px" />营销</a>
				<a href="#"><img src="img/1.png" width="17px" height="17px" />统计</a>
				<a href="#"><img src="img/设置.png" width="17px" height="17px" />管理</a>
				<a href="#"><img src="img/5.png" width="17px" height="17px" />账号管理</a>
				<a href="#"><img src="img/6.png" width="17px" height="17px" />更新缓存</a>
			</div>
			<div id="img">
				<img src="img/人物.png" width="20px" height="20px"/>
			</div>
			<div id="login_admin">
				<select id="login_admin_zi">
					
					<option value="volvo">admin</option>
					<option value="saab">admin0</option>
					<option value="opel">admin1</option>
					<option value="audi">admin2</option>
				</select>
			</div>
			
		</div>
		<div id="left_nav">
		
				<div class="left_nav_zi1" id="left_nav_zi1">
					<div id="img_jiahao"  onclick="shplb()">
						<img id="shangpinimg111" src="img/1j.png" style="    width: 32px;"/><p style="    position: relative;top: -33px;">商品列表</p>
					</div>
				</div>
			
				<div class="left_nav_zi" id="left_nav_zi1" onclick="shangpinfenlei()">
					<div id="img_jiahao">
						<img id="shangpinimg112" src="img/1j.png" style="    width: 32px;position: absolute;left: 23px;top: 116px;"/><p style="    position: relative;top: 2px;">商品分类</p>
					</div>
				</div>
				
				<div class="left_nav_zi" id="left_nav_zi1" onclick=" testexpand01()">
					<div id="img_jiahao">
						<img id="div_middle_left_01_img_have1" src="img/1j.png" style="    width: 32px;"/><p style="    position: relative;top: -33px;">商品管理</p>
					</div>
				</div>
				<div id="yincang" style="height: 0px;overflow: hidden;">
					<p id="_p"><img id="pimg1" src="img/1j.png" style="    width: 23px;" onclick="testexpand02()"/>添加商品</p>
					<p id="_p"><img id="pimg2"  src="img/1j.png" style="    width: 23px;" onclick="testexpand03()"/>添加分类</p>
					<p id="_p"><img id="pimg3" src="img/1j.png"  style="    width: 23px;" onclick="testexpand04()"/>添加规格</p>
				</div>
				
				<div class="left_nav_zi" id="left_nav_zi3" onclick="shangpinpinpai()">
					<div id="img_jiahao2">
						<p style="    position: relative;top: 2px;">商品品牌</p>
					</div>
				</div>
			
				
		</div>
		<div id="nav" >
			
			
			<div id="addshangpin" style="height: 0px;width:0px;overflow: hidden;">
				<form action="ProductServlet"  method="post">
				
				<table border="1px" cellspacing="0px" cellpadding="0px"  width="1000" height="100" style="border: none;">
						<tr>
							<td>商品名称</td><td><input name="pname" type="text" value="个性耳坠"/></td>
						</tr>
						<tr>
							<td>所属类别</td>
							<td>
								<select  name="leibie" >
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
						<tr><td>货号</td><td><input type="text"  name="huohao"/></td></tr>
						<tr>
							<td>上传图片</td>
							<td>  <input type="file" name="pic" accept="image/*">
  									<input type="submit"></td>
						</tr>
						<tr>
							<td>商品价格</td><td><input name = "price" type="text" value="50.00"/></td>
						</tr>
						<tr>
							<td>点击数</td><td><input name= "point" type="text" value="99"/></td>
						</tr>
						<tr>
							<td>是否推荐</td><td><input name="tuijian" type="checkbox" />
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
					<input type="submit" value="提交"/>
				</form>
				<script>
					CKEDITOR.replace("ed");
				</script>	
					
				
			</div>
			<div id="tianjiafeilie" style="height: 0px;width:0px;overflow: hidden;">
				<h2 style="    color: cornflowerblue;margin-left: 21px;">添加分类</h2>
				<hr />
				<form action="CateServlet"  method="get" enctype="text/plain" style="margin-left: 50px" >
					分类名称 <input type="text" name="cname" style="height:23px;width: 327px;"   /><br />
					<a id="shangji">上级分类</a>
					 <select name="pid" id="shangji">
						 <option value="1">1</option>
						 <option value="3">3</option>
						 <option value="1">1</option>
				       	 <option value="1">1</option>
					</select>
				
					<input type="submit" name="queren" id="queren" value="确认" />
					<input type="reset" id="chongzhi" value="重置">
				</form>
			</div>
			<div id="tianjiaguige" style="height: 0px;width:0px;overflow: hidden;">
				<h2 style="    color: cornflowerblue;margin-left: 21px;">添加规格商品</h2>
				<hr />
				 <form style="margin-left: 50px"  method="post" enctype="text/plain">
					商品编号<input id="gg1" type="text"  style="height:23px;width: 327px;margin-left: 73px;"  value="8221675136293" /><br /><br />
					现有库存<input id="gg2" type="text"  style="height:23px;width: 327px;margin-left: 73px;"  value="0" /><br /><br />
					库存调节<input id="gg3" type="radio" name="tiaojie" style="margin-left: 73px;" />增加<input style="margin-left: 73px;" type="radio" name="tiaojie" />减少<br />
					<br />
					<input id="gg1" type="text"  style="height:23px;width: 327px;margin-left:137px;"  value="8" /><br /><br />
					销售价格<input id="gg1" type="text"  style="height:23px;width: 327px;margin-left: 73px;"  value="不填写即为商品默认价格" />
				<input type="button" name="queren" id="queren2" value="确认" />
				<input type="reset" id="chongzhi2" value="重置">
				</form> 
			</div>
			<div id="_nav" style="height: 0px;width:0px;overflow: hidden;">
				
			</div>
				<div id="catetianjia" style="height: 0px;width:0px;overflow: hidden;" >
			<table border="1" cellspacing="0" cellpadding="0" style="border: 1px solid lightblue; font-size: 14px;">
					<%
				  	 CateDao p1 =new CateDaoImpl();
					 List<Cate> cateli = p1.getcateList();
				  	 int catelist = cateli.size();
				  	 request.setAttribute("ca", cateli);
					%>
						<tr>
							<td style="width: 150px"><input type="checkbox" />全选/取消</td>
							<td style="width: 150px" name="bianhao">编号</td>
							<td style="width: 150px" bane="leibie">类别名称</td>
							<td style="width: 150px">操作</td>
						</tr>
						
					<%
						for(int i=0;i<catelist-1;i++){%>
							<tr>
							<td style="width: 150px"><input type="checkbox"/></td>
							<td style="width: 150px" name="cid">
							<%= cateli.get(i).getCid() %>
							</td>
							<td style="width: 150px">
							<%= cateli.get(i).getCname() %>
							</td>
							<td style="width: 150px">
							<a href="updatecate.jsp?getcid=<%= cateli.get(i).getCid() %>" name="button_name">修改</a> / <a href="DeleteServlet?retype=4&cid=<%=cateli.get(i).getCid()%>">删除</a>
							</td>
						</tr>
					<%}
					%>
			</table>
			
			
			
			
			
			
			</div>
			
			<div id= "splb" style="height: 0px;width:0px;overflow: hidden;">
				<form action="" >
					<div id="shuru">
						<input type="submit" value="提交"/><input type="submit" value="删除"/>
						<input type="text" placeholder="耳钉" ><input type="submit" value="搜索"/>
					<table border="1" cellspacing="0" cellpadding="0" style="border: 1px solid lightblue; font-size: 14px;">
				<%
				  	 ProductDao p =new ProductDaoImpl();
					 List<Product> li = p.getproductList();
				  	 int sum = li.size();
				  	 request.setAttribute("qaz", li);
				%>
						<tr>
							<td style="width: 150px"><input type="checkbox" />全选/取消</td>
							<td style="width: 150px">编号</td>
							<td style="width: 150px">类别名称</td>
							<td style="width: 150px">类别</td>
							<td style="width: 150px">商品图片</td>
							<td style="width: 150px">商品价格</td>
							<td style="width: 150px">操作</td>
						</tr>
					        <%
						for(int i=0;i<sum-1;i++){%>
							<tr>
							<td style="width: 150px"><input type="checkbox"/></td>
							<td style="width: 150px" name ="id">
							<%= li.get(i).getId() %>
							</td>
							<td style="width: 150px">
							<%= li.get(i).getPname() %>
							</td>
							<td style="width: 150px">
							<%= li.get(i).getCid() %>
							</td>
							<td style="width: 150px">
							<%= li.get(i).getPic()%>
							</td>
							<td style="width: 150px">
							<%= li.get(i).getPrice()%>
							</td>
							
							<td style="width: 150px">
							<a href="updatecate.jsp">修改</a> / <a href="DeleteProduct?id=<%=li.get(i).getId()%>">删除</a>
							</td>
						</tr>
						<%}
						%>
						
					</table>
						
					</div>
				</form>
			</div>
		</div>
	</body>
</body>
</html>