var imgs=[ 
{"bianhao":"1","img":"img/11.jpg","content":"不对称耳环","kucun":"9","paixun":"1","caozuo":"修改|删除"},
{"bianhao":"2","img":"img/12.jpg","content":"回形状耳钉","kucun":"10","paixun":"2","caozuo":"修改|删除"},
{"bianhao":"3","img":"img/13.jpg","content":"翠绿耳坠","kucun":"11","paixun":"4","caozuo":"修改|删除"},
{"bianhao":"4","img":"img/14.jpg","content":"花型耳钉","kucun":"8","paixun":"3","caozuo":"修改|删除"},
{"bianhao":"5","img":"img/15.jpg","content":"流苏耳坠","kucun":"9","paixun":"6","caozuo":"修改|删除"},
{"bianhao":"6","img":"img/16.jpg","content":"珍珠耳坠","kucun":"7","paixun":"7","caozuo":"修改|删除"},
{"bianhao":"7","img":"img/17.jpg","content":"小仙女流苏耳坠","kucun":"9","paixun":"8","caozuo":"修改|删除"},
{"bianhao":"8","img":"img/18.jpg","content":"复古耳坠","kucun":"9","paixun":"3","caozuo":"修改|删除"},
{"bianhao":"9","img":"img/19.jpg","content":"不对称耳环","kucun":"13","paixun":"3","caozuo":"修改|删除"},
{"bianhao":"10","img":"img/13.jpg","content":"长而坠","kucun":"13","paixun":"2","caozuo":"修改|删除"},
{"bianhao":"11","img":"img/11.jpg","content":"不对称耳环","kucun":"9","paixun":"1","caozuo":"修改|删除"},
 ];
function shangpinliebiao(){
	var _nav = document.getElementById("_nav");
//	_nav.style.backgroundColor="white";
	var _div = document.createElement("div");
	_div.setAttribute("id","_div");
	_div.setAttribute("style","width:1166px;height: 30px; border: 1px solid #DCDCDC;");
	var _butten = document.createElement("button");
	_butten.setAttribute("style","width:66px;height: 20px;  border-radius: 8px;   position: relative;top: 7px;left: 40px;");
//	var _text = document.createElement("P");
	var _c = document.createTextNode("提交");
	_butten.appendChild(_c);
	_div.appendChild(_butten);
	var _butten = document.createElement("button");
	_butten.setAttribute("style","width:66px;height: 20px;  border-radius: 8px;   position: relative;top: 7px;left: 46px;");
//	var _text = document.createElement("P");
	var _c = document.createTextNode("删除");
	_butten.appendChild(_c);
	_div.appendChild(_butten);
	var _butten = document.createElement("button");
	_butten.setAttribute("style","width:66px;height: 20px;  border-radius: 8px;   position: relative;top: 7px;left: 51px;");
//	var _text = document.createElement("P");
	var _c = document.createTextNode("回收站");
	_butten.appendChild(_c);
	_div.appendChild(_butten);
	var _input = document.createElement("input");
	_input.setAttribute("style","    position: relative;left: 630px;top: 3px;");
	_div.appendChild(_input);
	var _butten = document.createElement("button");
	_butten.setAttribute("style","width:66px;height: 21px;  position: relative;top: 5px;left: 633px;");
//	var _text = document.createElement("P");
	var _c = document.createTextNode("搜索");
	_butten.appendChild(_c);
	_div.appendChild(_butten);
	
	_nav.appendChild(_div);
	
	var str_1 = document.createElement("_div"); 
	str_1.setAttribute("id","_logo");
	str_1.setAttribute("style","width: 1093px; height: 35px; border: 1px solid #DCDCDC;    position: relative; top: 12px;left: 34px;")
	
	_nav.appendChild(str_1);
	
	var xuankuang= document.createElement("input");
	xuankuang.setAttribute("type","checkbox");
	xuankuang.setAttribute("style","  position: relative; top: 12px;");
	str_1.appendChild(xuankuang);
	xuankuang.setAttribute("name","xuankuang1");
	xuankuang.setAttribute("id","xuankuang1");

	var _p1= document.createElement("a");
	_p1.setAttribute("style","    position: relative;top: 10px;     left: 40px;")
	var wenben1= document.createTextNode("编号");
	_p1.appendChild(wenben1);
	str_1.appendChild(_p1);
	var _p1= document.createElement("a");
	_p1.setAttribute("style","    position: relative;top: 10px;     left: 182px;")
	var wenben1= document.createTextNode("名称");
	_p1.appendChild(wenben1);
	str_1.appendChild(_p1);
	var _p1= document.createElement("a");
	_p1.setAttribute("style","    position: relative;top: 10px; left: 369px;")
	var wenben1= document.createTextNode("库存");
	_p1.appendChild(wenben1);
	str_1.appendChild(_p1);
	var _p1= document.createElement("a");
	_p1.setAttribute("style","    position: relative;top: 10px;     left: 491px;")
	var wenben1= document.createTextNode("上架");
	_p1.appendChild(wenben1);
	str_1.appendChild(_p1);
	var _p1= document.createElement("a");
	_p1.setAttribute("style","    position: relative;top: 10px;     left: 608px;")
	var wenben1= document.createTextNode("排序");
	_p1.appendChild(wenben1);
	str_1.appendChild(_p1);
	var _p1= document.createElement("a");
	_p1.setAttribute("style","    position: relative;top: 10px; left: 724px;")
	var wenben1= document.createTextNode("操作");
	_p1.appendChild(wenben1);
	str_1.appendChild(_p1);
	for (var i = 0;i<imgs.length;i++) {
		var _nav = document.getElementById("_nav");
		var _div2 = document.createElement("div");
		_div2.setAttribute("id","div2id"+i);
		_div2.setAttribute("style","width: 1093px;height: 60px ; border: 1px solid #DCDCDC; border-top: 0px;   position: relative;top: 11px;left: 34px;")
		_nav.appendChild(_div2);
		var xuankuang= document.createElement("input");
		xuankuang.setAttribute("style","  position: relative; top: 20px;");
		xuankuang.setAttribute("type","checkbox");
		_div2.appendChild(xuankuang);
		var _p3 =document.createElement("p");
		var wenben2=document.createTextNode(imgs[i].bianhao);
		_p3.appendChild(wenben2);
		_div2.appendChild(wenben2);
	

		var _div2_1 = document.createElement("div");
		_div2_1.setAttribute("style","width: 10px;height: 10px; width: 78px;height: 58px;position: relative;top: -20px;left: 114px;");
		var _img = document.createElement("img");
		
		_img.setAttribute("src",imgs[i].img);
		_img.setAttribute("id","img_1"+i+"a");
//		_img.setAttribute("")
		_img.setAttribute("style","    height: 58px;width: 78px;border-radius: 4px;position: relative;top: -52px; ");
		_div2_1.appendChild(_img);
		var _p3 = document.createElement("P");
		_p3.setAttribute("style","    position: relative;left: 231px;top: -18px;");
		var wenben4=document.createTextNode(imgs[i].content);
		_p3.appendChild(wenben4);
		_div2.appendChild(_p3);
		_div2.appendChild(_div2_1);
		var _p4 = document.createElement("a");
		//_p4.setAttribute("style","    position: relative;left: 231px;top: -18px;display: inline-block;");
//		var wenben5=document.createTextNode(imgs[i].kucun);
//		_p4.appendChild(wenben5);
//		_div2.appendChild(_p4);
//		_div2.appendChild(_div2_1);
		
//		_img.onmouseover
//      _div2_1._setonmouseover="yidong(_img);");
		var _div2_3 = document.createElement("div");
		_div2_3.setAttribute("style","  display: inline-block;  width: 657px;height: 30px;position: absolute;top:15px;left: 454px;");
//		var _div2_3_1=document.createElement("div");
//		_div2_3_1.setAttribute("style","    width: 200px;height: 60px;border: 1px solid royalblue;");
//		
		var _a=document.createElement("a");
		var wenben6=document.createTextNode(imgs[i].kucun);
		_a.appendChild(wenben6);
		_div2_3.appendChild(wenben6);
		
		var _div2_4= document.createElement("div");
		_div2_4.setAttribute("style","   display: block;  width: 45px;height: 27px;position: relative; left: 153px;top: -80px;");
		var xuankuang= document.createElement("input");
		xuankuang.setAttribute("style","  position: relative; top: -22px;");
		xuankuang.setAttribute("type","checkbox");
		_div2_4.appendChild(xuankuang);
		
		
		var _div2_5= document.createElement("div");
		_div2_5.setAttribute("style","   display: block;  width: 45px;height: 27px;position: relative; left:297px;top: -50px;");
		var _pp = document.createElement("p");
		_pp.setAttribute("style","    position: relative;top: -26px;")
		var wenben7 = document.createTextNode(imgs[i].paixun);
		_pp.appendChild(wenben7);
		
		
		var _div2_6= document.createElement("div");
		
		_div2_6.setAttribute("style","   display: block;  width: 83px;height: 27px;position: relative; left:447px;top: -20px;");
	    var _ppp = document.createElement("p");
		_ppp.setAttribute("style","    position: relative;top: -17px;")
		var wenben8 = document.createTextNode(imgs[i].caozuo);
		_ppp.appendChild(wenben8);
		_div2_6.appendChild(_ppp);
		
		_div2_5.appendChild(_pp);
		_div2_3.appendChild(_div2_6);
		_div2_3.appendChild(_div2_5);
		_div2_3.appendChild(_div2_4);
//		_div2_3.appendChild(_div2_3_1);	
		_div2.appendChild(_div2_3);
	}
	
	
}
//function yidong(object){
//	var str = document.getElementById(object.id);
//	str.style.width="100px";
//	str.style.height="100px";
//}


function shangpinfenlei(){

	//得到新建的div
	var div_have=document.getElementById("catetianjia");
	//得到存图片的div
	var div_img=document.getElementById("shangpinimg112");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:802px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	

}
function shangpinleixing(){
	var _nav = document.getElementById("nav");
	_nav.style.backgroundColor="skyblue";
	_nav.innerHTML="这里是商品类型";
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
	var a="overflow:hidden ;width:200px;height:111px; ";
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
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("addshangpin");
	//得到存图片的div
	var div_img=document.getElementById("pimg1");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:802px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
function testexpand03(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("tianjiafeilie");
	//得到存图片的div
	var div_img=document.getElementById("pimg2");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:474px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
	
}
function testexpand04(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("tianjiaguige");
	//得到存图片的div
	var div_img=document.getElementById("pimg3");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
    //		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:474px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition=" 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition=" 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
	
}
function testexpand04(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("tianjiaguige");
	//得到存图片的div
	var div_img=document.getElementById("pimg3");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
    //		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:474px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition=" 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition=" 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
	
}
function shangpin(){
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("addshangpin");
	//得到存图片的div
	var div_img=document.getElementById("pimg1");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:474px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}
//function shangplb(){
////	alert("100");
////	//得到div标题
////	var get_div=document.getElementById("pimg1");
//	//得到新建的div
//	var div_have=document.getElementById("_nav");
//	//得到存图片的div
//	var div_img=document.getElementById("shangpinimg111");
//	//如果是加号则下拉菜单
//	if(div_img.src.match("1j")){
//		//替换图片为减号
//		div_img.setAttribute("src","img/jianhao.png");
//		//设置div标题的样式
////		get_div.setAttribute("style","background-color: blueviolet;");
//	//改变div大小	 background-color: #DF4D4E;
//		var a="overflow:hidden ;width:1168px;height:802px; ";
//		div_have.setAttribute("style",a);
//		div_have.style.transition="height 1s";
//	}
//	//如果是减号则上拉菜单
//	else{
//	
//		//替换图片为加号
//		div_img.setAttribute("src","img/1j.png");
//		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
//		div_have.style.transition="height 1s";
////		div_have.innerHTML="";
////		get_div.setAttribute("style","background-color: #2827B5;");
//	}
//	
//}
function shplb() {
//	alert("100");
//	//得到div标题
//	var get_div=document.getElementById("pimg1");
	//得到新建的div
	var div_have=document.getElementById("splb");
	//得到存图片的div
	var div_img=document.getElementById("shangpinimg111");
	//如果是加号则下拉菜单
	if(div_img.src.match("1j")){
		//替换图片为减号
		div_img.setAttribute("src","img/jianhao.png");
		//设置div标题的样式
//		get_div.setAttribute("style","background-color: blueviolet;");
	//改变div大小	 background-color: #DF4D4E;
		var a="overflow:hidden ;width:1000px;height:802px; ";
		div_have.setAttribute("style",a);
		div_have.style.transition="height 1s";
	}
	//如果是减号则上拉菜单
	else{
	
		//替换图片为加号
		div_img.setAttribute("src","img/1j.png");
		div_have.setAttribute("style","height: 0px;width: 0px; overflow: hidden;");
		div_have.style.transition="height 1s";
//		div_have.innerHTML="";
//		get_div.setAttribute("style","background-color: #2827B5;");
	}
	
}