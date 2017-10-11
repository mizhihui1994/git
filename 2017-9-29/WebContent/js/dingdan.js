var group01=[{"name":"待支付订单","link":"login.html"},
{"name":"已付款订单","link":"login.html"},
{"name":"已发货订单","link":"login.html"},
{"name":"已完成订单","link":"login.html"}];
var group02=[{"name":"添加会员","link":"time.html"},{"name":"取消会员","link":"about.html"},{"name":"修改会员权限","link":"about.html"}];
//第一个
var group03=[{"name":"订单管理设置","link":"about.html"},{"name":"会员管理设置","link":"about.html"},{"name":"消息设置","link":"about.html"},{"name":"修改昵称","link":"about.html"},{"name":"修改密码","link":"about.html"}];
var group04=[{"name":"已读消息","link":"about.html"},{"name":"未读消息","link":"about.html"}];
var group05=[{"name1":"操作","name2":"订单状态","name3":"物流信息","name4":"订单编号","name5":"商品数量","name6":"定金金额（元）"},
{"name1":"删除|查看","name2":"已完成","name3":"已发货","name4":"232332324343647452","name5":"1","name6":"0.01"},
{"name1":"删除|查看","name2":"已完成","name3":"已发货","name4":"232332324343647452","name5":"1","name6":"0.01"},
{"name1":"删除|查看","name2":"已完成","name3":"已发货","name4":"232332324343647452","name5":"1","name6":"0.01"},];


function init(){
	
//	for(var i=0;i<group01.length;i++){
//			//得到新建的div
//		    var div_have=document.getElementById("yincang");
//			var div_01=document.createElement("div");
//			//将div追加到大div上
//			div_have.appendChild(div_01);
//			div_01.setAttribute("class","div_have_class");
//			div_01.setAttribute("id","div_01_"+i);
//			//添加onclick方法
//			div_01.setAttribute("onclik","test("+"a"+i+")");
//			
//			//创建a标签
//			var div_have_a=document.createElement("a");
////			div_have_a.setAttribute("href","#");
////			div_have_a.setAttribute("target","ifrm");
//			var div_01_word=document.createTextNode(group01[i].name);
//			div_01.appendChild(div_have_a);
//			div_have_a.appendChild(div_01_word);
//			
//			//创建承载>的div框
//			var div_01_math=document.createElement("div");
//			div_01_math.setAttribute("class","div_have_class_math");
//		    var div_01_math_word=document.createTextNode(">");
//			div_01.appendChild(div_01_math);
//			div_01_math.appendChild(div_01_math_word);
//			
//			
//		}
	for(var i=0;i<group02.length;i++){
			//得到新建的div
		    var div_have=document.getElementById("yincang1");
			var div_01=document.createElement("div");
			//将div追加到大div上
			div_have.appendChild(div_01);
			div_01.setAttribute("class","div_have_class");
			div_01.setAttribute("id","div_01_"+i);
			//创建a标签
			var div_have_a=document.createElement("a");
//			div_have_a.setAttribute("href","login.html");
			div_have_a.setAttribute("target","ifrm");
			var div_01_word=document.createTextNode(group02[i].name);
			div_01.appendChild(div_have_a);
			div_have_a.appendChild(div_01_word);
			
			//创建承载>的div框
			var div_01_math=document.createElement("div");
			div_01_math.setAttribute("class","div_have_class_math");
		    var div_01_math_word=document.createTextNode(">");
			div_01.appendChild(div_01_math);
			div_01_math.appendChild(div_01_math_word);
			
			
		}
	for(var i=0;i<group03.length;i++){
			//得到新建的div
		    var div_have=document.getElementById("yincang2");
			var div_01=document.createElement("div");
			//将div追加到大div上
			div_have.appendChild(div_01);
			div_01.setAttribute("class","div_have_class");
			div_01.setAttribute("id","div_01_"+i);
			//创建a标签
			var div_have_a=document.createElement("a");
			div_have_a.setAttribute("href","login.html");
			div_have_a.setAttribute("target","ifrm");
			var div_01_word=document.createTextNode(group03[i].name);
			div_01.appendChild(div_have_a);
			div_have_a.appendChild(div_01_word);
			
			//创建承载>的div框
			var div_01_math=document.createElement("div");
			div_01_math.setAttribute("class","div_have_class_math");
		    var div_01_math_word=document.createTextNode(">");
			div_01.appendChild(div_01_math);
			div_01_math.appendChild(div_01_math_word);
			

			
		}
	for(var i=0;i<group04.length;i++){
			//得到新建的div
		    var div_have=document.getElementById("yincang3");
			var div_01=document.createElement("div");
			//将div追加到大div上
			div_have.appendChild(div_01);
			div_01.setAttribute("class","div_have_class");
			div_01.setAttribute("id","div_01_"+i);
			//创建a标签
			var div_have_a=document.createElement("a");
			div_have_a.setAttribute("href","login.html");
			div_have_a.setAttribute("target","ifrm");
			var div_01_word=document.createTextNode(group04[i].name);
			div_01.appendChild(div_have_a);
			div_have_a.appendChild(div_01_word);
			
			//创建承载>的div框
			var div_01_math=document.createElement("div");
			div_01_math.setAttribute("class","div_have_class_math");
		    var div_01_math_word=document.createTextNode(">");
			div_01.appendChild(div_01_math);
			div_01_math.appendChild(div_01_math_word);
			
			
		}
	
}


function test(ai){
	alert("hhhS")
	var str = document.getElementById("nav");
	var h =str.offsetHeight;
	if(h==0){
		var s="height: 802px ; width: 1106px;";
		str.setAttribute("style",s);
	}else{
		var ss="height: 0px ; width:0px;";
		str.setAttribute("style",ss);
	}
}
function testexpand01(){
//	alert("100");
	//得到div标题
	var get_div=document.getElementById("left_nav_zi1");
	//得到新建的div
	var div_have=document.getElementById("yincang");
	//得到存图片的div
	var div_img=document.getElementById("div_middle_left_01_img_have1");
	//如果是加号则下拉菜单
	if(div_img.src.match("jiahao")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
		get_div.setAttribute("style","background-color: #DF4D4E;");
	//改变div大小	 background-color: #DF4D4E;
	var a="overflow:hidden ;width:200px;height:"+(group01.length*40)+"px; ";
	div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/jiahao.png");
		div_have.setAttribute("style","height: 0px;overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
function testexpand01(){
//	alert("100");
	//得到div标题
	var get_div=document.getElementById("left_nav_zi1");
	//得到新建的div
	var div_have=document.getElementById("yincang");
	//得到存图片的div
	var div_img=document.getElementById("div_middle_left_01_img_have1");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
		get_div.setAttribute("style","background-color: #DF4D4E;");
	//改变div大小	 background-color: #DF4D4E;
	var a="overflow:hidden ;width:200px;height:"+(group01.length*40)+"px; ";
	div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
function testexpand02(){
//	alert("100");
	//得到div标题
	var get_div=document.getElementById("left_nav_zi2");
	//得到新建的div
	var div_have=document.getElementById("yincang1");
	//得到存图片的div
	var div_img=document.getElementById("div_middle_left_01_img_have2");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
		get_div.setAttribute("style","background-color: #DF4D4E;");
	//改变div大小	 background-color: #DF4D4E;
	var a="overflow:hidden ;width:200px;height:"+(group02.length*40)+"px; ";
	div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
function testexpand03(){
//	alert("100");
	//得到div标题
	var get_div=document.getElementById("left_nav_zi3");
	//得到新建的div
	var div_have=document.getElementById("yincang2");
	//得到存图片的div
	var div_img=document.getElementById("div_middle_left_01_img_have3");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
		get_div.setAttribute("style","background-color: #DF4D4E;");
	//改变div大小	 background-color: #DF4D4E;
	var a="overflow:hidden ;width:200px;height:"+(group03.length*40)+"px; ";
	div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
function testexpand04(){
//	alert("100");
	//得到div标题
	var get_div=document.getElementById("left_nav_zi4");
	//得到新建的div
	var div_have=document.getElementById("yincang3");
	//得到存图片的div
	var div_img=document.getElementById("div_middle_left_01_img_have4");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
		get_div.setAttribute("style","background-color: #DF4D4E;");
	//改变div大小	 background-color: #DF4D4E;
	var a="overflow:hidden ;width:200px;height:"+(group04.length*40)+"px; ";

	div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
function shuju(){
	for(var i=0;i<group05.length;i++){
			//得到新建的div
		    var div_have=document.getElementById("shuju");
			var div_01=document.createElement("div");
			//将div追加到大div上
			div_have.appendChild(div_01);
			div_01.setAttribute("class","div_have_class");
			div_01.setAttribute("id","div_01_"+i);
			div_01.setAttribute("style","    border: 1px solid beige;margin: auto;width: 1100px;");
			//创建a标签
			var div_have_a1=document.createElement("a");
			div_have_a1.setAttribute("href","login.html");
			div_have_a1.setAttribute("target","ifrm");
			var div_01_word1=document.createTextNode(group05[i].name1);
			
			
			var div_have_a2=document.createElement("a");
			div_have_a2.setAttribute("href","login.html");
			div_have_a2.setAttribute("target","ifrm");
			var div_01_word2=document.createTextNode(group05[i].name2);
		
			
			var div_have_a3=document.createElement("a");
			div_have_a3.setAttribute("href","login.html");
			div_have_a3.setAttribute("target","ifrm");
			var div_01_word3=document.createTextNode(group05[i].name3);
			
			var div_have_a4=document.createElement("a");
			div_have_a4.setAttribute("href","login.html");
			div_have_a4.setAttribute("target","ifrm");
			var div_01_word4=document.createTextNode(group05[i].name4);
			
			
			var div_have_a5=document.createElement("a");
			div_have_a5.setAttribute("href","login.html");
			div_have_a5.setAttribute("target","ifrm");
			var div_01_word5=document.createTextNode(group05[i].name5);
			
			
			var div_have_a6=document.createElement("a");
			div_have_a6.setAttribute("href","login.html");
			div_have_a6.setAttribute("target","ifrm");
			var div_01_word6=document.createTextNode(group05[i].name6);
			
			div_01.appendChild(div_have_a1);
			div_01.appendChild(div_have_a2);
			div_01.appendChild(div_have_a3);
			div_01.appendChild(div_have_a4);
			div_01.appendChild(div_have_a5);
			div_01.appendChild(div_have_a6);
			div_have_a1.appendChild(div_01_word1);
				div_have_a2.appendChild(div_01_word2);
					div_have_a3.appendChild(div_01_word3);
						div_have_a4.appendChild(div_01_word4);
							div_have_a5.appendChild(div_01_word6);
				div_have_a6.appendChild(div_01_word6);
//			//创建承载>的div框
//			var div_01_math=document.createElement("div");
//			div_01_math.setAttribute("class","div_have_class_math");
//		    var div_01_math_word=document.createTextNode(">");
//			div_01.appendChild(div_01_math);
//			div_01_math.appendChild(div_01_math_word);
			
			
		}
}
function testexpand02(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("yincang");
	//得到存图片的div
	var div_img=document.getElementById("div_middle_left_01_img_have1");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:200px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
}
function wanchengdingdan(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("xinjian");
	//得到存图片的div
	var div_img=document.getElementById("img001");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1106px;height:300px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
}
function weifukuan(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("daizhifudingdan");
	//得到存图片的div
	var div_img=document.getElementById("pimg11");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1117px;height:804px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition=" 1s";
	}//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition=" 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
}